package com.sample.EmailController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.EmailServices.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	EmailService es; 
	
	@PostMapping(value="/post")
	public ResponseEntity<String> mail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
		
		es.mail(to, subject, text);
		  return ResponseEntity.ok("Email sent successfully");
	}

}
