package br.biblioteca.livros.conversor;

import java.util.List;

import br.biblioteca.livros.dto.AvaliacaoDTO;
import br.biblioteca.livros.facade.Avaliacao;

public class AvaliacaoConversor {
	public static Avaliacao toModel(AvaliacaoDTO avaliacaoDTO) {
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setComentario(avaliacaoDTO.getComentario());
		avaliacao.setNota(AvaliacaoDTO.getNota());
		avaliacao.setLivro(livro);
		return avaliacao;
	}
	
	public static Avaliacao toModel(AvaliacaoDTO avaliacaoDTO, Livro livro) {
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setComentario(avaliacaoDTO.getComentario());
		avaliacao.setNota(avaliacaoDTO.getNota());
		avaliacao.setLivro(livro);
		return avaliacao;
	}
	
	public static AvaliacaoDTO toDTO(Avaliacao avaliacao) {
		AvaliacaoDTO dto = new AvaliacaoDTO();
		dto.setComentario(avaliacao.getComentario());
		dto.setNota(avaliacao.getNota());
		return dto;
	}
	
	public static List<AvaliacaoDTO> toDTO(List<Avaliacao> avaliacoes) {
		return Livros.stream().map(l -> toDTO(a)).collect(Collectors.toList());
	}
}
