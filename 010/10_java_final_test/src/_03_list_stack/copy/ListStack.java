package _03_list_stack.copy;

interface Stack{
	
	boolean isEmpty();           //블린을 메소드로만들지않고 미리 만들어둔 이유
	void push(char item);		//메소드를 이렇게 만든 이유?
	char pop();				
	void delete();
	char peek();
	
}


class StackNode{
	
	char data;
	StackNode link;
	
}


class LinkedStack implements Stack{
	

	
	private StackNode top;
	
	@Override
	public boolean isEmpty(){
		return (top == null);
	}

	@Override
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data=item;
		newNode.link=top;
		top = newNode;
		System.out.println("Inserted Item = "+item);
	}

	@Override
	public char pop() {
		if(isEmpty()) {System.out.println("스택이 없습니다.");}
		else {
			StackNode temp = top;
			StackNode newNode = top.link;
			top = newNode;
			return temp.data;
		}
		return 0;
	}

	@Override
	public void delete() {
		
		
	}

	@Override
	public char peek() {
	
		return 0;
	}
	
	public void print() {
		if(isEmpty()) {System.out.println("스택이 없습니다.");}
		else {
			StackNode newNode = top;
			System.out.println("Linked Stack>>");
			while(newNode!=null){
				System.out.printf("\t %c \n",newNode.data);
				newNode = newNode.link;
			}
		}
		System.out.println();
	
	}
		
}

public class ListStack{
	public static void main(String args[]){		
		
		LinkedStack e = new LinkedStack();
		
		e.push('로');
		e.print();
		e.push('도');
		e.print();
		e.push('차');
		e.print();
		
		
		char del=e.pop();
		if(del !=0) {
			System.out.println("delList ="+del);
		}
		e.print();
	}
}