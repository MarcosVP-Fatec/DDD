package edu.fatecsjc.lp2.domain.Perfil;

import java.util.LinkedList;
import java.util.List;

import edu.fatecsjc.lp2.domain.Video.Video;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
 * @ Perfil que a assinatura gera. Podem existir v�rios para cada assinatura
 *
 */
public class Perfil {

	String descricao;
	List<Video> queroAssistir = new LinkedList<Video>();

	public Perfil(String _descricao) {
		setDescricao(_descricao);
	}

	/**
	 * @Verifica se o video j� est� no perfil
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
	 * Adiciona um v�deo a lista queroAssistir
	 */
	public void addVideo(Video _video) {
		if (!isVideoCadastrado(_video.getTitulo())) {
			getQueroAssistir().add(_video);
		}
	}

	/**
	 * Remove um v�deo a lista queroAssistir
	 */
	public void removeVideo(Video _video) {

		if (isVideoCadastrado(_video.getTitulo())) {
			getQueroAssistir().remove(_video);
		}
	}

}
