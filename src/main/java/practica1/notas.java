/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;
import java.util.Scanner;

/**
 * Documentación de notas.java
 * 
 * @version 1.0
 * @since 2023-03-25
 * @author Ignacio Ponsoda Llorens
 */
public class notas {
	//declaramos la variables que nos hacen falta
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	//utilizames ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	///vamos ca crear un metodo para ingresar 
        
        /**
         * Función para ingresar las notas
         */
	public void IngresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");		
		System.out.print("ingrese nota 1: ");		
		uf1= entrada.nextDouble();		
		System.out.print("ingrese nota 2: ");		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");		
		uf3= entrada.nextDouble();	
	}
	
	// metodo para comprobar bien entroduccion de notas
	/**
         * Función para comprobar si las notas han sido introducidas correctamente.
         */
	public void comprobarcionNotas(){
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");	
		}else {
			System.out.println(" nota1 correcta");
		}
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");	
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
		}else {
			System.out.println(" nota3 correcta");
		}
	}
	/**
         * Método para calcular las notas
         */
	public void CalculoNotas() {
		acu1= uf1 * 0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		def = acu1 + acu2+ acu3;
		//hasta aqui la tenemos calculada peor no la mostramos
	}
        
        /**
         * Método para mostrar las notas
         */
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		System.out.println(" nota definitiva es = "+ def);	
	}
	/**
         * Método para comprobar si está aprobado o suspendido
         **/
    	public void Aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
	
        /**
         * Bloque para lanzar los métodos
         * @param args Array of strings
         */
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc = new notas();
		fc.IngresaNotas();
		fc.comprobarcionNotas();
		fc.CalculoNotas();
		fc.Mostrar();
		fc.Aprobado();
                System.out.println(" nota definitiva es = ");	
	}
}