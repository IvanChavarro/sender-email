package com.example.demo.service;

import com.example.demo.DTO.MailSenderDTO;

public interface SendMailService {
	public void sendMail(MailSenderDTO senderDTO) throws Exception;
}
