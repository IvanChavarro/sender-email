package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.MailSenderDTO;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author mpr
 *
 */
@Service
@Slf4j
public class SendMailServiceImpl implements SendMailService {
	/**
	 * Implementacion del servicio utilizado para enviar el mensaje
	 */
	@Autowired
	private JavaMailSender javaMailSender;

	/**
	 * Implementacion del metodo abstracto encargado de enviar el correo
	 * @param senderDTO es el objeto que contiene los parametros de envio de correo
	 */
	@Override
	public void sendMail(MailSenderDTO senderDTO) throws Exception {

		try {
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setFrom("your email");
			mailMessage.setTo(senderDTO.getPara());
			mailMessage.setSubject(senderDTO.getAsunto());
			mailMessage.setText(senderDTO.getMensaje());

			javaMailSender.send(mailMessage);

		} catch (Exception e) {
			log.info("error " + e.toString());
		}

	}

}
