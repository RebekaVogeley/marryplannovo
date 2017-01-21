package br.com.marryplan.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.com.marryplan.entidade.Convidado;
import br.com.marryplan.entidade.Tarefas;


public class CasamentoVO {
	
	
	private long id;
	private Date dataCasamento;
	private BigDecimal valorLimite;
	private String localCasamento;
	private String localRecepcao;
	private int limiteConvidados;
	private String nomeNoiva;
	private String nomeNoivo;
	private List<Tarefas> listaTarefas;
	private List<Convidado> listaConvidados;
	//private Orcamento orcamento;
	
	
	
	
	
	public List<Tarefas> getListaTarefas() {
		return listaTarefas;
	}
	
	public List<Convidado> getListaConvidados() {
		return listaConvidados;
	}

	public void setListaConvidados(List<Convidado> listaConvidados) {
		this.listaConvidados = listaConvidados;
	}

	public void setListaTarefas(List<Tarefas> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}
	
	public long getId() {
		return id;
	}
	public String getNomeNoiva() {
		return nomeNoiva;
	}
	public void setNomeNoiva(String nomeNoiva) {
		this.nomeNoiva = nomeNoiva;
	}
	public String getNomeNoivo() {
		return nomeNoivo;
	}
	public void setNomeNoivo(String nomeNoivo) {
		this.nomeNoivo = nomeNoivo;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDataCasamento() {
		return dataCasamento;
	}
	public void setDataCasamento(Date dataCasamento) {
		this.dataCasamento = dataCasamento;
	}
	public BigDecimal getValorLimite() {
		return valorLimite;
	}
	public void setValorLimite(BigDecimal valorLimite) {
		this.valorLimite = valorLimite;
	}
	public String getLocalCasamento() {
		return localCasamento;
	}
	public void setLocalCasamento(String localCasamento) {
		this.localCasamento = localCasamento;
	}
	public String getLocalRecepcao() {
		return localRecepcao;
	}
	public void setLocalRecepcao(String localRecepcao) {
		this.localRecepcao = localRecepcao;
	}
	public int getLimiteConvidados() {
		return limiteConvidados;
	}
	public void setLimiteConvidados(int limiteConvidados) {
		this.limiteConvidados = limiteConvidados;
	}
	

}
