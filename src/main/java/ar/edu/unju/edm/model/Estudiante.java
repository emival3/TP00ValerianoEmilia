package ar.edu.unju.edm.model;

public class Estudiante {
//definir los aributos y sus tipos de datos, ponerlos en privado
	private String dni;
	private String nombre;
	private String Apellido;
	private float peso;
	private char genero;
	
	//al apretar control+ barra espaciadora sse crea un constructor por defecto
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	//generar getters and setters
	
	
}
