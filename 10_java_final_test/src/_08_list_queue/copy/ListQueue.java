package _08_list_queue.copy;



interface Queue{
	boolean isEmpty();
	void enQueue(char item);
	char deQueue();
	void delete();
	char peek();
}

class ListQueue{
	char data ;
	ListQueue link ;
}



class LinkedQueue implements Queue{
	
	ListQueue front;
	ListQueue rear;
	
	public LinkedQueue() {
		front = null;
		rear = null;
	}

	@Override
	public boolean isEmpty() {
		return (front == null);
	}

	@Override
	public void enQueue(char item) {
		ListQueue newNode = new ListQueue();
		newNode.data = item;
		newNode.link = null;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.link=newNode;
			rear=newNode;
		
		}
	}

	@Override
	public char deQueue() {
		return 0;
	}

	@Override
	public void delete() {
		
	}

	@Override
	public char peek() {
		return 0;
	}}
	



public class ListQueue{
	public static void main(String args[]){		

	}
}