package Objetos;

import java.util.ArrayList;

import Finestres.InternalFrame;
import Finestres.Login;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario usuari1 = new Usuario(1, "David", "ElUssy99", "hola", "hola", "xldaviduson@gmail.com", "Administrador");
		Usuario usuari2 = new Usuario(2, "Marc", "ElMarki99", "adios", "adios", "calored98@gmail.com", "Administrador");
		Usuario usuari3 = new Usuario(3, "Usuario3", "user3", "jaja", "jaja", "email3@gmail.com", "Scrum Master");
		
		usuarios.add(usuari1);
		usuarios.add(usuari2);
		usuarios.add(usuari3);
		
		BaseDeDatos bdd = new BaseDeDatos();
		bdd.setUsuarios(usuarios);

		usuarios = bdd.getUsuarios();
		
		for (Usuario usuario : usuarios) {
			System.out.print(usuario.getId() + " " + usuario.getNombre() + " " + usuario.getLogin() + " " + usuario.getPassword() + " " + usuario.getRepPassword() + " " + usuario.getMail() + " " +usuario.getUserPerm() + " " + "\n");
		}
		
		new InternalFrame(bdd);
		
	}
}