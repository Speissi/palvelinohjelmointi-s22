package chapter2.part3.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import chapter2.part3.domain.Friend;

@Controller
public class FriendsController {
	
	private List<Friend> friends = new ArrayList<Friend>();
	
	@GetMapping("/index")
	public String friendsList(Model model) {	
		model.addAttribute("friends", friends);
		model.addAttribute("friend", new Friend());
		return "index";
	}
	
	@PostMapping("/index")
	public String submitFriend(@ModelAttribute Friend friend, Model model) {	
		friends.add(friend);
		return "redirect:/index";
	}

}
