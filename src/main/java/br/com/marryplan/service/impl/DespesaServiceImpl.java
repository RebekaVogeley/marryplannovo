package br.com.marryplan.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marryplan.dao.DespesaDAO;
import br.com.marryplan.entidade.Despesa;
import br.com.marryplan.service.DespesaService;
import br.com.marryplan.vo.DespesaVO;
import br.com.marryplan.vo.converter.Converter;

@Service
public class DespesaServiceImpl implements DespesaService{
	
	@Autowired(required = true)
	private DespesaDAO dao;
	

	@Override
	@Transactional 
	public void salvar(DespesaVO despesaVO) {
		// TODO Auto-generated method stub
		Despesa despesa = Converter.converterVoParaDespesa(despesaVO);
		dao.salvar(despesa);
		
	}
	@Override
	public List<DespesaVO> listarTodosDespesa() {
		// TODO Auto-generated method stub
		List<Despesa> listaDespesa = dao.consultarTodos();
		return Converter.converterListaDespesaParaListaVo(listaDespesa);
		
	}

	@Override
	@Transactional 
	public void excluir(long id) {
		// TODO Auto-generated method stub
		dao.excluir(id);
	}
	
	@Override
	@Transactional
	public void alterarDespesa(DespesaVO despesaVO) {
		Despesa despesa = Converter.converterVoParaDespesa(despesaVO);
		dao.alterar(despesa);
		
	}

	@Override
	public DespesaVO consultarDespesaPorId(long id) {
		Despesa despesa = dao.consultarPorId(id);
		return Converter.converterDespesaParaVO(despesa);
	}
	
	
}
