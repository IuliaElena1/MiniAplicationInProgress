
package studentInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsInfoImpl implements StudentsInfo {

	private List<Student> students = new ArrayList<Student>();
	private List<String> schools = new ArrayList<>();
	private Map<School, Integer> schoolStudents = new HashMap<School, Integer>();

	@Override
	public void addStudent(String name, double average, int year, int from, School school) {
		Student nameStudent = getStudentByName(name);
		if (nameStudent == null) {
			nameStudent = new Student(name, year, from, school, average);
			students.add(nameStudent);

		}

	}

	private Student getStudentByName(String name) {
		for (Student student : students) {
			if (student.hasName(name)) {
				return student;
			}
		}
		return null;
	}

	@Override
	public void addStudent(String name, double average) {

		Student nameStudent = getStudentByName(name);

		if (nameStudent == null) {
			nameStudent = new Student(name);
			students.add(nameStudent);
		}
	}

	@Override

	public List<String> getStudentsInTerminalYears() {
		List<String> studentFromTerminalYear = new ArrayList<>();

		for (Student student : students) {
			if (student.getStudentsByYear()) {
				studentFromTerminalYear.add(student.toString());
			}
		}

		return studentFromTerminalYear;

	}

	@Override
	public List<String> getStudentsBySchool(School school) {

		for (Student student : students) {
			if (student.getStudentBySchool(school)) {
				schools.add(student.toString());
			}
		}

		return schools;
	}

	@Override
	public Map<School, Integer> getStudentsGroupBySchool() {

		for (Student student : students) {
			if (schoolStudents.get(student.getSchool()) == null) {
				schoolStudents.put(student.getSchool(), 1);
			} else {
				int number = schoolStudents.get(student.getSchool()) + 1;
				schoolStudents.put(student.getSchool(), number);
			}

		}

		return schoolStudents;

	}

	@Override
	public Map<School, Integer> getStudentsPercentsGroupBySchool() {
		Map<School, Integer> studentPercentBySchool = getStudentsGroupBySchool();

		int totalStudents = 0;

		for (School school : studentPercentBySchool.keySet()) {
			totalStudents += studentPercentBySchool.get(school);

		}

		for (School school : studentPercentBySchool.keySet()) {
			studentPercentBySchool.put(school,
					(int) (((double) studentPercentBySchool.get(school) / totalStudents) * 100));

		}

		return studentPercentBySchool;

	}

	public static void main(String[] args) {
		StudentsInfoImpl si = new StudentsInfoImpl();

		// String name, double average, int year, int from, School school

		si.addStudent("Gina", 8.7, 4, 5, School.UVT);
		si.addStudent(" \nGica", 7, 4, 4, School.UPT);
		si.addStudent(" \nAna", 7.8, 1, 4, School.UVT);
		si.addStudent(" \nMaria", 8.9, 3, 4, School.UPT);
		si.addStudent(" \nMara", 0, 0, 0, School.UNDEFINED);
		si.addStudent(" \nCosti", 9, 2, 4, School.UPT);

		System.out.println(si.students);
		System.out.println("\nGet students in terminal years");
		System.out.println(si.getStudentsInTerminalYears());

		System.out.println("Get students by school: ");
		System.out.println(si.getStudentsBySchool(School.UPT));

		System.out.println("\nGet students group by school");
		System.out.println(si.getStudentsGroupBySchool());

		System.out.println(("\nPercentge of students by school"));
		System.out.println(si.getStudentsPercentsGroupBySchool());

	}

}
