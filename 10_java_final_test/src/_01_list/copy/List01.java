package _01_list.copy;

class linkedList{
	
	private linkList head;
	

	
	void addList(String data) {
		linkList newNode = new linkList(data);
		if(head==null)
			head=newNode;
		
		else {
			linkList temp = head;
			while(temp.link!=null) {
				temp= temp.link;
			}
			temp.link = newNode;
		}
	}
	
	void middleDataAdd(String data , String insert) {
		linkList newNode = addSearchNode(data);
		if(newNode==null) {return;}
		else {
			linkList addNode = new linkList(insert);
			linkList temp= newNode.link;
			newNode.link = addNode;
			addNode.link=temp;
			
		}
	}
	
	void addFirst(String data) {
		linkList newNode = new linkList(data);
		linkList temp = head;
		head = newNode;
		newNode.link = temp;
	}
	
	void del_LastList() {
		if(head==null) return;
		if(head.link==null) head=null;
		else {
			linkList pre = head;
			linkList temp = head.link;
			while(temp.link!=null) {
				pre = temp;
				temp =temp.link;
			}
			pre.link=null;
			
		}
	}
	public linkList addSearchNode(String data) {
		linkList newNode =head;
		while(newNode!=null) {
			if(newNode.getData().equals(data)) {
				return newNode;
			}
			newNode =  newNode.link;
		}
		
		return head;
	}
	
	
	public String searchNode(String data) {
		linkList newNode =head;
		while(newNode!=null) {
			if(newNode.getData().equals(data)) {
				return data;
			}
			 newNode =  newNode.link;
		}
		
		return "찾는 데이터가 없습니다.";
	}
	
	
	
	void printList() {
		linkList newNode = head;
		System.out.print("L= ");
		while(newNode!=null) {
			System.out.print(newNode.getData());
			if(newNode.link!=null) {
				System.out.print(",");
			}
			newNode = newNode.link;
		}
		System.out.println();
	}
}

class linkList{
	 
	 private String data;
	 linkList link;
	 
	
	public linkList(String data) {
		 this.data =data;
		 this.link = null;
				 
	 }
	public String getData() {
		return this.data;
		
	}
	 
 }

	
	
