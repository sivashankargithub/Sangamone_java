package com.sangamone;

import java.util.Properties;
import java.util.Scanner;

public class JavaMailSender {
	
	public static void main(String[] args) {
		String user="sivashankarchandrappa.sangamone@gmail.com";
		String password="vpvinlmciduimdux";
		String toMail="ckuthyar@gmail.com";
		String subject="Test2";
		String msg="Hello Sir 2";
		String host="smtp.gmail.com";
		String port="587";
		Properties prop=System.getProperties();
		prop.put("mail.smtp.host", host);
		prop.put("mail.smtp.port", port);
		prop.put("mail.smtp.username",user);
		prop.put("mail.smtp.password", password);
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		
		
		Scanner sc1=new Scanner(System.in);
		JavaMailSender sender=new JavaMailSender();
	}

}
