package co.kr.kosta;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello!!!";
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "Hello2!!!";
	}
}
