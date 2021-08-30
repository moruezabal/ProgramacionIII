package tp2;

public class Main {

	public static void main(String[] args) {
		
//		int [] numeros = {3,3,4,6,9}; 
//		System.out.println(estaOrdenado(numeros));
		
//		MySimpleLinkedList<Integer> listaNum1 = new MySimpleLinkedList<Integer>();
//		for(int i = 0; i < 10; i++) {
//			listaNum1.insertLast((int)Math.floor(Math.random()*9));
//		}
//		System.out.println(listaNum1.toString());
//		System.out.println(findElementIT(listaNum1,4));
		
//		int [] numbers = {2,4,5,7,9}; 
//		System.out.println(findElementORD(numbers, 7));
		
		System.out.println(toBinary(82,""));
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
	}
	
	public static int findElement(MySimpleLinkedList<Integer> list, int num) {
		return findElement(list, num, 0);
	}
	
	private static int findElement(MySimpleLinkedList<Integer> list, int num, int index) {
		int find = -1;
		if (index < list.size()) {
			if(list.get(index) != num) // Atención: El get recorre itera siempre desde el primer elemento, aumentando la complejidad
				find = findElement(list, num, index+1);
			else
				find = index;
		}
		return find;
	}
	
	public static int findElementORD(int [] arr, int num) {
		return findElementORD(arr, num, 0);
	}
	
	private static int findElementORD(int [] arr, int num, int index) {
		int find = -1;
		if(index < arr.length) {
			if (arr[index] == num){
				find = index;
			}
			else if (arr[index] < num) {
				find = findElementORD(arr, num, index+1);
			}
		}
		return find;
	}
	
	public static int findElementIT(MySimpleLinkedList<Integer> list, int num) {
		MyIterator<Integer> it1 = list.iterator();
		return findElementIT(list, num, it1, 0);
	}
	
	private static int findElementIT(MySimpleLinkedList<Integer> list, int num, MyIterator<Integer> it, int index) {
		int find = -1;
		if (it.hasNext()) {
			if(it.next() != num) {
				index++;
				find = findElementIT(list, num, it, index);
			}
			else {
				find = index;
			}
		}
		
		return find;
	}
	
	public static int toBinary(int decimal) {
		return Integer.parseInt(toBinary(decimal, ""));
	}
	
	private static String toBinary(int decimal, String binary) {
		
		binary = String.valueOf(decimal % 2);
		decimal = (int)decimal/2;
		if (decimal>0) {
			binary += toBinary(decimal, binary);
		}
		return binary;
	}
	
	
}
