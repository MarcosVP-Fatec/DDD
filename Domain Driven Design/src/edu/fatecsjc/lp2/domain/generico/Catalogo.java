package edu.fatecsjc.lp2.domain.generico;

import java.util.ArrayList;
import java.util.List;

import edu.fatecsjc.lp2.domain.principal.Video;

/**
  * Objeto que armazena todos os v�deos dispon�veis
  * 
  **/
public class Catalogo {

	List<Video> videos = new ArrayList<Video>();

	/**
	  * @param Video
	  * @return Video se encontrou ou null se n�o encontrou
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
	  * Adiciona um v�deo ao cat�logo
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
	  * Exclui um v�deo do cat�logo
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
