package com.dev.charlante.cadastroapp.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.charlante.cadastroapp.models.ToItemMoldel;
import com.dev.charlante.cadastroapp.repositories.ToItemRepository;


import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ToFormController {

	private final Logger logger = LoggerFactory.getLogger(ToFormController.class);

	@Autowired
	private ToItemRepository toItemRepository;
	

	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id")long id, Model model) {
		
		logger.info("request para acessar a página de atualização");
		
		ToItemMoldel toItem = toItemRepository
				.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Item id: " + id + " Não encontrado"));
		
		model.addAttribute("todo", toItem);
		
		return "update-todo-item";
		
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteToItem(@PathVariable("id")long id, Model model) {
		
		logger.info("request para acessar a página de exclusão");
		
		ToItemMoldel toItem = toItemRepository
				.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Item id: " + id + " Não encontrado"));
		
		toItemRepository.delete(toItem);
		
		return "redirect:/";
		
	}
	
	
	
	
	
}
