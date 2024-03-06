package pkg1.MailSend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
@Service
public class MailService {
	@Autowired
	private JavaMailSender sender;
	
	@Autowired
	@Value("${spring.mail.username}")
	private String fromMail;
	
	
	@PostMapping("/mailSend")
	public void sendMail(MailModel mailModel) {
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setFrom(fromMail);
		smm.setTo(mailModel.getToMail());
		smm.setSubject(mailModel.getSubject());
		smm.setText(mailModel.getMessage());
		sender.send(smm);
	}
}
