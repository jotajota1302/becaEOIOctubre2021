package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.es.eoi.dto.EntidadDto;
import edu.es.eoi.service.EntidadService;

@Controller
@RequestMapping("/entidad")
public class EntidadController {
		
	@Autowired
	EntidadService service;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public EntidadDto getEntity(@RequestParam Integer id) {

		return service.findEntidad(id);
		
	}

	
}
