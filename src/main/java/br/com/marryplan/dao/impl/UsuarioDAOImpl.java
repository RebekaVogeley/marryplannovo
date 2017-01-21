package br.com.marryplan.dao.impl;


import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.marryplan.dao.UsuarioDAO;
import br.com.marryplan.entidade.Usuario;


@Repository
public class UsuarioDAOImpl extends AbstractDAO implements UsuarioDAO{



	@Override
	public boolean consultar(String login, String senha) {
		boolean encontrou = true;
		Query query = super.getEntityManager().createQuery("Select usu from Usuario usu where usu.login = :login and usu.senha = :senha");
		query.setParameter("login", login);
		query.setParameter("senha", senha); 		
				try{
					Usuario usuario = (Usuario) query.getSingleResult();
				}catch(NoResultException exception){
					encontrou = false;			
				}			
		getEntityManager().close();
		return encontrou;
	}

	

	
	

}
