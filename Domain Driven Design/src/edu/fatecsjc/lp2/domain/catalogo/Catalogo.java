package edu.fatecsjc.lp2.domain.Catalogo;

import java.util.ArrayList;
import java.util.List;

import edu.fatecsjc.lp2.domain.Video.Video;

/**
 * Objeto que armazena todos os v�deos dispon�veis
 * 
 */
public class Catalogo {

	List<Video> videos = new ArrayList<Video>();

	/**
	 * @param Video
	 * @return Video se encontrou ou null se n�o encontrou
	 */
	public Video pesquisaVideo(String _titulo) {
		for (Video temp : videos) {
			if (temp.getTitulo().toUpperCase().equals(_titulo.toUpperCase())) {
				return temp;
			}
		}
		return null;
	}

	/**
	 * Adiciona um v�deo ao cat�logo
	 * 
	 */
	public void addVideo(Video _video) {
		if (pesquisaVideo(_video.getTitulo()) == null) {
			videos.add(_video);
		}
	}

	/**
	 * Exclui um v�deo do cat�logo
	 * 
	 */
	public void delVideo(Video _video) {
		if (pesquisaVideo(_video.getTitulo()) != null) {
			videos.remove(_video);
		}
	}

}
