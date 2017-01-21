package br.com.marryplan.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import br.com.marryplan.dao.CasamentoDAO;
import br.com.marryplan.entidade.Casamento;
import br.com.marryplan.entidade.Tarefas;


@Repository
public class CasamentoDAOImpl extends AbstractDAO implements CasamentoDAO{

	@Override
	public void cadastrarCasamento(Casamento casamento) {
		super.getEntityManager().persist(casamento);
		
	}

	@Override
	public void editarCasamento(Casamento casamento) {
		super.getEntityManager().merge(casamento);
		
	}

	@Override
	public Casamento consultarCasamento(long id) {
		return super.getEntityManager().find(Casamento.class, id);
		 	
	}


}
