import java.util.Scanner;

public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ciclo for
		 * for(variable de inicializacion,variable inicializada < parametro
		 * ; variable++)*/
		/*
		for(int i=5; i < 50; i+= 5) {
			System.out.println(i);
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero para mostrarte su tabla de "
				+ "multiplicar");
		int num1 = sc.nextInt();
		
		multiplicar(num1);
	}
	
	public static void multiplicar(int num1) {
		System.out.println("Tabla seleccionada " + num1);
		for(int i=1; i <= 10; i++) {
			System.out.println(i +" x " + num1 + " = " + (i * num1));
		}
	}

}
