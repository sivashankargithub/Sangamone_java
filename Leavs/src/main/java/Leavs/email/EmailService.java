package Leavs.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService {
	@Autowired
	private JavaMailSender javamailsender;
	
	public void sendEmail(String to,String subject,String body) {
		try {
			SimpleMailMessage message=new SimpleMailMessage();
			message.setTo("sivashankarchandrappa@gmail.com");
			message.setSubject(subject);
			message.setText(body);
			javamailsender.send(message);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
	}

	

}
