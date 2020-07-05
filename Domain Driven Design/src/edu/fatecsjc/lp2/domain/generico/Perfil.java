package edu.fatecsjc.lp2.domain.generico;

import java.util.LinkedList;
import java.util.List;

import edu.fatecsjc.lp2.domain.principal.Video;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
 * @ Perfil que a assinatura gera. Podem existir vários para cada assinatura
 *
 */
public class Perfil {

	String descricao;
	List<Video> queroAssistir = new LinkedList<Video>();

	public Perfil(String _descricao) {
		setDescricao(_descricao);
	}

	/**
	 * @Verifica se o video já está no perfil
	 * @param String titulo
	 */
	public boolean isVideoCadastrado(String _titulo) {
		for (Video video : queroAssistir) {
			if (video.getTitulo().toUpperCase().equals(_titulo.toUpperCase())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Adiciona um vídeo a lista queroAssistir
	 */
	public void addVideo(Video _video) {
		if (!isVideoCadastrado(_video.getTitulo())) {
			getQueroAssistir().add(_video);
		}
	}

	/**
	 * Remove um vídeo a lista queroAssistir
	 */
	public void removeVideo(Video _video) {

		if (isVideoCadastrado(_video.getTitulo())) {
			getQueroAssistir().remove(_video);
		}
	}

}
