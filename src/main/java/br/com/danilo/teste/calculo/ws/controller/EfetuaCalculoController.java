package br.com.danilo.teste.calculo.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilo.teste.calculo.ws.service.EfetuaCalculoService;

@RestController
@RequestMapping("/calculos")
@CrossOrigin(origins = "http://localhost:3000")
public class EfetuaCalculoController {
	
	@Autowired
	private EfetuaCalculoService calculoService;
	
    @GetMapping
    public Double calcularTaxa(@RequestParam("credito") Double limiteCredito, @RequestParam("taxa") Integer porcentagemTaxa) {
    	return calculoService.calcularTaxa(limiteCredito, porcentagemTaxa);
    }

}
