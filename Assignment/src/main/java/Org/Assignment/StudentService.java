package Org.Assignment;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    List<Student> getFilteredStudents(String filterCriteria);
	void addStudent(Student student);
}
