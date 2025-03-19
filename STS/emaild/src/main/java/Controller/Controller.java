package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.Services;

@RestController
@RequestMapping(value="/email")
public class Controller {
	@Autowired
	Services s;
	@GetMapping("/send-Mail")
	public String sendMail(@RequestParam String to,@RequestParam String subject,@RequestParam String body) {
		return s.sendMail(to,subject,body);
	}
	
}


