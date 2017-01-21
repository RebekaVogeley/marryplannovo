package br.com.marryplan.service.impl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marryplan.dao.UsuarioDAO;
import br.com.marryplan.service.UsuarioService;
import br.com.marryplan.vo.UsuarioVO;
import br.com.marryplan.vo.converter.Converter;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired(required=true)
	private UsuarioDAO dao;

	@Override
	public boolean consultar(String login, String senha) {
		
		return dao.consultar(login, senha);
	}

}
