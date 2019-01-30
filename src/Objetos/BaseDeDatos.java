package Objetos;

import java.util.ArrayList;

public class BaseDeDatos {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Proyectos> proyectos;
	// Constructor para crear el Usuario:
	public BaseDeDatos() {
		this.usuarios = new ArrayList<Usuario>();
		this.proyectos= new ArrayList<Proyectos>();
	}
	
	public Usuario getUsuarioByName(String Nombre ) {
		for (Usuario usuario : usuarios) {
			if(usuario.getNombre()==Nombre) {
				return usuario;
			}
		}
		return null;
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
	
	public String getUsuarioByUserPerm(String userPerm) {
		
		for (Usuario usuario : usuarios) {
			
			if(usuario.getLogin().equals(userPerm)) {
				
				return usuario.getUserPerm();
			}
		}
		return null;
	}
	public Proyectos getProyectosByNombre(String nombre) {
		for (Proyectos proyectos : proyectos) {
			if(proyectos.getNombre()==nombre) {
				return proyectos;
			}
			
		}
		return null;
	}
	
	public Proyectos getProyectosByDescripcion(String descripcion) {
		for (Proyectos proyectos : proyectos) {
			if(proyectos.getDescripcion()==descripcion) {
				return proyectos;
			}
			
		}
		return null;
	}
	
	public Proyectos getProyectosByScrumMaster(String scrumMaster) {
		for (Proyectos proyectos : proyectos) {
			if(proyectos.getScrumMaster()==scrumMaster) {
				return proyectos;
			}
			
		}
		return null;
	}
	
	public Proyectos getProyectosByProductOwner(String productOwner) {
		for (Proyectos proyectos : proyectos) {
			if(proyectos.getProductOwner()==productOwner) {
				return proyectos;
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
	//Array Proyectos
	public ArrayList<Proyectos> getProyectos() {
		return proyectos;
	}
	public void setProyectos(ArrayList<Proyectos> proyectos) {
		this.proyectos = proyectos;
	}
	
} 