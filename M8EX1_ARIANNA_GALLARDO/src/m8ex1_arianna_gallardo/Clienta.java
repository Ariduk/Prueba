package m8ex1_arianna_gallardo;

public class Clienta {

	//Atributos	
	//se hara de esta forma cuando haya metodo constructor
	private int dni;
	private int edad;
	private String nacionalidad;
	private int numVueloCodigo;
	
	/* No hace falta hacerlo asi al usar metodo constructor
	int dni = 0;
	int edad = 0;
	String nacionalidad = "";
	int numVueloCodigo = 0;
	*/
	
	//Modo constructor nunca devuelve nada, solo hace una logica inicial que tiene que ser realizada en el objeto
	//primer costructor
	public Clienta(int dni, String nacionalidad) {
		this.dni = dni;
		this.edad = 18;
		this.nacionalidad = nacionalidad;
		this.numVueloCodigo = 10;		
		
	}
	//Segundo constructor
	public Clienta(int dni, int edad, String nacionalidad, int numVueloCodigo) {
		this.dni = dni;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.numVueloCodigo = 10;		
		
	}
	
	//Getter "Dame" "devuelve" "No recibe"
	public int getDni() {
		return this.dni;
	}
	public int getEdad() {
		return this.edad;
	}
	public String getNacionalidad() {
		return this.nacionalidad;
	}
	public int getNumVueloCodigo() {
		return this.numVueloCodigo;
	}
	
	//Setter "Modificar - editar" "No devuelve nada pero si recibe"
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public void setNumVueloCodigo(int numVueloCodigo) {
		this.numVueloCodigo = numVueloCodigo;
	}
	
	//Calcular huella de carbono
	
	public double calcularHuella() {
		 return numVueloCodigo * 0.5;
		 
	}
	//Metodo Propio
	public String toString() {
		return "El cliente tiene DNI " + this.dni + " una edad de: " + this.edad + " años, " + " su nacionalidad es: " +
	this.nacionalidad + " y su numeros de vuelo es: " + this.numVueloCodigo;
		
	}
		
}
