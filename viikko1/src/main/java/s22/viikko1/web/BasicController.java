package s22.viikko1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
	
	@RequestMapping("index")
	@ResponseBody
	public String indexResponse() {
		return "This is the main page";
	}

	@RequestMapping("contact")
	@ResponseBody
	public String contactResponse() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String helloResponse(@RequestParam(name="location") String location, @RequestParam(name="name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
}
