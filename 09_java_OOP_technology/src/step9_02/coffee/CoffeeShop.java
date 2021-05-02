package step9_02.coffee;

import java.util.Date;

public class CoffeeShop {

	public static void main(String[] args) {
		
		
		CoffeeList cL = new CoffeeList();
		
		
		cL.coffeeLIstAdd(new CoffeeVO("콜드브루",    "커피",     3500 , 5 ,    new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("카페라떼",   "커피", 3500 , 2 , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("바닐라라떼", "커피", 3500 , 1 , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("아메리카노", "커피", 3500 , 3 , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("초코라떼", "논커피", 3500 , 4 , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("얼그레이", "Tea", 3500 , 5 , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("하겐다즈", "아이스크림", 3500 , 6 , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("큐브밀크티", "시그니처", 3500 , 2 , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("크림라떼", "시그니처", 3500 , 3 , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("안튓도넛", "디저트", 3500 , 4 , new Date()));
		
		
		System.out.println(cL);
	}

}
