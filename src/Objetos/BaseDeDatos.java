package Objetos;

import java.util.ArrayList;

public class BaseDeDatos {

	private ArrayList<Usuario> usuarios;
	
	// Constructor para crear el Usuario:
	public BaseDeDatos() {
		super();
		this.usuarios = new ArrayList<Usuario>();
	}

	public Usuario getUsuarioByLogin(String login) {
		for (Usuario usuario : usuarios) {
			if(usuario.getLogin() == login) {
				return usuario;
			}
		}
		return null;
	}
	
	public Usuario getUsuarioByPassword(String password) {
		for (Usuario usuario : usuarios) {
			if(usuario.getPassword() == password) {
				return usuario;
			}
		}
		return null;
	}
	
	public Usuario getUsuarioByUserPerm(String userPerm) {
		for (Usuario usuario : usuarios) {
			if(usuario.getUserPerm() == userPerm) {
				return usuario;
			}
		}
		return null;
	}
	
	// Getters y Setters:
	// Array Usuario
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
} 