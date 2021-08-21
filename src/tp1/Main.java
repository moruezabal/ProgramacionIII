package tp1;

public class Main {

	public static void main(String[] args) {
		MySimpleLinkedList<Integer> listaNum = new MySimpleLinkedList<Integer>();
		listaNum.insertFront(5);
		listaNum.insertFront(9);
		listaNum.insertFront(2);
		listaNum.insertFront(7);
		listaNum.insertFront(3);
		System.out.println(listaNum.toString());
		}

}
