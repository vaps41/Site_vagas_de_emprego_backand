package com.appRH.APPRH.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.appRH.APPRH.models.VagaDTO;
import com.appRH.APPRH.models.vaga;
import com.appRH.APPRH.repository.VagaRepository;


@Controller
public class VagaController {
	@Autowired
	private VagaRepository vr;
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String ModelAndView() {
		return "vaga/index";
	}
	
	
	//Cadastra Vaga
	@RequestMapping(value = "/cad/cadastrarVaga", method=RequestMethod.GET)
	public String forms() {
		return "vaga/pages/formvaga";
		
	}
	
	@RequestMapping(value = "/cad/cadastrarVag", method = RequestMethod.POST)
	public String form(@Valid VagaDTO vagaDTO, BindingResult result, RedirectAttributes attributes) {
		
		vaga vaga = vagaDTO.converter();
		
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Verificar os campos...");
			return "redirect:/cad/cadastrarVaga";
			
		}
		vr.save(vaga);
		attributes.addFlashAttribute("mensagem", "Vaga cadastrada com sucesso!");
		return "redirect:/cad/cadastrarVaga";
				
	}
	
	//Lista Vagas
	@RequestMapping("/lista/listar_Vagas")
	public ModelAndView listaVagas() {
		ModelAndView mv = new ModelAndView("vaga/pages/listaVaga");
		Iterable<vaga>vagas=vr.findAll();
		mv.addObject("vagas", vagas);
		return mv;
		
	}
	//Trazer vagas do banco
	//Detalhes da vaga
	@RequestMapping(value ="/cod/{codigo}", method = RequestMethod.GET)
	public ModelAndView detalhesVaga(@PathVariable("codigo") long codigo) {
		vaga vaga = vr.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("vaga/pages/detalhesVaga");
		mv.addObject("vaga", vaga);
		return mv;
	}
	
	//Deletar vaga
	@RequestMapping("/del/deletarVaga")
	public String deletarVaga(long codigo) {
		vaga vaga = vr.findByCodigo(codigo);
		vr.delete(vaga);
		return "redirect:/lista/listar_Vagas";
	}
	


	//Editar vaga
	@RequestMapping(value="edit/editarVaga", method = RequestMethod.GET)
	public ModelAndView editarVaga(long codigo) {
		vaga vaga=vr.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("vaga/pages/update_vaga");
		mv.addObject("vaga",vaga);
		return mv;
		
	}
	//Update vaga
	@RequestMapping(value="/editarVaga", method = RequestMethod.POST)
	public String UpdateVaga(@Valid vaga vaga, BindingResult result, RedirectAttributes attributes) {
		vr.save(vaga);
		attributes.addFlashAttribute("sucess", "Vaga alterada com sucesso!");
		
		long codigoLong=vaga.getCodigo();
		String codigo=""+ codigoLong;
		return "redirect/"+codigo;
	}
	
	
	
}
