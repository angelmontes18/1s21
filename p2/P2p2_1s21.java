public class P2p2_1s21{
	public static void main(String[] args) {
		int val=1;
		switch(val){
		case 1: System.out.println("se evalua a 1"); break;
		case 2: System.out.println("se evalua a 2"); break;
		case 3: System.out.println("se evalua a 3"); break;
		case 4: System.out.println("se evalua a 4"); break;
		case 5: System.out.println("se evalua a 5"); break;
		default: System.out.println("valor fuera del ramgo");

		}
		Character opc='a';
		switch(opc){
		case 'a': System.out.println("se evalua A");
		case 'b': System.out.println("se evalua B");
		case 'c': System.out.println("se evalua C");
		case 'd': System.out.println("se evalua D");
		case 'e': System.out.println("se evalua E");
		case 'f': System.out.println("se evalua F");		
		default: System.out.println("opcion no existe");
		}
		String cadena = "uno";
		switch (cadena) {
		case "uno": System.out.println("Uno");
		case "dos": System.out.println("Dos");
		case "tres": System.out.println("Tres");
		case "cuatro": System.out.println("Cuatro");
		default: System.out.println("no la opcion");
		}
	}
}