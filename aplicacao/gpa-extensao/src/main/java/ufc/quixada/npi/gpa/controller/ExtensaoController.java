package ufc.quixada.npi.gpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExtensaoController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
