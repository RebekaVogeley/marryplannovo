package br.com.marryplan.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.marryplan.vo.CasamentoVO;
import br.com.marryplan.vo.TarefasVO;

public interface CasamentoService {
	
	public void cadastrarCasamentoVO(CasamentoVO casamentoVO);
	public void editarCasamentoVO(CasamentoVO casamentoVO);
	public CasamentoVO consultarCasamentoVO(long id);
	public BigDecimal calcularValorGasto(CasamentoVO casamentoVO);

}
