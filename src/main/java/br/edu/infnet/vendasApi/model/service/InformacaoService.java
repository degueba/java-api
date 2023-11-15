package br.edu.infnet.vendasApi.model.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vendasApi.model.domain.Informacao;
import br.edu.infnet.vendasApi.model.repository.InformacaoRepository;


@Service
public class InformacaoService {

	@Autowired
	private InformacaoRepository informacaoRepository;

	public List<Informacao> obterLista(Informacao informacao){
		return null;
	}
	
	public void incluir(Informacao informacao) {
		informacaoRepository.save(informacao);
	}
	
}