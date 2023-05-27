package Org.Assignment;

import java.util.List;

public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.getAllStudents();
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.getStudentById(id);
	}

	@Override
	public List<Student> getFilteredStudents(String filterCriteria) {
		return studentRepository.getFilteredStudents(filterCriteria);
	}
}
