package array;

public class EjercicioArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Recorrer un array de enteros y dar la cantidad total de numeros pares
		int contador = 0;
		int [] enteros = {4, 5, 6, 5, 9, 3, 1, 6, 1};
		
		for (int i=0; i<enteros.length;i++) {
			//int numero = enteros[i];
			
			if(enteros[i] %2 == 0) {
				contador++;
			}
		}
		System.out.println(contador);
	}

}
