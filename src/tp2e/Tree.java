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
		//TO DO
		return 0;
	}
	
	public boolean hasElem(int elem) {
		//TO DO
		return false;
	}
	
	public boolean isEmpty() {
		//TO DO
		return false;
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
		//TO DO
	}
	
	public void printPreOrder() {
		//TO DO
	}
	
	public void printInOrder() {
		//TO DO
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
