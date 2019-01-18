package br.com.danilo.teste.calculo.ws.service;

import org.springframework.stereotype.Service;

@Service
public class EfetuaCalculoService {
	
	public Double calcularTaxa(Double limiteCredito, Integer porcentagemTaxa ) {
		return limiteCredito + (limiteCredito * porcentagemTaxa) / 100;
	}

}
