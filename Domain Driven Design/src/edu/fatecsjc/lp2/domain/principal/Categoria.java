package edu.fatecsjc.lp2.domain.principal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Categoria {

	String titulo;
	
	public Categoria(String titulo)
	{
		this.setTitulo(titulo);
	}
	
}
