package tp2e;

import java.util.ArrayList;

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
		if (this.isEmpty()) 
            return 0;
        else {
        	if(this.left != null && this.right != null)
        		return (1 + Math.max((this.left.getHeight()), (this.right.getHeight())));
        	else if (this.left != null) 
        		return (1 + this.left.getHeight());
        	else if (this.right != null) 
        		return (1 + this.right.getHeight());
        	else
        		return 1;
        }
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
	
	public ArrayList<Integer> getLongestBranch() {
		return this.getLongestBranch(new ArrayList<Integer>());
	}
	
	private ArrayList<Integer> getLongestBranch(ArrayList<Integer> largest) {
		
		return largest;
	}
	
	public ArrayList<Integer> getFrontera() {
		return getFrontera(new ArrayList<Integer>());
	}
	
	private ArrayList<Integer> getFrontera(ArrayList<Integer> leaves) {
		if(!this.isEmpty()) {
			if(this.isLeaf())
				leaves.add(this.value);
			else if (this.left != null && this.right != null){
				ArrayList<Integer> leavesLeft = this.left.getFrontera(new ArrayList<Integer>());
				ArrayList<Integer> leavesRight = this.right.getFrontera(new ArrayList<Integer>());
				leavesLeft.addAll(leavesRight);
				leaves.addAll(leavesLeft);
			} else if (this.left != null) {
				ArrayList<Integer> leavesLeft = this.left.getFrontera(new ArrayList<Integer>());
				leaves.addAll(leavesLeft);
			} else {
				ArrayList<Integer> leavesRight = this.right.getFrontera(new ArrayList<Integer>());
				leaves.addAll(leavesRight);
			}
		}
		return leaves;
	}
	
	private boolean isLeaf() {
	        boolean leaf = false;
	        if( this.left == null && this.right == null) {
	            leaf = true;
	        }
	        return leaf;
	    }
	
	public int getMaxElem() {
		if(this.right != null) {
			return this.right.getMaxElem();
		}
		return this.value;
	}
	
	public ArrayList<Integer> getElemAtLevel(int level) {
		return getElemAtLevel(level, new ArrayList<Integer>());
	}
	
	private ArrayList<Integer> getElemAtLevel(int level, ArrayList<Integer> elements){
		
		if (!this.isEmpty()) {
			if (level == 0) {
				elements.add(this.value);
			}
			else {
				if(this.left != null && this.right != null) {
					this.left.getElemAtLevel(level-1, elements);
					this.right.getElemAtLevel(level-1, elements);
				}
				else if(this.left != null) {
					this.left.getElemAtLevel(level-1, elements);
				}
				else {
					this.right.getElemAtLevel(level-1, elements);
				}
			}	
		}
		return elements;
	}
	
	

}
