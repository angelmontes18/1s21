import java.util.Scanner;
import java.lang.Math;

public class EXAM4_1s21{
	public static void main(String[] args) {
		java.util.Scanner teclado= new Scanner(System.in);
		double radio;
		double area;
		double longitud;
		System.out.println("calcular el area y longitud de un circulo");
		System.out.println("escribe el radio");
		radio= teclado.nextInt();
		area= Math.PI*Math.pow(radio,2);
		//area = PI*r^2
		longitud= 2*Math.PI*radio;
		//longitud = 2*PI*r;
		System.out.println("El resultado del area es: "+ area);
		System.out.println("el resultado de la longitud es: "+longitud);
	}
}
