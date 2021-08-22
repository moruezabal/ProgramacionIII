package tp1;

public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		//this.last --> for insertLast
		this.size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		size++;
	}
	
	public T extractFront() {
		if(!this.isEmpty()) {
			T info = this.first.getInfo();
			this.first = this.first.getNext();
			size--;
			return info;	
		}
		return null;
	}

	public boolean isEmpty() {
		return this.first == null;
	}
	
	public T get(int index) {
		Node <T> cursor = this.first;
		T info = null;
		if(index >= 0 && index < this.size()) {
			for (int i = 0; i<= index; i++) {
				info = cursor.getInfo();
				cursor = cursor.getNext();
			}			
		}
		else {
			throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + this.size());
		}
		return info;
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		String content = "";
		Node <T> cursor = this.first;
		while(cursor != null) {
			content += cursor.getInfo() + " ";
			cursor = cursor.getNext();
		}
		return content;
	}
	
}
