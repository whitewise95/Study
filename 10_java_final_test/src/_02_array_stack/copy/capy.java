package _02_array_stack.copy;


class ArrayStack{
	
	private int top;
	private	int stackSize;
	private char itemArray[];
	
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
			System.out.println("item = "+itemArray[top]);
		}
	}
	public char pop(){
		if(isEmpty()) {
			System.out.println("스택이 없습니다.");
			return 0;
			}
		else {
			return itemArray[top--];
		}
	}	
	
	
	public void print(){
		if(isEmpty()) {System.out.println("스택이 없습니다.");}
		else {
			for (int i = 0; i < itemArray.length; i++) {
				System.out.print("item >>>");
				System.out.print(itemArray[i]);
				if(i!=itemArray.length-1) {
					System.out.println(",");
				}
			}
			System.out.println();
		}
	}
}












public class capy {
	public static void main(String[] args) {
		ArrayStack e =new ArrayStack();
		
		
		e.push('차');
		e.print();

	}


}