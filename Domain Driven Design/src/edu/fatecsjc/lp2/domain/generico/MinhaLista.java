package edu.fatecsjc.lp2.domain.generico;

import java.util.LinkedList;

import lombok.Setter;
import lombok.Getter;

import edu.fatecsjc.lp2.domain.principal.Video;

@Getter
@Setter

public class MinhaLista 
{
	
	LinkedList<Video> lista;
	
	public MinhaLista()
	{
		this.setLista(new LinkedList<Video>());
	}
	
	public Boolean addVideo( Video video )
	{
		for(Video temp : this.lista)
		{
			if(temp.getTitulo().toUpperCase().equals(video.getTitulo().toUpperCase()))
			{
				this.lista.add(video);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean removerVideo( Video video )
	{
		if(this.pesquisarVideoPorTitulo( video.getTitulo() ) != null)
		{
			this.lista.remove(video);
		}
		
		return false;
	}
	
	public Video pesquisarVideoPorTitulo( String titulo )
	{
		for(Video temp : this.lista)
		{
			if(temp.getTitulo().toUpperCase().contentEquals(titulo.toUpperCase()))
			{
				return temp;
			}
		}
		
		return null;
	}
	
}
