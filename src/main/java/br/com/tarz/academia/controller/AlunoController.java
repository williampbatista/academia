package br.com.tarz.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.tarz.academia.model.Aluno;
import br.com.tarz.academia.repository.AlunoRepository;

@Controller
public class AlunoController {

	@Autowired
	private AlunoRepository ar;

	@RequestMapping(value = "/cadastrarAluno", method = RequestMethod.GET)
	public String form() {
		return "formAluno.html";
	}

	@RequestMapping(value = "/cadastrarAluno", method = RequestMethod.POST)
	public String salvar(Aluno aluno, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Campos vazio!");
			return "redirect:/cadastrarAluno";	
		}
		ar.save(aluno);
		attributes.addFlashAttribute("mensagem", "Aluno salvo com sucesso!");
		return "redirect:/cadastrarAluno";
	}

	@RequestMapping("/alunos")
	public ModelAndView listaAlunos() {
		ModelAndView mv = new ModelAndView("index.html");
		Iterable<Aluno> alunos = ar.findAll();
		mv.addObject("alunos", alunos);
		return mv;
	}
	
	@RequestMapping("/deletar")
	public String deletarAluno(long id) {
		Aluno aluno = ar.findById(id);
		ar.delete(aluno);
		return "redirect:/alunos";
		
	}

	@RequestMapping("/{id}")
	public ModelAndView detalhesAluno(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("detalhesAluno.html");
		Aluno aluno = ar.findById(id);
		mv.addObject("aluno", aluno);
		return mv;

	}

}
