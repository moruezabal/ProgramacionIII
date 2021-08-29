package tp2;

public class Main {

	public static void main(String[] args) {
		
		int [] numeros = {3,3,4,6,9}; 
		System.out.println(estaOrdenado(numeros));
	}
	
	public static boolean estaOrdenado(int array[]) {
		return estaOrdenado(array, 0);
		
	}
	
	private static boolean estaOrdenado(int array[], int index) {
		boolean ordenado = true;
		if(index < array.length-1) {
			if(array[index] <= array[index+1])
				ordenado = estaOrdenado(array, index+1);
			else
				ordenado = false;
		}	
		return ordenado;
	};
	
	
}
