package tp2e;

public class Main {

	public static void main(String[] args) {
		
		Tree pine = new Tree(8);
		
		pine.add(5);
		pine.add(6);
		pine.add(9);
		pine.add(2);
		pine.add(4);
		pine.add(1);
		pine.add(10);
		
		pine.printPosOrder();
		System.out.println("");
		pine.printPreOrder();
		System.out.println("");
		pine.printInOrder();
		System.out.println(pine.getMaxElem());

	}

}
