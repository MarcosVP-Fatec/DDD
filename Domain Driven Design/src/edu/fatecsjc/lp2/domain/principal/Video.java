package edu.fatecsjc.lp2.domain.principal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
 * @Vídeo
 *
 */
public class Video {

	String titulo;
	String autor;
	Categoria[] categoria;
	Long tempo;
	int anoDeLancamento;
	boolean disponivel;
	
	public Video(String titulo, Long tempo, int anoDeLancamento, String autor, boolean disponivel, Categoria[] categoria)
	{
		this.setTitulo(titulo);
		this.setTempo(tempo);
		this.setAnoDeLancamento(anoDeLancamento);
		this.setAutor(autor);
		this.setDisponivel(disponivel);
		this.setCategoria(categoria);
	}
	
}
