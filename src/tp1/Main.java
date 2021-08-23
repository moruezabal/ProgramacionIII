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
		
		
		/*Stack<Integer> pila = new Stack<Integer>();
		pila.push(9);
		pila.push(7);
		pila.push(3);
		pila.push(2);
		pila.reverse();
		System.out.println(pila.top()); */
		
		}
		
}
