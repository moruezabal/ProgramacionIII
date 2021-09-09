package tp2e;

public class Tree {

	private Integer value;
	private Tree left;
	private Tree right;

	public Tree(Integer value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void add(Integer newValue) {
		if (this.value == null)
			this.value = newValue;
		else {
			if (this.value > newValue) {
				if (this.left == null)
					this.left = new Tree(newValue);
				else
					this.left.add(newValue);
			} else if (this.value < newValue) {
				if (this.right == null)
					this.right = new Tree(newValue);
				else
					this.right.add(newValue);
			}
		}
	}
	
	public int getRoot() {
		return this.value;
	}
	
	public boolean hasElem(int elem) {
		if (this.value == null)
			return false;
		else {
			if(this.value == elem)
				return true;
			else if(this.value > elem) {
				if(this.left != null) {
					return this.left.hasElem(elem);
				}
				else {
					return false;
				}	
			}
			else {
				if(this.right != null) {
					return this.right.hasElem(elem);
				}
				else {
					return false;
				}
			}
		}
	}
	
	public boolean isEmpty() {
		return this.value == null;
	}
	
	public boolean delete(int value) {
		//TO DO
		return false;
	}
	
	public int getHeight() {
		//TO DO
		return 0;
	}
	
	public void printPosOrder() {
		if(!isEmpty()) {
			if(this.left != null)
				this.left.printPosOrder();
			if(this.right != null)
				this.right.printPosOrder();
			System.out.print(this.value + " ");
		}
	}
	
	public void printPreOrder() {
		if(!isEmpty()) {
			System.out.print(this.value + " ");
			if(this.left != null)
				this.left.printPosOrder();
			if(this.right != null)
				this.right.printPosOrder();	
		}
	}
	
	public void printInOrder() {
		if(!isEmpty()) {
			if(this.left != null)
				this.left.printPosOrder();
			System.out.print(this.value + " ");
			if(this.right != null)
				this.right.printPosOrder();	
		}
	}
	
	public int[] getLongestBranch() {
		int [] list = {};
		//TO DO
		return list;
	}

	public int[] getFrontera() {
		int [] list = {};
		//TO DO
		return list;
	}
	
	public int getMaxElem() {
		return 0;
	}
	
	public int[] getElemAtLevel(int level) {
		int [] list = {};
		//TO DO
		return list;
	}
	
	
	

}
