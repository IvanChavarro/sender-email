package com.example.demo.service;

import com.example.demo.DTO.MailSenderDTO;

/**
 * 
 * @author Iván David Chavarro Durán
 *
 */
public interface SendMailService {
	/**
	 * Metodo abstracto utilizado para enviar correos
	 * 
	 * @param senderDTO son los parametros para enviar el correo
	 */
	public void sendMail(MailSenderDTO senderDTO) throws Exception;
}
