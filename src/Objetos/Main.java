package Objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<String> datos = new ArrayList<String>();
		ArrayList<String> permisos = new ArrayList<String>();
		
		String permisosString = "Master Owner;Scrum master;Developer;Administrador";
		String[] permisosSplit = permisosString.split(";");
		for (int i = 0; i < permisosSplit.length; i++) {
			permisos.add(permisosSplit[i]);
		}
		
		BaseDeDatos prueba = new BaseDeDatos("David", "ElUssy99", "MiNombreNoEsElUssy", "MiNombreNoEsElUssy", "xldaviduson@gmail.com", "Scrum Master");
		BaseDeDatos prueba3 = new BaseDeDatos("David", "ElUssy99", "MiNombreNoEsElUssy", "MiNombreNoEsElUssy", "xldaviduson@gmail.com", "no tengo");
		
		BaseDeDatos prueba2 = new BaseDeDatos("Marc", "ElMarki", "MiNombreNoEsElMarki", "MiNombreNoEsElMarki 2", "calored11@gmail.com 2", "Administrador");
		BaseDeDatos prueba4 = new BaseDeDatos("Marc", "ElMarki", "MiNombreNoEsElMarki", "MiNombreNoEsElMarki 2", "calored11@gmail.com 2", "no tengor");
		
		String bdd = prueba.toString();
		String bdd2 = prueba2.toString();
		
		String bdd3 = prueba3.toString();
		String bdd4 = prueba4.toString();
		if(prueba.getUserPerm() == "Master Owner" || prueba.getUserPerm() == "Scrum Master" || prueba.getUserPerm() == "Developer" || prueba.getUserPerm() == "Administrador") {
			System.out.println(prueba.toString());
		}
		
		datos.add(bdd);
		datos.add(bdd2);
		datos.add(bdd3);
		datos.add(bdd4);
		
		// Prueba para mostrar los datos de cada Objeto si tienen los permisos correctos.
//		Iterator<String> datosIterator = datos.iterator();
//		Iterator<String> permisosIterator = permisos.iterator();
//		while(datosIterator.hasNext()){
//			String elemento = datosIterator.next();
//			int i = 0;
//			while(permisosIterator.hasNext()) {
//				if(prueba.getUserPerm() == permisos.get(i)) {
//					System.out.print(elemento+" / ");
//					System.out.println("");
//				}
//				i++;
//			}
//		}
		
		// Provabilidad de la Conexion con el Servidor.
		String conexion = "ONLINE;OFFLINE";
		String[] conexionSplit = conexion.split(";");
		int provabilida = (int)(Math.random()*2);
		if(provabilida == 0) {
			System.out.println(conexionSplit[0]);
		}else if(provabilida == 1) {
			System.out.println(conexionSplit[1]);
		}
		
	}
}