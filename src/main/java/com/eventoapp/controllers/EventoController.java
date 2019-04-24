package com.eventoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eventoapp.models.Evento;
import com.eventoapp.repository.EventoRepository;

@Controller
//@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	private EventoRepository er;

	@RequestMapping(value = "/cadastrarEvento", method=RequestMethod.GET)
	public String form() {
//		return "formEvento";
		return "formEvento";
	}

	@RequestMapping(value = "/cadastrarEvento", method=RequestMethod.POST)
	public String form(Evento evento) {

		er.save(evento);
			
		//return "redirect:/listaEvento";
		return "redirect:/cadastrarEvento";
	}
	
	@RequestMapping("/eventos")
	public ModelAndView ListaEventos() {
		// recebe a lista de eventos
		ModelAndView mv = new ModelAndView("index"); // <== para onde sera redirecionada
		//busca lista de eventos no banco de dados
		Iterable<Evento> eventos = er.findAll();
		//"eventos" <= que foi definido na index html => ${eventos}*
		// mostra a lista de eventos na view localhost:8080/eventos
		mv.addObject("eventos", eventos);
		return mv;
	}
}
