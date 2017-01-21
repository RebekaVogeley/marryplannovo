package br.com.marryplan.service;

import br.com.marryplan.vo.UsuarioVO;

public interface UsuarioService {

	public boolean consultar (String login, String senha);
	
}
