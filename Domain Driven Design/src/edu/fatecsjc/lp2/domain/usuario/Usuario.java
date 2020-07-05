package edu.fatecsjc.lp2.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

import edu.fatecsjc.lp2.domain.Perfil.Perfil;
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
	List<Perfil> perfis;

	public Usuario(String _nome, String _senha, String _email) {

		setNome(_nome);
		setSenha(_senha);
		setEmail(_email);
		setPerfis(new ArrayList<Perfil>());

	}

	public void addPerfil(Perfil _perfil) {
		getPerfis().add(_perfil);
	}

	public void removedPerfil(Perfil _perfil) {
		getPerfis().remove(_perfil);
	}
}
