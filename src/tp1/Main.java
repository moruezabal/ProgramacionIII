package tp1;

public class Main {

	public static void main(String[] args) {
		
		
		MySimpleLinkedList<Integer> listaNum = new MySimpleLinkedList<Integer>();
		listaNum.insertLast(9);
		listaNum.insertLast(5);
		listaNum.insertLast(3);
		listaNum.insertLast(4);
		System.out.println(listaNum.toString());
		System.out.println(listaNum.indexOf(8));
		
		
		MyIterator<Integer> it1 = listaNum.iterator();
		while(it1.hasNext()) {
			int valor = it1.next();
			System.out.println(valor);
		}
		
		}
		
}
