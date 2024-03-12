package m8ex1_arianna_gallardo;

public class M8EX1_ARIANNA_GALLARDO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Profesor este es el enlace del video
		 * https://youtu.be/EdbiRL4vzMA
		 */

		Clienta cliente1 = new Clienta(123456, "Alemana");
		Clienta cliente2 = new Clienta(654321, 18, "U.K", 10);
		
		System.out.println(cliente2.toString());
		
		/*Pondremos todos los Setter aunque solo modificaremos dos datos, asi 
		sera mas facil modificar cualquier dato*/
		cliente1.setDni (123456);
		cliente1.setEdad (18);
		cliente1.setNacionalidad ("Alemana");
		cliente1.setNumVueloCodigo (10);
		
		cliente2.setDni (654321);
		cliente2.setEdad (33);
		cliente2.setNacionalidad ("Española");
		cliente2.setNumVueloCodigo (10);
		
		System.out.println(cliente1.toString());
		System.out.println("Los datos del segundo cliente han sido modificados " + cliente2.toString());
		
		System.out.println("DNI " + cliente1.getDni());
		System.out.println("Edad " + cliente1.getEdad());
		System.out.println("Nacionalidad " + cliente1.getNacionalidad());
		System.out.println("Vuelos " + cliente1.getNumVueloCodigo());
		System.out.println();
		
		System.out.println("DNI " + cliente2.getDni());
		System.out.println("Edad " + cliente2.getEdad());
		System.out.println("Nacionalidad " + cliente2.getNacionalidad());
		System.out.println("Vuelos " + cliente2.getNumVueloCodigo());
		System.out.println();
		
		System.out.println("Huella de carbono de los clientes " + cliente1.calcularHuella());
		
	}

}
	/*Fes un programa que tingui una classe anomenada Clienta, a més a més de la classe que conté el main.

Aquesta classe Clienta tindrà com a atributs el DNI, l'edat, la nacionalitat i nombre de vols agafats.

L'aplicació ha de poder generar Clientes de dues maneres:

• Només a partir del DNI i la Nacionalitat (l'edat per defecte serà 18 anys i el nombre de vols agafats per defecte serà 10).
• Indicant tots els atributs.

La classe Clienta ha de disposar dels següents mètodes:

• mètodes que permetin consultar cadascun dels atributs.
• mètodes que permetin modificar la nacionalitat i l'edat.

• un mètode que calcula la petjada de carboni (multiplicant els viatges per 0,5 tones de CO₂).

• un mètode que retornarà una descripció completa de la clienta (toString()).

Al main del projecte, crea dues clientes de les 2 maneres possibles i comprova que els mètodes creats funcionen correctament. És a dir, crida a tots els mètodes amb les dues clientes.

 Important

NO has de demanar dades per consola, només crear els objectes i provar-los.*/