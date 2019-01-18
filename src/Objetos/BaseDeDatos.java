package Objetos;

import java.util.ArrayList;

public class BaseDeDatos {

	private String nombre, login, password, repPassword, mail, userPerm;

	// Constructor para crear el Usuario:
	public BaseDeDatos(String nombre, String login, String password, String repPassword, String mail, String userPerm) {
		super();
		this.nombre = nombre;
		this.login = login;
		this.password = password;
		this.repPassword = repPassword;
		this.mail = mail;
		this.userPerm = userPerm;
	}
	
	// Constructor para Iniciar Sesion:
	public BaseDeDatos(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	// Getters y Setters:
	// Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Login
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	// Password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Permisos
	public String getUserPerm() {
		return userPerm;
	}
	public void setUserPerm(String userPerm) {
		this.userPerm = userPerm;
	}
	
	// toString para mostrar los Datos de prueba:
	@Override
	public String toString() {
		return "BaseDeDatos [nombre=" + nombre + ", login=" + login + ", password=" + password + ", repPassword="
				+ repPassword + ", mail=" + mail + ", userPerm=" + userPerm + "]";
	}

}