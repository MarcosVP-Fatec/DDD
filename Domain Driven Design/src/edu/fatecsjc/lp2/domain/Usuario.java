package edu.fatecsjc.lp2.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
 * @Usuário do sistema, conforme assinaturas.
 *
 */
public class Usuario {
	
	String nome;
	String senha;
	String email;
	List<Perfil> perfis = new ArrayList<Perfil>();
	
	public Usuario( String _nome ,
			        String _senha,
			        String _email) {
		
		setNome( _nome );
		setSenha( _senha );
		setEmail( _email );
		
	}
	
	public void addPerfil( Perfil _perfil ) {
		getPerfis().add(_perfil);
	}

	public void removedPerfil( Perfil _perfil ) {
		getPerfis().remove(_perfil);
	}
}
