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
		
		System.out.println(pine.hasElem(1));
		System.out.println(pine.hasElem(2));
		System.out.println(pine.hasElem(3));
		System.out.println(pine.hasElem(4));
		System.out.println(pine.hasElem(5));
		System.out.println(pine.hasElem(6));
		System.out.println(pine.hasElem(7));
		System.out.println(pine.hasElem(8));
		System.out.println(pine.hasElem(9));
		System.out.println(pine.hasElem(10));

	}

}
