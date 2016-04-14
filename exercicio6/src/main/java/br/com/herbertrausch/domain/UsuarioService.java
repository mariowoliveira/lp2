package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class UsuarioService {

	
	private UsuarioRepository db;
	
	public UsuarioService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(UsuarioRepository.class);
		
	}

	// Lista todos os Usunario do banco de dados
	public List<Usuario> getUsuario() {
		try {
			
			List<Usuario> usuarios = (List<Usuario>) db.findAll();
					
			return usuarios;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Usuario>();

		}
	}
	
	public List<Usuario> getByNome(String a){
		return db.findByNome(a);
	}
	
	public Usuario getUsuario(Long id) {
		try {
			
			
			return db.findOne(id);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	// Deleta o carro pelo id
	public boolean delete(Long id) {
		try {
			db.delete(id);
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// Salva ou atualiza o carro
	public boolean save(Usuario usuario) {
		try {
			
				db.save(usuario);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



}