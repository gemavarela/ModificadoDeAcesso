package paquete2;

import paquete1.ClaseDefault;
import paquete1.ClaseProtected;


public class Main extends paquete1.ClaseProtected{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseDefault prueba =new ClaseDefault();
		//prueba.mostrar;
		
		ClasePrivada privada=new ClasePrivada();
		//privada.edad=30;
		//privada.nombre="Juan";
		
		privada.setSaludar("Juan");
		
		System.out.println(privada.getSaludar());
		
		//Objeto de la clase protected
		ClaseProtected protegido = new ClaseProtected();
		
		protegido.setEdad(18);
		

	}

}
