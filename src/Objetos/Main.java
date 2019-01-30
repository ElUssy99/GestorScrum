package Objetos;

import java.util.ArrayList;

import Finestres.InternalFrame;
import Finestres.Login;

public class Main {
	
	public static void main(String[] args) {
		BaseDeDatos bdd = new BaseDeDatos();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Proyectos> proyectos = new ArrayList<Proyectos>();
		bdd.setUsuarios(usuarios);
		bdd.setProyectos(proyectos);
		
		Usuario usuari1 = new Usuario("David", "ElUssy99", "hola", "hola", "xldaviduson@gmail.com", "Administrador");
		Usuario usuari2 = new Usuario("Marc", "ElMarki99", "adios", "adios", "calored98@gmail.com", "Administrador");
		Usuario usuari3 = new Usuario("Usuario3", "user3", "jaja", "jaja", "email3@gmail.com", "Scrum Master");
		Usuario usuari4 = new Usuario("Mark", "ElMarki98", "adioss", "adioss", "calored99@gmail.com", "Product Owner");
		
		Proyectos proyecto1= new Proyectos("proyectoMotor", "Creacion de una aplicacion de compra de coches y motos","Usuario3","Mark");
		Proyectos proyecto2= new Proyectos("proyectoPagWeb", "Creacion de una paguina web","Usuario3","Mark");
		Proyectos proyecto3= new Proyectos("proyectoAPPLove", "Creacion de una aplicacion de citas","Usuario3","Mark");
		
		usuarios.add(usuari1);
		usuarios.add(usuari2);
		usuarios.add(usuari3);
		usuarios.add(usuari4);
		
		proyectos.add(proyecto1);
		proyectos.add(proyecto2);
		proyectos.add(proyecto3);
		
		usuarios = bdd.getUsuarios();
		
		for (Usuario usuario : usuarios) {
			System.out.print(usuario.getNombre() + " " + usuario.getLogin() + " " + usuario.getPassword() + " " + usuario.getRepPassword() + " " + usuario.getMail() + " " +usuario.getUserPerm() + " " + "\n");
		}
		for (Proyectos proyecto : proyectos) {
			System.out.println(proyecto.getNombre()+" "+proyecto.getDescripcion()+" "+proyecto.getScrumMaster()+" "+proyecto.getProductOwner()+" "+"\n");
		}
		new InternalFrame(bdd);
	}
}