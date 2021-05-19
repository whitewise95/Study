package _01_list.copy;

public class List2{
	
	public static void main(String args[]){
				
		linkedList list = new linkedList();
		
		list.addList("월");
		list.addList("화");
		list.addList("수");

		list.addList("목");
		
		list.printList();

		System.out.println(list.searchNode("수"));
		list.middleDataAdd("화","일");
		list.printList();
		
		
		
	
	}
}
