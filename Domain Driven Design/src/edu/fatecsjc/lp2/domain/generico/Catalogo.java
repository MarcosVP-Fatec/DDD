package edu.fatecsjc.lp2.domain.generico;

import java.util.ArrayList;
import java.util.List;

import edu.fatecsjc.lp2.domain.principal.Video;

/**
  * Objeto que armazena todos os vídeos disponíveis
  * 
  **/
public class Catalogo {

	List<Video> videos = new ArrayList<Video>();

	/**
	  * @param Video
	  * @return Video se encontrou ou null se não encontrou
	  **/
	
	public Video pesquisaVideoPorTitulo(String titulo) 
	{
		for (Video temp : this.videos) 
		{
			if (temp.getTitulo().toUpperCase().equals(titulo.toUpperCase())) 
			{
				return temp;
			}
		}
		return null;
	}

	/**
	  * Adiciona um vídeo ao catálogo
	  * 
	  **/
	public void addVideo(Video video) 
	{
		if (pesquisaVideoPorTitulo(video.getTitulo()) == null) 
		{
			this.videos.add(video);
		}
	}

	/**
	  * Exclui um vídeo do catálogo
	  * 
	  **/
	public void delVideo(Video video) 
	{
		if (pesquisaVideoPorTitulo(video.getTitulo()) != null) 
		{
			videos.remove(video);
		}
	}

}
