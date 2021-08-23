package tp1;

public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	private Node<T> last;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		if (this.first.getNext() == null) {
			this.last = this.first;
		}
		size++;
	}
	
	public T extractFront() {
		if(!this.isEmpty()) {
			T info = this.first.getInfo();
			this.first = this.first.getNext();
			if (this.first == null) {
				this.last = null;
			}
			else if (this.first.getNext() == null) {
				this.last = this.first;
			}
			size--;
			return info;	
		}
		return null;
	}
	
	public void insertLast(T info) {
		Node<T> tmp = new Node<T>(info,null);
		if (this.last != null) {
			this.last.setNext(tmp);
		} else {
			this.first = tmp;
		}
		this.last = tmp;
		size++;
		
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
	
	public int indexOf(T o) {
		Node <T> cursor = this.first;
		int index = 0;
		for (int i= 0; i< this.size(); i++) {
			if(cursor.getInfo() == o) {
				return index;
			}
			cursor = cursor.getNext();
			index++;
		}
		return -1;
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
