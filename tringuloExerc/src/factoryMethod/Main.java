package factoryMethod;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		System.out.println(" digite os lados do triangulo :  ");
		double ladoA = 0,ladoB = 0,ladoC = 0;
		try(Scanner sc = new Scanner(System.in)){
			System.out.print(" lado a = ");
			ladoA = sc.nextDouble();
			System.out.print(" lado b = ");
			ladoB = sc.nextDouble();
			System.out.print(" lado c = ");
			ladoC = sc.nextDouble();
			System.out.print(" o tringulo é =  ");
		}
		
		Triangulo triangulo = FigGeoBidimensional.criarTriangulo(ladoA, ladoB, ladoC);
		System.out.println(triangulo.getForma());
		System.out.println(triangulo);
	}
	
}
