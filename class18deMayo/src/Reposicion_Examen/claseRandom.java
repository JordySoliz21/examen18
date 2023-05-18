package Reposicion_Examen;
import java.util.Random;
import java.util.Scanner;

public class claseRandom {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("Ingrese el número de lanzamientos del dado: ");
		int numLan = tc.nextInt();
		
		int contador = 0;
		for (int i=0; i<numLan; i++) {
			int res = ran.nextInt(6) + 1;
			System.out.println("Lanzamiento "+ (i+1) + ": " + res);
			if (res == 4) {
				contador++;
			}		
		}
		System.out.println("El numero premiado es (4) se obtuvo " + contador + " ves");	
	}
}
