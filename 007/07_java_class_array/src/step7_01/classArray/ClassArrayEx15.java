package step7_01.classArray;

// # 생성자를 이용한 멤버 변수 초기화

 class Fruit {
	 
	 String name;
	 int price;
	 
//	 Fruit(String name, int price){
//		 this.name = name;
//		 this.price = price;
//	 }

	 Fruit(String name, int price) {
		 this.name = name;
		 this.price = price;
	 }
	 
	 
	 
	 void printData() {
		 System.out.println("name :"+ this.name);
		 System.out.println("price : "+ this.price);
		 System.out.println();
	 }

	 
 }

public class ClassArrayEx15 {

	public static void main(String[] args) {
		
		
		Fruit apple=new Fruit("사과", 1200);
		apple.printData();
		
		
		Fruit banana = new Fruit("바나나", 2500);
		banana.printData();
		
		
		
		
	}

}
