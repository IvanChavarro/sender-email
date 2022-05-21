package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.MailSenderDTO;
import com.example.demo.service.SendMailService;
/**
 * 
 * @author Iván David Chavarro Durán
 *
 */
@RestController
@RequestMapping(value = "/sendMail")
public class SendMailController {

	@Autowired
	private SendMailService service;
/**
 * Implementacion del metodo abstracto encargado de enviar el correo segun los datos de entrada
 * @param dto son los datos de entrada para enviar el correo
 * @return la respuesta de la peticion
 */
	@PostMapping
	public ResponseEntity<?> sendMail(@RequestBody MailSenderDTO dto) throws Exception {
		service.sendMail(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
}
