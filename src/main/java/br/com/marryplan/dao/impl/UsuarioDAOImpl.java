package br.com.marryplan.dao.impl;


import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.marryplan.dao.UsuarioDAO;
import br.com.marryplan.entidade.Usuario;


@Repository
public class UsuarioDAOImpl extends AbstractDAO implements UsuarioDAO{



	@Override
	public boolean consultar(String login, String senha) {
		Query query = super.getEntityManager().createQuery("Select usu from Usuario where usu.login = login and usu.senha = senha");
		Usuario usuario = (Usuario) query.getSingleResult();
		if(usuario.equals(null)){
			return false;
		}
		getEntityManager().close();
		return true;
	}

	

	
	

}
