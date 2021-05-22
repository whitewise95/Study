package _01_list.copy;

class linkedList{
	
	private Node head;
	
	
	void addFirstList(String data) {
		Node newNode = new Node(data);
		newNode.link = head;
		head = newNode;
	}
	
	void addMiddleList(String index , String data) {
		Node newNode = searchNode(index);
		if(newNode!=null) {
			Node temp= newNode.link;
			Node pre = new Node(data);
			newNode.link =pre;
			pre.link =temp;
		}
		else {System.out.println("찾는 데이터가 없습니다.");}
	}
	
	
	void addList(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp = head;
			while(temp.link!=null)
				temp =temp.link;
			temp.link = newNode;
		}
	}
	
	void reverseList() {
		Node next = head;
		Node temp = null;
		Node pre = null;
		while(next!=null) {
			pre = temp;
			temp = next;
			next = next.link;
			temp.link = pre;
		}
		head= temp;
	}
	
	Node searchNode(String data) {
		Node newNode = new Node(data);
		Node  searchNode = head;
		while(searchNode!=null) {
			if(newNode.getList()==searchNode.getList()) {
				return searchNode;
			}
			searchNode = searchNode.link;
		}
		
		
		return searchNode;
	}
	
	
	
	
	
	
	
	
	
	
	void getList() {
		Node newNode = head;
		System.out.print("L= ");
		while(newNode!=null) {
			System.out.print(newNode.getList());
			if(newNode.link!=null) {
				System.out.print(",");
			}
			newNode = newNode.link;
		}
	}

	
}

class Node{
	
	private String data;
	public Node link;
	
	public Node(String data) {
		this.data = data;
		this.link = link;
	}
	public Node(String data, Node link) {
		this.data = data;
		this.link = link;
	}
	public String getList() {
		return this.data;
	}
	
	
	
	
}
	
