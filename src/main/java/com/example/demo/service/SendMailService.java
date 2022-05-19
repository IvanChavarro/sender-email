package com.example.demo.service;

import javax.mail.MessagingException;

import com.example.demo.DTO.MailSenderDTO;

public interface SendMailService {
	public void sendMail(MailSenderDTO senderDTO) throws MessagingException;
}
