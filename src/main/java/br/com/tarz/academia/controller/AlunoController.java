package br.com.tarz.academia.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tarz.academia.resource.AlunoResource;
import br.com.tarz.academia.service.AlunoService;

@Controller
@RequestMapping(value = "/aluno")
public class AlunoController {

	@Autowired
	AlunoService alunoService;
	
	public static final Logger LOG = Logger.getLogger(AlunoController.class.getName());

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<AlunoResource> save(@RequestBody @Valid AlunoResource resource) {
		LOG.info("AlunoController -> save() : START");
		resource = alunoService.salvarAluno(resource);
		return new ResponseEntity<AlunoResource>(resource, HttpStatus.CREATED);
	}
	
}
