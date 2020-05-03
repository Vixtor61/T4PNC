package com.uca.tarea4.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.tarea4.domain.Producto;

@Controller
public class MainController {
	@RequestMapping("/producto")
	public ModelAndView index11() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("index");
		return mav;
	}	
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
	
		if(result.hasErrors()) { //Hay errores, redirigimos a la pantalla del formulario
			
			mav.setViewName("index");
		}
		else { //Si no hay, flujo normal
			mav.addObject("producto", producto.getNombreProducto());
			
			mav.setViewName("result");
		}
		return mav;
	}

		
}