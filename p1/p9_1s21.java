import java.util.Scanner;

public class p9_1s21{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n,a,b;
		System.oout.println(x: "ingresa un numero");
		a = leer.nextlnt();
		b = leer.nextlnt();
        System.out.println(x:"Ingresa una opcion:\n 1= suma\n2= resta\n3= multiplicacion\n4= division");
        n = leer.nextlnt();
        switch(n);
           case 1:
           	System.out.println("La suma de los numeros es: "+(a+b));
           	break;
           case 2:
           	System.out.println("La resta de los numeros es: "+(a+b));
           	break;
           case 3:
           	System.out.println("la multiplicacion de los numeros es:"+(a*b));
           	break;
           case 4:
           	System.out.println("la division de los numeros es: "+(a/b));
           	break;
           default:
           	System.out.println("Ingresa un numero");
	    }
	    leer.close();
	}