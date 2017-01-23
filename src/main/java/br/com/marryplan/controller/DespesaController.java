package br.com.marryplan.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;


import br.com.marryplan.service.DespesaService;

import br.com.marryplan.vo.DespesaVO;

@ManagedBean(name = "gastoMbean") 
@SessionScoped
public class DespesaController extends AbstractController{

	public static String TELA_LISTA_TODOS = "/despesa/listardespesa.xhtml";
	public static String TELA_CADASTRAR_DESPESA = "/despesa/cadastrardespesa.xhtml";

	@Autowired 
	private DespesaService despesaService;
	private List<DespesaVO> listaDespesaVO;
	
	@PostConstruct
	private void init() {
		super.getConfigSpring();
		this.listaDespesaVO = despesaService.listarTodosDespesa();
	}
	
	private DespesaVO despesa = new DespesaVO();
	
	public DespesaVO getDespesa() {
		return despesa;
	}

	public void setDespesa(DespesaVO despesa) {
		this.despesa = despesa;
	}
	private void limparCampos() {
		this.getDespesa().setGasto(null);
		this.getDespesa().setContatoServico(null);
		this.getDespesa().setValorDespesa(null);
		this.getDespesa().setDatapagamento(null);
	}
	public String salvar() {
		// Calling Business Service
		despesaService.salvar(despesa);
		// Add message
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A despesa " + this.despesa.getValorDespesa() + " foi gravado com sucesso!"));
		this.limparCampos();
		
		return "";
	}

	public void alterar(RowEditEvent event){
		DespesaVO despesaVOAlterado = ((DespesaVO) event.getObject());
		despesaService.alterarDespesa(despesaVOAlterado);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Despesa alterada com sucesso!"));

	}
	
	public void cancelarEdicao(RowEditEvent event){
		FacesMessage msg = new FacesMessage("Edição Cancelada!", ((DespesaVO) event.getObject()).getGasto());
		FacesContext.getCurrentInstance().addMessage(null, msg);

	}
	
	public String excluir(DespesaVO despesaVO) {
		if (despesaVO != null && despesaVO.getId() != 0) {
			this.despesaService.excluir(despesaVO.getId());
		}
		this.listaDespesaVO = despesaService.listarTodosDespesa();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Despesa excluida com sucesso!"));
		return "";
	}

	public DespesaService getDespesaService() {
		return despesaService;
	}

	public void setDespesaService(DespesaService despesaService) {
		this.despesaService = despesaService;
	}

	public void setListaDespesaVO(List<DespesaVO> listaDespesaVO) {
		this.listaDespesaVO = listaDespesaVO;
	}

	public List<DespesaVO> getListaDespesaVO() {
		return listaDespesaVO;
	}
	
	public String chamarTelaTodosDespesa(){
		listaDespesaVO = despesaService.listarTodosDespesa();
		return TELA_LISTA_TODOS;
	}
	
	public String chamarTelaCadastroDespesa(){
		return TELA_CADASTRAR_DESPESA;
	}
	

	
	
}
