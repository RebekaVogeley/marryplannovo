package br.com.marryplan.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.marryplan.service.UsuarioService;
import br.com.marryplan.vo.UsuarioVO;

@ManagedBean(name = "usuarioMbean")
@SessionScoped
public class UsuarioController extends AbstractController{
	
	@Autowired(required=true)
	private UsuarioService usuarioService;
	
	
	@PostConstruct
	public void init(){
		super.getConfigSpring();
	}
	
	private UsuarioVO usuario = new UsuarioVO();
	
	
	public String verificarUsuario(){
		boolean retorno = usuarioService.consultar(usuario.getLogin(), usuario.getSenha());
		String tela = "";
		if(retorno){
			tela = "/usuario/telaLogin";
		}else{
			tela  = "/index.xhtml";
		}
		
		return tela;
	}
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}


	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}


	public UsuarioVO getUsuario() {
		return usuario;
	}


	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}


	
	}
