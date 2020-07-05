package edu.fatecsjc.lp2.domain.Video;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

/**
 * @V�deo
 *
 */
public class Video {

	String titulo;
	String autor;
	String categorias;
	Long tempo;
	int anoDeLancamento;
	boolean disponivel;
}
