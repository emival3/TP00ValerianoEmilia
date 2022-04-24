package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00ValerianoEmiliaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00ValerianoEmiliaApplication.class, args);
		
		String nombre="Gustavo";
		System.out.println("Hola EDM, dice "+ nombre +" "+ darNombre());
		Estudiante unEstudiante= new Estudiante();
		unEstudiante.setDni("45109291");
		unEstudiante.setApellido("Valeriano");
		unEstudiante.setNombre("Emilia");
		unEstudiante.setPeso(63);
		unEstudiante.setGenero('F');
		System.out.println("El estudiante "+ unEstudiante.getNombre()+" "+ unEstudiante.getApellido()+" dice hola");
		System.out.println("");
		Calculadora unCalculadora= new Calculadora();
		//   			clase 		metoodo constructor
		unCalculadora.setN1(6);
		unCalculadora.setN2(3);
		System.out.println("El resultado de la suma es: "+ unCalculadora.resolverSuma());
		System.out.println("El resultado de la resta es: "+ unCalculadora.resolverResta());
		System.out.println("El resultado de la multiplicacion es: "+ unCalculadora.resolverMultiplicacion());
		System.out.println("El resultado de la division es: "+ unCalculadora.resolverDivision());
		System.out.println("El resultado de la potencia es: "+ unCalculadora.resolverPotencia());
		System.out.println("El resultado de la raiz es: "+ unCalculadora.resolverRaiz());
	}
	
	public static String darNombre() { //metodo publico de tipo string
		String nuevoNombre="Sebastian";//se define la variable nuevamente
		return nuevoNombre;
	}

}
