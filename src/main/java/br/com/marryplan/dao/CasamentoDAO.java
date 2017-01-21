package br.com.marryplan.dao;

import java.util.List;

import br.com.marryplan.entidade.Casamento;
import br.com.marryplan.entidade.Tarefas;
import br.com.marryplan.vo.CasamentoVO;

public interface CasamentoDAO {
	
	public void cadastrarCasamento(Casamento casamento);
	public void editarCasamento(Casamento casamento);
	public Casamento consultarCasamento(long id);

}
