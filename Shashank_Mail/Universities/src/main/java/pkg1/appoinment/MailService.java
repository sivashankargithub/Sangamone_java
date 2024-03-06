package pkg1.appoinment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	@Autowired
	private JavaMailSender sender;
	
	@Autowired
	AppoinmentController ac;
	
	
	@Value("${spring.mail.username}")
	private String fromMail;
	 
	public void sendmail() throws Exception{
		List<ObjectModel> list1 = new ArrayList<>();
		List<String> msgs = new ArrayList<>();
		list1=ac.loadData();
		SimpleMailMessage smm = new SimpleMailMessage();
		msgs = ac.method1();
		for(int i=0;i<list1.size();i++) {
			smm.setFrom(fromMail);
			smm.setTo(list1.get(i).getData()[4]);
			smm.setSubject("HR Appointment");
			smm.setText(msgs.get(i));
			sender.send(smm);
		}
		
		
	}
}
