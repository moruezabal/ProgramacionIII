package tp1;

public class Main {

	public static void main(String[] args) {
		MySimpleLinkedList<Integer> listaNum = new MySimpleLinkedList<Integer>();
		listaNum.insertLast(9);
		listaNum.insertFront(5);
		listaNum.insertLast(3);
		System.out.println(listaNum.toString());
		listaNum.extractFront();
		listaNum.insertLast(4);
		System.out.println(listaNum.toString());
		System.out.println("Tamaño: " + listaNum.size());
		}
}
