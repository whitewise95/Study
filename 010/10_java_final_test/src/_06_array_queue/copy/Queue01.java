package _06_array_queue.copy;
class ArrayQueue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	

	public  ArrayQueue(int queueSize) {
		front =-1;
		rear =-1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}
	
	boolean isEmpty() {
		return (front==rear);
	}
	boolean isFull() {
		return (rear==this.queueSize-1);
	}
	
	void enQueue(char item) {
		if(isEmpty()) {
			front = -1;
			rear = -1;
		}
		if(isFull()) {
			System.out.println("데이터가 가득 찼습니다.");
		}
		else {
			itemArray[++rear]=item;
			System.out.println("insertItem= "+item);
		}
	}
	
	char deQueue() {
		if(isEmpty()){
			System.out.println("데이터가 없습니다.");
			return  0;
		}
		else {
			return  itemArray[++front];
		}
	}
	
	void queuePrint() {
		if(isEmpty() ) {System.out.println("데이터가 없습니다.");}
		else {
			System.out.printf("%s \n","itemArray >>");
			for (int i = front+1; i <=rear; i++) {
				System.out.printf(" %c",itemArray[i]);
				if(i!=rear) {System.out.print(",");}
			}
			System.out.println();
		}
	}
	

}

public class Queue01{
	public static void main(String args[]){
		int queueSize = 3;
		 ArrayQueue Q = new  ArrayQueue (queueSize);
		 char item;
		 
		 Q.enQueue('백');
		 Q.enQueue('현');
		 Q.enQueue('명');
		 Q.queuePrint();
		System.out.println("==============");
		item = Q.deQueue();
		if(item!=0) {
		System.out.println("deQueue : "+item);
		}
		 Q.queuePrint();
		 Q.deQueue();
		 Q.deQueue();
		 Q.enQueue('백');
		 Q.queuePrint();
	}
}