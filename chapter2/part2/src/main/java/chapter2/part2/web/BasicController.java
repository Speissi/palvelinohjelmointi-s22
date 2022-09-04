package chapter2.part2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import chapter2.part2.domain.Student;

@Controller
public class BasicController {
	
	@RequestMapping("hello")
	public String helloResponse(Model model) {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Kate", "Cole"));
		students.add(new Student("Dan", "Brown"));
		students.add(new Student("Mike", "Mars"));
		
		model.addAttribute("students", students);
		
		return "hello";
	}
	
}
