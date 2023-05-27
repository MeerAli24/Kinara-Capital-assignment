package Org.Assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/students")
public class StudentController {
	private StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getAllStudents(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "student-list";
	}
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addStudent(@RequestParam String name, @RequestParam int totalMarks) {
        Student student = new Student();
        student.setName(name);
        student.setTotalMarks(totalMarks);
        studentService.addStudent(student);
        return "redirect:/students";
    }

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getStudentById(@PathVariable int id, Model model) {
		Student student = studentService.getStudentById(id);

		model.addAttribute("student", student);

		return "student-details";
	}
}
