package br.com.fiap.sn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.sn.dto.RequisicaoNovoInteracao;
import br.com.fiap.sn.model.Interacao;
import br.com.fiap.sn.repository.InteracaoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/interacao")
public class InteracaoController {
	
	@Autowired
	private InteracaoRepository interacaoRepository;

	@GetMapping("/formulario")
	public ModelAndView formulario(RequisicaoNovoInteracao requisicao) {
		ModelAndView mv = new ModelAndView("interacao/formulario");
		return mv;
	}
	
	@PostMapping("/novo")
	public ModelAndView novo(@Valid RequisicaoNovoInteracao requisicao, BindingResult result) {
		ModelAndView mv;
		if (result.hasErrors()) {
			mv = new ModelAndView("interacao/formulario");
			return mv;
		}
		Interacao interacao = new Interacao(requisicao);
		interacaoRepository.save(interacao);
		mv = new ModelAndView("redirect:/home");
		return mv;
	}
}

