package lat.futuredevelopers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lat.futuredevelopers.beans.HelloWorld;

@Controller
public class ControladorHola {
	
	@Autowired
	HelloWorld helloWorld;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("HelloWorld", helloWorld.getMensaje());
		return "home";
	}
	
}
