package com.cibertec.smithtorresT3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.smithtorresT3.model.TB_MEDICOT3;
import com.cibertec.smithtorresT3.service.TB_MEDICOT3Service;

@Controller
public class TB_MEDICOT3Controller {
	
	@Autowired
	private TB_MEDICOT3Service medicot3Service;

	@GetMapping("/web/guardar")
	public String guardar(Model model) {
		try {
			
			model.addAttribute("medico",new TB_MEDICOT3());
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return "guardarMedico.html";
	}
	@GetMapping("/web/actualizar/{id}")
	public String actualizar(
			@PathVariable Integer id,
			Model model) {
		
		TB_MEDICOT3 medico;
		try {
			
			medico = medicot3Service.buscar(id);
			
			model.addAttribute("medico",medico);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return "guardarMedico.html";
	}
	@GetMapping("/eliminar/{id}")
	public String eliminar(
			@PathVariable Integer id,
			Model model,
			RedirectAttributes redirect) {
		
		try {
			
			medicot3Service.eliminar(id);
			
			redirect.addFlashAttribute("mensaje", "* Médico " + id + " eliminado.");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return "redirect:/";
	}
	
	
	@GetMapping("/")
	public String lista(Model model) {
		
		List<TB_MEDICOT3> lista = new ArrayList<>();
		
		try {
			
			lista = medicot3Service.listar();
			
			model.addAttribute("medicos",lista);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return "listaMedicos.html";
	}
	
	@PostMapping("/guardar")
	public String guardar(
			@ModelAttribute TB_MEDICOT3 medico,
			Model model) {
		
		TB_MEDICOT3 medicot3;
		
		try {
			
			System.out.println(medico.toString());
			
			medicot3 = medicot3Service.guardar(medico);
			
			if(medicot3 !=null ) {
				return "redirect:/";
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return "redirect:/web/guardar";
		
	}
	
}
