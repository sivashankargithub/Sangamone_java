package pkg1.MailSend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailCon {
	@Autowired
	MailService mailService;
	
	@PostMapping("/sendMail")
	public String sendMail(@RequestBody MailModel mailModel) {
		mailService.sendMail(mailModel);
		return "Mail Sent Successfully";
		
	}
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
