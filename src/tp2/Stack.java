package tp2;

public class Stack<T> {
	private MySimpleLinkedList<T> list;
	
	public Stack(){
		this.list = new MySimpleLinkedList<T>();
	}
	
	public void push(T o) {
		this.list.insertFront(o);
	}
	
	public T pop() {
		return this.list.extractFront();	
	}
	
	public T top() {
		return this.list.get(0);
	}

	public void reverse() {
		MySimpleLinkedList<T> aux = new MySimpleLinkedList<>();
		for(int i = 0; i<this.list.size(); i++) {
			aux.insertFront(this.list.get(i));
		}
		this.list = aux;
	}
	
	public String toString() {
		return this.list.toString();
	}
}
