package br.com.marryplan.entidade;

import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DESPESA")
public class Despesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;

	@Column(name = "GASTO", length = 40)
	private String gasto;
	
	@Column(name="CONTATOSERVICO", length=40)
	private String contatoServico;
	
	@Column(name = "VALORDESPESA")
	private BigDecimal valorDespesa;

	@Column(name = "DATAPAGAMENTO", length = 40)
	private String dataPagamento;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	
	public String getGasto() {
		return gasto;
	}

	public void setGasto(String gasto) {
		this.gasto = gasto;
	}

	public String getContatoServico() {
		return contatoServico;
	}

	public void setContatoServico(String contatoServico) {
		this.contatoServico = contatoServico;
	}

	public BigDecimal getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(BigDecimal valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}



}
