package com.example.demo.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.MailSenderDTO;
import com.example.demo.service.SendMailService;

@RestController
@RequestMapping(value = "/sendMail")
public class SendMailController {

	@Autowired
	private SendMailService service;

	@PostMapping
	public ResponseEntity<?> sendMail(@RequestBody MailSenderDTO dto) throws MessagingException {
		service.sendMail(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
}
