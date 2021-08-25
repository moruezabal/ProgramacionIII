package tp1;

public class Main {

	public static void main(String[] args) {
		
		
		MySimpleLinkedList<Integer> listaNum1 = new MySimpleLinkedList<Integer>();
		listaNum1.insertLast(2);
		listaNum1.insertLast(3);
		listaNum1.insertLast(4);
		listaNum1.insertLast(5);
		listaNum1.insertLast(9);
		System.out.println(listaNum1.toString());
		
		MySimpleLinkedList<Integer> listaNum2 = new MySimpleLinkedList<Integer>();
		listaNum2.insertLast(2);
		listaNum2.insertLast(4);
		listaNum2.insertLast(5);
		listaNum2.insertLast(6);
		listaNum2.insertLast(9);
		System.out.println(listaNum2.toString());
		
		System.out.println(listaEnComun(listaNum1, listaNum2).toString());
		
		
//		MyIterator<Integer> it1 = listaNum.iterator();
//		while(it1.hasNext()) {
//			int valor = it1.next();
//			System.out.println(valor);
//		}
		
	}
	
	public static MySimpleLinkedList<Integer> listaEnComun(MySimpleLinkedList<Integer> l1, MySimpleLinkedList<Integer>l2){
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
}
