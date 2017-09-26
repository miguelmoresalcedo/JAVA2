package calculator;
import java.util.Scanner;

public class EjercicioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		int caso = 0;
		
		Scanner entrada = new Scanner(System.in);
	
			System.out.println("Super Calculadora");
			System.out.println("<----------------->");
			
			System.out.println("Introduce el primer numero");
			numero1 = entrada.nextInt();
			
			System.out.println("Introduce el segundo numero");
			numero2 = entrada.nextInt();
			
			System.out.println("Selecciona la operacion que quieres realizar(1 suma, 2 resta, 3 division, 4 multiplicacion):");
			caso = entrada.nextInt();
			
			switch(caso){
			case 1:
				resultado = numero1 + numero2;
				System.out.println("La suma es:" + numero1 + "+" + numero2 + "=" + resultado);
				break;
			case 2:
				resultado = numero1 - numero2;
				System.out.println("La resta es:" + numero1 + "-" + numero2 + "=" + resultado);
				break;
			case 3:
				resultado = numero1 / numero2;
				System.out.println("La division es:" + numero1 + "+" + numero2 + "=" + resultado);
				break;
			case 4:
				resultado = numero1 * numero2;
				System.out.println("La multiplicación es:" + numero1 + "+" + numero2 + "=" + resultado);
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			
			}
			
			
		

	}

}
