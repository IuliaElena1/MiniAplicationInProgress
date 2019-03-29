
package studentInfo;

import java.util.HashMap;
import java.util.Map;

public class Student {

	private String name;
	private int inYear;
	private int totalYear;
	private School school;
	private double average;
	private Map<School, Integer> schoolStudents = new HashMap<School, Integer>();

	public boolean hasName(String name2) {
		return this.name.equals(name2);
	}

	public Student(String name, int year, int from, School school2, double average) {
		super();
		this.name = name;
		this.inYear = year;
		this.totalYear = from;
		this.school = school2;
		this.average = average;
	}

	public Student() {
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getInYear() {
		return inYear;
	}

	public int getTotalYear() {
		return totalYear;
	}

	public School getSchool() {
		return school;
	}

	public double getAverage() {
		return average;
	}

	@Override
	public String toString() {
		return name + "\n ->In year" + inYear + " --from->" + totalYear + " --at school->" + school + "--average -> "
				+ average;
	}

	public boolean getStudentsByYear() {
		return getInYear() == getTotalYear();
	}

	public boolean getStudentBySchool(School school2) {
		return this.school.equals(school2);
	}

	public Map<School, Integer> putInMap(Student std, int count) {
		count = 0;
		schoolStudents.put(this.school, count++);

		return schoolStudents;

	}
}
