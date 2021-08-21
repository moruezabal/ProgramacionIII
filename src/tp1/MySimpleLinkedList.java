package tp1;

public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	
	public MySimpleLinkedList() {
		this.first = null;
		//this.last --> for insertLast
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
	}
	
	public T extractFront() {		
		T info = this.first.getInfo();
		this.first = this.first.getNext();
		return info;
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
		int _size = 0;
		Node <T> cursor = this.first;
		while(cursor != null) {
			_size++;
			cursor = cursor.getNext();
		}
		return _size;
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
