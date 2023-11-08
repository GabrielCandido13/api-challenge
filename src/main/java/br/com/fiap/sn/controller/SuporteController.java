package br.com.fiap.sn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.sn.dto.RequisicaoNovoSuporte;
import br.com.fiap.sn.model.Suporte;
import br.com.fiap.sn.repository.SuporteRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/suporte")
public class SuporteController {
	
	@Autowired
	private SuporteRepository suporteRepository;

	@GetMapping("/formularioSuporte")
	public ModelAndView formularioSuporte(RequisicaoNovoSuporte requisicao) {
		ModelAndView mv = new ModelAndView("suporte/formularioSuporte");
		return mv;
	}
	
	@PostMapping("/novo")
	public ModelAndView novo(@Valid RequisicaoNovoSuporte requisicao, BindingResult result) {
		ModelAndView mv;
		if (result.hasErrors()) {
			mv = new ModelAndView("suporte/formularioSuporte");
			return mv;
		}
		Suporte suporte = new Suporte(requisicao);
		suporteRepository.save(suporte);
		mv = new ModelAndView("redirect:/home");
		return mv;
	}
}