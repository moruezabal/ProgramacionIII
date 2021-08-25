package tp1;

public class Main {

	public static void main(String[] args) {
			
		MySimpleLinkedList<Integer> listaNum1 = new MySimpleLinkedList<Integer>();
		listaNum1.insertLast(9);
		listaNum1.insertLast(3);
		listaNum1.insertLast(5);
		listaNum1.insertLast(4);
		listaNum1.insertLast(2);
		System.out.println(listaNum1.toString());
		
		MySimpleLinkedList<Integer> listaNum2 = new MySimpleLinkedList<Integer>();
		listaNum2.insertLast(8);
		listaNum2.insertLast(5);
		listaNum2.insertLast(4);
		listaNum2.insertLast(6);
		listaNum2.insertLast(9);
		System.out.println(listaNum2.toString());
		
		System.out.println(listaEnComunDesord(listaNum1, listaNum2).toString());	
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
	
}
