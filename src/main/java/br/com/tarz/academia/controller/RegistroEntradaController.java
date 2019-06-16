package br.com.tarz.academia.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.tarz.academia.entity.Aluno;
import br.com.tarz.academia.repository.AlunoRepository;

@Controller
public class RegistroEntradaController {

	@Autowired
	private AlunoRepository ar;
	
	@RequestMapping("/registrarEntrada/{id}")
	public String registrarEntrada(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("registrarEntrada.html");
		Aluno aluno = ar.findById(id);
//		buscar matricula
		
		
		Date d = new Date();	
		if(d.after(new Date())) {
//			matricula vencida
		}else {
//			matricula valida
		}
		
//		if matricula.getDataValidade
		return "registrar.html";
	}
	
}
