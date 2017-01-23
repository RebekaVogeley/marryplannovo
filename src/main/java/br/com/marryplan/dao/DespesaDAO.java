package br.com.marryplan.dao;

import java.util.List;

import br.com.marryplan.entidade.Despesa;


public interface DespesaDAO {
	public void salvar(Despesa despesa);
	public void excluir(long id);
	public void alterar(Despesa despesa);
	public Despesa consultarPorId(long id);
	public List<Despesa> consultarTodos();
	
}
