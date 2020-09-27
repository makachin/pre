package to.msn.wings.quickmaster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import to.msn.wings.quickmaster.model.BookRepository;

@Controller
public class HelloController {

	private BookRepository rep;

	@Autowired
	public HelloController(BookRepository rep) {
		this.rep = rep;
	}

	@GetMapping("/hellow")
	@ResponseBody
	public String index() {
		return "こんにちは,世界！";
	}

	@GetMapping("/hellow2")
	@ResponseBody
	public String index2() {
		return "こんにちは,世界2！";
	}

	@GetMapping("/hellow3")
	@ResponseBody
	public String index3() {
		return "こんにちは,世界3！";
	}

	@GetMapping("/greet")
	public String greet(Model model) {
		model.addAttribute("message","こんにちは、世界！");
		return "greet";
	}

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("books",rep.findAll());
		return "list";
	}
}
