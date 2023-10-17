import java.util.Scanner;

public class p2p7_1s21{
	public static void main(String[] args){
		char opc;
		Scanner teclado = new Scanner(System.in);
		boolean estado = true;

		do{
			System.out.println(" M e n u d e o p c i o n e s");
			System.out.println("1, - suma");
			System.out.println("2, - resta");
			System.out.println("3, - multiplicacion");
			System.out.println("4, - division");
			System.out.println("5, - salir");
			System.out.println("que opcion deseas? ");
			opc = teclado.nextLine().charAt(0);
			switch(opc){
			case '1': System.out.println("aqui va la suma");break;
			case '2': System.out.println("aqui va la resta");break;
			case '3': System.out.println("aqui va la multiplicacion");break;
			case '4': System.out.println("aqui va la division");break;
			
			case 'S':
			case 's':
			    System.out.println("aqui va la opcion de salir");
			    estado=false;
			    break;
			}
		}while(estado);
	}
}