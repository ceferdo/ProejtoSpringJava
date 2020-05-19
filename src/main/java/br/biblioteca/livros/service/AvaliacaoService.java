package br.biblioteca.livros.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.biblioteca.livros.model.Avaliacao;
import br.biblioteca.livros.repository.AvaliacaoRepository;

public class AvaliacaoService {
	@Autowired
	AvaliacaoRepository avaliacaoRepository;
	
	public Long salvaAvaliacao(Long id, Avaliacao avaliacao) {
		return avaliacaoRepository.save(avaliacao).getId();
	}
}
