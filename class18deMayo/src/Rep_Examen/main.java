package Rep_Examen;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Ingrese aqui el nombre del primer producto: ");
		System.out.println("Nombre: ");
		String name1 = tc.nextLine();
		System.out.println("Precio: ");
		double precio1 = tc.nextDouble();
		System.out.println("Cantidad: ");
		int cantidad1 = tc.nextInt();
		
		regProduct producto1 = new regProduct(name1, precio1, cantidad1); 
		
		System.out.println("Ingrese aqui el nombre del segundo producto: ");
		System.out.println("Nombre: ");
		String name2 = tc.nextLine();
		System.out.println("Precio: ");
		double precio2 = tc.nextDouble();
		System.out.println("Cantidad: ");
		int cantidad2 = tc.nextInt();
		
		regProduct producto2 = new regProduct(name2, precio2, cantidad2); 
		
		System.out.println("Ingrese aqui el nombre del tercer producto: ");
		System.out.println("Name: ");
		String name3 = tc.nextLine();
		System.out.println("Precio: ");
		double precio3 = tc.nextDouble();
		System.out.println("Cantidad: ");
		int cantidad3 = tc.nextInt();
		
		regProduct producto3 = new regProduct(name3, precio3, cantidad3);
		
		System.out.println("Ingrese aqui el nombre del tercer producto: ");
		System.out.println("Name: ");
		String name4 = tc.nextLine();
		System.out.println("Precio: ");
		double precio4 = tc.nextDouble();
		System.out.println("Cantidad: ");
		int cantidad4 = tc.nextInt();
		
		regProduct producto4 = new regProduct(name4, precio4, cantidad4); 
		
		System.out.println("Ingrese aqui el nombre del primer producto: ");
		System.out.println("Name: ");
		String name5 = tc.nextLine();
		System.out.println("Precio: ");
		double precio5 = tc.nextDouble();
		System.out.println("Cantidad: ");
		int cantidad5 = tc.nextInt();
		
		regProduct producto5 = new regProduct(name5, precio5, cantidad5); 
		
		System.out.println("Los productos que se han ingresado son: ");
		System.out.print(producto1.getName());
		System.out.print(producto2.getName());
		System.out.print(producto3.getName());
		System.out.print(producto4.getName());
		System.out.print(producto5.getName());
	}

}
