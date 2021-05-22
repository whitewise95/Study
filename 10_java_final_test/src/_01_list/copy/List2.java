package _01_list.copy;

public class List2{
	
	public static void main(String args[]){
				
		linkedList list = new linkedList();
		
		
		list.addList("수");
		list.addList("목");
		list.getList();
		System.out.println();
		System.out.println("======================");
		list.addFirstList("월");
		list.getList();
		list.addMiddleList("월","화");
		System.out.println();
		System.out.println("======================");
		list.getList();
		System.out.println();
		System.out.println("======================");
		list.reverseList();
		list.getList();
		
		
		
	
	}
}
