package Leavs.email;

import java.time.LocalDate;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailService3 {
	public static void leaverequest(LocalDate from_date,
	LocalDate to_date,
	String details,
	String status, 
	int requested_by,
	int approved_by) {
		
		String from = "suhasacharyag.sangamone@gmail.com";
		String pass="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";
		//String to =email;
		String host="smtp.sendgrid.net";
		
		String cc= "ckuthyar@gmail.com,riteshkumaryadav.sangamone@gmail.com,laluprasaddash23.sangamone@gmail.com";
		
		Properties prop = System.getProperties();
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", host);
   	    prop.put("mail.smtp.user", from);
   	    prop.put("mail.smtp.password", pass);
   	    prop.put("mail.smtp.port", "465");
	
	    Session session = Session.getDefaultInstance(prop);
	    try{
	   	      MimeMessage message1 = new MimeMessage(session);
	   	      message1.setFrom(new InternetAddress(from));
	   	      //message1.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	   	      message1.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc));
	   	      message1.setSubject("Leave Management System");
	   	   message1.setContent(
	   	    		"<body>"+
	   	    		  "<div style='margin:25px;'>"+
	   	    		  "<p>Dear <b><span style='font-size: 15px;'>"+from_date+",</span> </b></p>" +
	   	    		  "<p>Your Student registration has been done</p>"+
	   	    		  "<p><b>Company:"+to_date+"</b></p>"+
	   	    		  "<p>User Email: <b>"+details+"</b></p>"+
	   	    		  "<p>ContactNo: <b>"+status+"</b></p>"+
	   	    		 "<p>Grade: <b>"+requested_by+"</b></p>"+
	   	    		  "<p>Message: <b>"+approved_by+" </b></p>"+
	   	    		"</div"+
	   	    		  "</body>" ,"text/html");
	   	  Transport transport = session.getTransport("smtp");
 	      transport.connect(host, from, pass);
 	      transport.sendMessage(message1, message1.getAllRecipients());
 	      transport.close();
 	      }catch (MessagingException e) {
 	      e.printStackTrace();	
 	      }
		 catch (Exception e) {
		  e.printStackTrace();
		}
	}
}
