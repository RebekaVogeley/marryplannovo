package br.com.marryplan.service.impl;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marryplan.dao.CasamentoDAO;
import br.com.marryplan.entidade.Tarefas;
import br.com.marryplan.exception.BusinessException;
import br.com.marryplan.service.CasamentoService;
import br.com.marryplan.vo.CasamentoVO;
import br.com.marryplan.vo.TarefasVO;
import br.com.marryplan.vo.converter.Converter;


@Service
public class CasamentoServiceImpl implements CasamentoService {

	
	@Autowired (required=true)
	private CasamentoDAO dao;
	
	@Override
	@Transactional
	public void cadastrarCasamentoVO(CasamentoVO casamentoVO) {
				dao.cadastrarCasamento(Converter.converterVOparaCasamento(casamentoVO));
			
	}

	@Override
	@Transactional
	public void editarCasamentoVO (CasamentoVO casamentoVO) {
		long id = casamentoVO.getId();
		dao.editarCasamento(dao.consultarCasamento(id));
		
	}

	@Override
	public CasamentoVO consultarCasamentoVO(long id) {
		return Converter.converterCasamentoParaVO(dao.consultarCasamento(id));
	}

	@Override
	public BigDecimal calcularValorGasto(CasamentoVO casamentoVO) {
			
			//int somatorioDespesas = 0;
			
		//	for(Despesas despesa: casamentoVO.getListaDespesas){
		//		somatorioDespesas = somatorioDespesas + despesa.getValor();
		//	//}
		//	
		//	if(casamentoVO.getValorLimite == 0){
		//		throw new BusinessException("Saldo Insuficie");
		//	}
		//	int valorLimiteAtualizado = casamentoVO.getValorLimite - somatorioDespesas();
		//	
		//	casamentoVO.setValorLimite(valorLimiteAutualizar);
			
		//	service.atualizar(casamento);	
		
		return null;
	}

}











