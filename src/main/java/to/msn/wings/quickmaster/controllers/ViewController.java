package to.msn.wings.quickmaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ViewController {

	@GetMapping("view/html")
	public String html(Model model) {
        model.addAttribute("message",
		"<h1>こんにちは</h1>" + "<span><a href='https://spring.io/projects/spring-boot/'>Spring Boot!!</a></span>");
	     return "view/html";
	}

	@GetMapping("view/classappend")
	public String classappend() {
		return "view/classappend";
	}

    @GetMapping("/view/i18n")
    public String i18n(Model model) {
         model.addAttribute("main", "main");
         return "view/i18n";
    }
}
