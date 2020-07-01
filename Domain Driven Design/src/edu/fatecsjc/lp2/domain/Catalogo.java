/**
 * 
 */
package edu.fatecsjc.lp2.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Objeto que armazena todos os vídeos disponíveis
 * 
 */
public class Catalogo {
	
	List<Video> videos = new ArrayList<Video>();
	
	/**
	 * @param Video
	 * @return Video se encontrou ou null se não encontrou
	 */
	public Video pesquisaVideo( String _titulo ) {
		for (Video temp : videos) {
			if (temp.getTitulo().toUpperCase().equals(_titulo.toUpperCase())) {
				return temp;
			}
		}
    	return null;
	}
	
	/**
	 * Adiciona um vídeo ao catálogo
	 * 
	 */
	public void addVideo( Video _video) {
		if ( pesquisaVideo( _video.getTitulo() ) == null ) {
			videos.add( _video );
		}
	}
	
	/**
	 * Exclui um vídeo do catálogo
	 * 
	 */
	public void delVideo( Video _video) {
		if ( pesquisaVideo( _video.getTitulo() ) != null ) {
			videos.remove(_video);
		}
	}
	
	

}
