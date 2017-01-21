package br.com.marryplan.entidade;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "casamento")
public class Casamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	

	@Column (name = "DATA", nullable = true)
	@Temporal (TemporalType.DATE)
	private Date dataCasamento;
	
	
	@Column (name = "VALOR_LIMITE", nullable = true)
	private BigDecimal valorLimite;
	
	@Column (name = "LOCAL_CASAMENTO", nullable = true)
	private String localCasamento;
	
	@Column (name = "LOCAL_RECEPCAO", nullable = true)
	private String localRecepcao;
	
	@Column (name = "LIMITE_CONVIDADOS", nullable = true)
	private int limiteConvidados;
	
	@Column (name = "NOME_NOIVA", nullable = true)
	private String nomeNoiva;
	
	@Column (name = "NOME_NOIVO", nullable = true)
	private String nomeNoivo;
	
	//@Column (name = "ORCAMENTO", nullable = true)
	//private Orcamento orcamento;
	
	
	@OneToMany
	@JoinColumn(name= "ID_TAREFAS")
	private List<Tarefas> listaTarefas;
	
	@OneToMany
	@JoinColumn(name= "ID_CONVIDADOS")
	private List<Convidado> listaConvidados;

	
	//LISTA DE TAREFAS
	public List<Tarefas> getListaTarefas() {
		return listaTarefas;
	}

	public void setListaTarefas(List<Tarefas> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}
	
	

	public List<Convidado> getListaConvidados() {
		return listaConvidados;
	}

	public void setListaConvidados(List<Convidado> listaConvidados) {
		this.listaConvidados = listaConvidados;
	}

	//ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	//DATA DO CASAMENTO
	public Date getDataCasamento() {
		return dataCasamento;
	}

	public void setDataCasamento(Date dataCasamento) {
		this.dataCasamento = dataCasamento;
	}
	
	//Valor GASTO ATÈ O MOMENTO
	public BigDecimal getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(BigDecimal valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	//LOCAL DA CERIMONIA
	public String getLocalCasamento() {
		return localCasamento;
	}

	public void setLocalCasamento(String localCasamento) {
		this.localCasamento = localCasamento;
	}
	
	
	//LOCAL DA FESTA
	public String getLocalRecepcao() {
		return localRecepcao;
	}

	public void setLocalRecepcao(String localRecepcao) {
		this.localRecepcao = localRecepcao;
	}
	
	
	//Limite convidados
	public int getLimiteConvidados() {
		return limiteConvidados;
	}

	public void setLimiteConvidados(int limiteConvidados) {
		this.limiteConvidados = limiteConvidados;
	
	}

	//NOIVA
	public String getNomeNoiva() {
		return nomeNoiva;
	}

	public void setNomeNoiva(String nomeNoiva) {
		this.nomeNoiva = nomeNoiva;
	}

	
	//NOIVO
	public String getNomeNoivo() {
		return nomeNoivo;
	}

	public void setNomeNoivo(String nomeNoivo) {
		this.nomeNoivo = nomeNoivo;
	}
	
	
}
