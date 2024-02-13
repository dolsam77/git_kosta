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
	
	@GetMapping("/hello3")
	public String hello3() {
		return "Hello3!!!";
	}
	@GetMapping("/hello4")
	public String hello4() {
		return "Hello4!!!";
	}
}
