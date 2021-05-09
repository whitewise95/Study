package step9_02.coffee;

import java.util.Date;

public class CoffeeShop {

	public static void main(String[] args) {
		
		
		CoffeeList cL = new CoffeeList();
		
		
		cL.coffeeLIstAdd(new CoffeeVO("콜드브루", 3500  ,    new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("카페라떼", 3500  , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("초코라떼", 3500  , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("얼그레이",3500 ,  new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("하겐다즈",  3500 ,  new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("크림라떼", 3500 , new Date()));
		cL.coffeeLIstAdd(new CoffeeVO("안튓도넛",  3500 , new Date()));
		
		
		System.out.println(cL);
	}

}
