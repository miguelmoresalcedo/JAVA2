
public class Ejercicio10 {
	/*Ejercicio 10: Implementar un programa que dado un n�mero
	entero positivo obtenga su correspondiente n�mero binario.*/
	
	public static void main(String[] args) {
		int numero = 127;
		String binario = "";
		
		do{
			binario += numero % 2;
			numero /= 2;
		} while(numero > 0);
		
		for(int i = binario.length() - 1; i >= 0; i--)
			System.out.print(binario.charAt(i));
		
	}
	
}
