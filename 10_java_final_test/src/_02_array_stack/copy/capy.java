package _02_array_stack.copy;


class ArrayStack{
	
	private int top;
	private	int stackSize;
	private char itemArray[];
	
	public ArrayStack( int stackSize) {
		top=-1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}
	


	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (top==stackSize-1);
	}
	public void push(char item) {
		if(isFull()) {System.out.println("스택이 다 찼습니다.");}
		else {
			itemArray[++top] = item;
			System.out.println("Inserted Item = "+itemArray[top]);
		
		}
	}
	public char pop(){
		if(isEmpty()) {
			System.out.println("스택이 없습니다.");
			return 0;
			}
		else {return itemArray[top--];}
	}	
	
	
	public void print(){
		if(isEmpty()) {System.out.println("스택이 없습니다.");}
		else {
			System.out.print("Array Stack> >>>");
			for (int i = 0; i <=top ; i++) {
				System.out.print(itemArray[i]);
				if(i!=itemArray.length-1) {
					System.out.print(",");
				}
			}
			System.out.println();
			System.out.println();
		}
	}
}



public class capy {
	public static void main(String[] args) {
		int stackSize = 5;
		ArrayStack e =new ArrayStack(stackSize);
		
		
		
		e.push('차');
		e.print();
		e.push('도');
		e.print();
		e.push('로');
		e.print();
	
		
		char deleted = e.pop();
		if(deleted!=0) {
		System.out.println("deleted Item :"+ deleted);
		}
		e.print();
	
		

	}
}