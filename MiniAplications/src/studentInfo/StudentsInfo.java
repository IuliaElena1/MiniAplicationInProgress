/*
 * Copyright (c) 2019 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package studentInfo;

import java.util.List;
import java.util.Map;

public interface StudentsInfo {

	public void addStudent(String name, double average, int year, int from, School school);

	public void addStudent(String name, double average);

	public List<String> getStudentsInTerminalYears();

	public List<String> getStudentsBySchool(School school);

	public Map<School, Integer> getStudentsGroupBySchool();

	public Map<School, Integer> getStudentsPercentsGroupBySchool();

}
