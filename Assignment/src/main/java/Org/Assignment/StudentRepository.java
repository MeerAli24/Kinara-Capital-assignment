package Org.Assignment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>  {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    List<Student> getFilteredStudents(String filterCriteria);

}
