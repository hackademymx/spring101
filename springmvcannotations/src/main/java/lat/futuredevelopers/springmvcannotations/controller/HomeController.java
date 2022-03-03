package lat.futuredevelopers.springmvcannotations.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lat.futuredevelopers.springmvcannotations.beans.HelloWorld;

@Controller
public class HomeController {

	@Autowired
	HelloWorld helloWorld;
	
	@RequestMapping(value="/")
	public ModelAndView test(ModelMap model) throws IOException{
		model.addAttribute("HelloWorld",helloWorld.getMensaje());
		return new ModelAndView("home");
	}
}
