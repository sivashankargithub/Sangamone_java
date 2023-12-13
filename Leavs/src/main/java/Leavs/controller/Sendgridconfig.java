package Leavs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Sendgridconfig {
	@Value("$(sendgrid.key)")
	private String key;
}
