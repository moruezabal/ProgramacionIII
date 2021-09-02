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
		
		System.out.println(toBinary(14));
		
//		int [] numbers = {5,8,1,7,0,3};
//		quicksort(numbers);
//		for (int number : numbers)
//			System.out.print(number + " ");
		
//		long T1 = System.currentTimeMillis();	
//		for(int i = 0; i<10000;i++) {
//			seleccion(createArrNumRandom(10000));
//		}
//		long T2 = System.currentTimeMillis();
//		System.out.println(T2-T1);

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
	
	public static String toBinary(int decimal) {
		if (decimal>0) {
			return toBinary((int)decimal/2) + String.valueOf(decimal % 2);
		}
		else {
			return "";
		}
	}
	
	public static void burbujeo(int[] A) { // O(n2)
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
	}
	
	public static void seleccion(int A[]) { // O(n2)
      int i, j, menor, pos, tmp;
      for (i = 0; i < A.length - 1; i++) {      
            menor = A[i];                                         
            pos = i;                            
            for (j = i + 1; j < A.length; j++){ 
                  if (A[j] < menor) {           
                      menor = A[j];             
                      pos = j;
                  }
            }
            if (pos != i){                                        
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
      }
	}
	
	public static int[] mergeSort(int a[]) { // O(n.log n)
		return divide(a, a.length);
		}

	public static int[] divide(int a[], int n) {
		if (n > 1) {
			if (n % 2 == 0) {
				int a1[] = new int[n / 2];
				int a2[] = new int[n / 2];
				
				for (int i = 0; i < n; i++) {
					if (i < n / 2) {
						a1[i] = a[i];
					} else {
						int ind = i - (n / 2);
						a2[ind] = a[i];
					}
				}
				return combina(divide(a1, n / 2), divide(a2, n / 2), n);
			} else {
				int a1[] = new int[(n - 1) / 2];
				int a2[] = new int[(n + 1) / 2];
				
				for (int j = 0; j < n; j++) {
					if (j < (n - 1) / 2) {
						a1[j] = a[j];
					} else {
						int ind = j - ((n - 1) / 2);
						a2[ind] = a[j];
					}
				}
				return combina(divide(a1, (n - 1) / 2), divide(a2, (n + 1) / 2), n);
			}
		} else {
			return a;
		}
	}

	public static int[] combina(int a1[], int a2[], int n) {
		int i = 0, j = 0, k = 0;
		int z[] = new int[n];
		
		if (n % 2 == 0) {
			while (k < n) {
				if (i >= (n / 2)) {
					z[k] = a2[j];
					j++;
				} else if (j >= (n / 2)) {
					z[k] = a1[i];
					i++;
				} else if (a1[i] <= a2[j]) {
					z[k] = a1[i];
					i++;
				} else {
					z[k] = a2[j];
					j++;
				}
					k++;
			}
			return z;
		} else {
			while (k < n) {
				if (i >= ((n - 1) / 2)) {
					z[k] = a2[j];
					j++;
				} else if (j >= ((n + 1) / 2)) {
					z[k] = a1[i];
					i++;
				} else if (a1[i] <= a2[j]) {
					z[k] = a1[i];
					i++;
				} else {
					z[k] = a2[j];
					j++;
				}
				k++;
			}
			return z;
		}
	}
	
	//En el peor caso, cuando el pivote es el elemento menor del array el tiempo de ejecución del método Quicksort es O(n2).
	//En general el tiempo medio de ejecución del Quicksort es O(n log n).
	public static void quicksort(int A[]) { 
		quicksort(A, 0, A.length -1);
	}
	
	private static void quicksort(int A[], int izq, int der) {

	  int pivote=A[izq]; // tomamos primer elemento como pivote
	  int i=izq;         // i realiza la búsqueda de izquierda a derecha
	  int j=der;         // j realiza la búsqueda de derecha a izquierda
	  int aux;
	 
	  while(i < j){                          // mientras no se crucen las búsquedas                                   
	     while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
	     while(A[j] > pivote) j--;           // busca elemento menor que pivote
	     if (i < j) {                        // si no se han cruzado                      
	         aux= A[i];                      // los intercambia
	         A[i]=A[j];
	         A[j]=aux;
	     }
	  }
	   
	   A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
	   A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
	   
	   if(izq < j-1)
	      quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
	   if(j+1 < der)
	      quicksort(A,j+1,der);          // ordenamos subarray derecho
	}
	
	public static int [] createArrNumRandom( int size) {
		int [] arr = new int[size];
		
		for (int i = 0; i<size; i++)
			arr[i] = (int)Math.floor(Math.random()*9);
		
		return arr;
	}

}
