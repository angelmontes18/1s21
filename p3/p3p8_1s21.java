import java.util.Scanner;
public class p3p8_1s21{
	static int numero;
	public static void f(int a, int b) {
		int c = a + b;
		if (c<numero){
			System.out.println("  " + c);
			f(b,c);
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("hasta que numero quieres");
		 int numero = teclado.nextInt();
		System.out.println("0  \n1");
		f(0,1);
		System.out.println();
	}
}