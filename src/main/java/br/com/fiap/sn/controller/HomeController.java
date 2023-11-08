package br.com.fiap.sn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.sn.model.Interacao;
import br.com.fiap.sn.repository.InteracaoRepository;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private InteracaoRepository interacaoRepository;
	
	@GetMapping
	public ModelAndView home() {
		List<Interacao> interacoes = interacaoRepository.findAll();
		ModelAndView mv = new ModelAndView("home");
	    mv.addObject("interacoes", interacoes);
	    return mv;
	}
	
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ModelAndView onError() {
		ModelAndView mv = new ModelAndView("redirect:/home");
		return mv;
	}
	
}

