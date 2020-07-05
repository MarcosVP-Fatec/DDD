package edu.fatecsjc.lp2.domain.principal;

import java.util.ArrayList;
import java.util.List;

import edu.fatecsjc.lp2.domain.generico.Perfil;
import edu.fatecsjc.lp2.domain.generico.MinhaLista;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
  * @Usuário do sistema, conforme assinaturas.
  *
  **/
public class Usuario {

	String nome;
	String senha;
	String email;
	List<Perfil> perfis;
	MinhaLista lista;

	public Usuario(String nome, String senha, String email, List<Perfil> perfil, MinhaLista lista) 
	{
		this.setNome(nome);
		this.setSenha(senha);
		this.setEmail(email);
		this.setPerfis((perfil != null) ? perfil : new ArrayList<Perfil>());
		this.setLista((lista != null) ? lista : new MinhaLista());
	}

	public void addPerfil(Perfil perfil) 
	{
		this.getPerfis().add(perfil);
	}

	public void removedPerfil(Perfil perfil) 
	{
		this.getPerfis().remove(perfil);
	}
}
