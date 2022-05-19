package com.example.demo.service;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.MailSenderDTO;

@Service
public class SendMailServiceImpl implements SendMailService {
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendMail(MailSenderDTO senderDTO) throws Exception {
		/*
		 * MimeMessage message = javaMailSender.createMimeMessage();
		 * 
		 * 
		 * MimeMessageHelper helper = new MimeMessageHelper(message, true);
		 * helper.setTo(senderDTO.getPara()); helper.setSubject(senderDTO.getAsunto());
		 * helper.setText(String.format(senderDTO.getMensaje()));
		 * 
		 * 
		 * javaMailSender.send(message);
		 */
		try {
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo(senderDTO.getPara());
			mailMessage.setSubject(senderDTO.getAsunto());
			mailMessage.setText(senderDTO.getMensaje());

			javaMailSender.send(mailMessage);

		} catch (Exception e) {
			throw new Exception();
		}

	}

}
