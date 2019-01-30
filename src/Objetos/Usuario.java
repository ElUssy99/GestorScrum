package Objetos;

public class Usuario {
	
	@Override
	public String toString() {
		return "Usuario [ nombre=" + nombre + ", login=" + login + ", password=" + password
				+ ", repPassword=" + repPassword + ", mail=" + mail + ", userPerm=" + userPerm + "]";
	}


	private String nombre, login, password, repPassword, mail, userPerm;
	
	public Usuario(String nombre, String login, String password, String repPassword, String mail, String userPerm) {
		this.nombre = nombre;
		this.login = login;
		this.password = repPassword;
		this.mail = mail;
		this.userPerm = userPerm;
	
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepPassword() {
		return repPassword;
	}

	public void setRepPassword(String repPassword) {
		this.repPassword = repPassword;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUserPerm() {
		return userPerm;
	}

	public void setUserPerm(String userPerm) {
		this.userPerm = userPerm;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
