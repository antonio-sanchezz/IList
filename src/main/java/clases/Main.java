/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package clases;

public class Main {
    
    public static void main (String [] args) {
    	Persona person = new Persona(23, "Antonio", "56892450Z");
    	Persona person2 = new Persona(23, "Antonio", "56892450Z");
    	
    	MiniList lista = new MiLista();
    	
    	lista.add(person);
    	//lista.add(person2);
    	
    	if (lista.get(0) == person) {
    		System.out.println("Son iguales");
    	} else {
    		System.out.println("Son diferentes");
    	}
    	
    	if (lista.get(0) == person2) {
    		System.out.println("Son iguales");
    	} else {
    		System.out.println("Son diferentes");
    	}

    }
}
