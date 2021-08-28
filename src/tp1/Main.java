package tp1;

public class Main {

	public static void main(String[] args) {
		
		MySimpleLinkedList<Integer> listaNum1 = new MySimpleLinkedList<Integer>();
		for(int i = 0; i < 6; i++) {
			listaNum1.insertLast((int)Math.floor(Math.random()*9));
		}
		System.out.println(listaNum1.toString());
		System.out.println(esCapicua(listaNum1));
		
		MySimpleLinkedList<Integer> listaNum2 = new MySimpleLinkedList<Integer>();
		
		listaNum2.insertLast(2);
		listaNum2.insertLast(3);
		listaNum2.insertLast(8);
		listaNum2.insertLast(5);
		listaNum2.insertLast(8);
		listaNum2.insertLast(3);
		listaNum2.insertLast(2);
		
		System.out.println(listaNum2.toString());
		System.out.println(esCapicua(listaNum2));
		
//		System.out.println(esCapicua("neuquen"));

//		System.out.println(listaNum1.toStringReverse());
		
//		MySimpleLinkedList<Integer> listaNum2 = new MySimpleLinkedList<Integer>();
//		for(int i = 0; i < 5; i++) {
//			listaNum2.insertLast((int)Math.floor(Math.random()*9));
//		}
//		System.out.println(listaNum2.toString());
//		
//		System.out.println(primeraSiSegundaNo(listaNum1, listaNum2).toString());	
	}
	
	public static MySimpleLinkedList<Integer> listaEnComunOrd(MySimpleLinkedList<Integer> l1, MySimpleLinkedList<Integer>l2){
		MySimpleLinkedList<Integer> result = new MySimpleLinkedList<Integer>();
		MyIterator<Integer> it1 = l1.iterator();
		MyIterator<Integer> it2 = l2.iterator();
		
		
		while(it1.hasNext() && it2.hasNext()) {
			if(it1.current()< it2.current()) {
				it1.next();
			}
			else if (it2.current() < it1.current()) {
				it2.next();
			}
			else {
				result.insertLast(it1.current());
				it1.next();
				it2.next();			
			}
		}
		return result;
	}
	
	public static MySimpleLinkedList<Integer> listaEnComunDesord(MySimpleLinkedList<Integer> l1, MySimpleLinkedList<Integer>l2){
		MySimpleLinkedList<Integer> result = new MySimpleLinkedList<Integer>();
		
		for (Integer numA : l1) {
			for (Integer numB : l2) {
				if(numA == numB) {
					result.insertLast(numA);
				}
			}
		}
		return result;
	}
	
	public static MySimpleLinkedList<Integer> primeraSiSegundaNo(MySimpleLinkedList<Integer> l1, MySimpleLinkedList<Integer>l2){
		MySimpleLinkedList<Integer> result = new MySimpleLinkedList<Integer>();
		MyIterator<Integer> it1 = l1.iterator();
		MyIterator<Integer> it2 = l2.iterator();
		
		while(it1.hasNext()) {
			int num1 = it1.next();
			boolean match = false;
			while(!match && it2.hasNext()) {
				int num2 = it2.next();
				if(num1 == num2) {
					match = true;
					it2 = l2.iterator();
				}
			}
			if (!match) {
				result.insertLast(num1);
			}
			it2 = l2.iterator();
		}
		return result;
	}
	
	public static boolean esCapicua(MySimpleLinkedList<Integer> list) {
		MyIterator<Integer> it1 = list.iterator();
		MyIterator<Integer> it2 = list.iteratorLast();
		
		if(list.isEmpty())
			return false;
		
		for (int i = 1; i <= list.size()/2; i++) {
			if (it1.next() != it2.previous())
				return false;
			
		}
		return true;
	}
	
	public static boolean esCapicua(String palabra) {
		int i = 0;
		int j = palabra.length() -1;
		while(i<j) {
			if(palabra.charAt(i) != palabra.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
