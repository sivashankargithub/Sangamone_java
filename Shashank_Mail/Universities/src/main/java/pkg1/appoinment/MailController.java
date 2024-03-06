package pkg1.appoinment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	@Autowired
	MailService mailservice;
	@PostMapping("/sendMail")
	public String sendMail() throws Exception {
		mailservice.sendmail();
		
		return "mail sent successfully";
	}
}

