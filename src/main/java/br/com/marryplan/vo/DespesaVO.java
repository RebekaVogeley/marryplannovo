package br.com.marryplan.vo;

import java.math.BigDecimal;


//@SuppressWarnings("serial")
public class DespesaVO {
	private long id;
	public String contatoServico;
	public BigDecimal valorDespesa;
	public String datapagamento;
    private String gasto;
	

	public String getGasto() {
		return gasto;
	}

	public void setGasto(String gasto) {
		this.gasto = gasto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getDatapagamento() {
		return datapagamento;
	}

	public void setDatapagamento(String datapagamento) {
		this.datapagamento = datapagamento;
	}
}
