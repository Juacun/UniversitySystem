package com.jpcode.app.service;

import java.util.List;
import java.util.Optional;

import com.jpcode.app.model.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
	
	public Optional<Usuario> findById(int id);
	
	public Usuario save(Usuario usuario);
	
	public void deleteById(int id);
	
}
