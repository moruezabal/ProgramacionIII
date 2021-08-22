package tp1;

public class Main {

	public static void main(String[] args) {
		MySimpleLinkedList<Integer> listaNum = new MySimpleLinkedList<Integer>();
		listaNum.extractFront();
		listaNum.insertFront(5);
		listaNum.insertFront(9);
		listaNum.insertFront(5);
		listaNum.insertFront(9);
		System.out.println(listaNum.size());
		listaNum.extractFront();
		System.out.println(listaNum.size());
		System.out.println(listaNum.toString());
		}
}
