package chapter2.part1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicController {
	
	@RequestMapping("hello")
	public String helloResponse(@RequestParam(name="name") String name, @RequestParam(name="age") String age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "hello";
	}
	
}
