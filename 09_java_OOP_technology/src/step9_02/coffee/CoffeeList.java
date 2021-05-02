package step9_02.coffee;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CoffeeList {

	ArrayList<CoffeeVO> coffeeList = new ArrayList<>();

	@Override
	public String toString() {
		
		String str = "";
		int tot = 0;
		
		str += "======================================================"+"\n";
		str += "음료\t종류\t가격\t\t\t\t날짜"+"\n";
		str += "======================================================="+"\n";
		for (int i = 0; i < coffeeList.size(); i++) {
			str += coffeeList.get(i)+"\n";
			tot += coffeeList.get(i).getPrice(); 
		}
		DecimalFormat df = new DecimalFormat();
		str += "======================================================="+"\n";
		str += "                             총 금액 :"+df.format(tot)+"\n";
		str += "======================================================="+"\n";
		str += "    스타벅스를 이용해주셔서 진심으로 감사드립니다."+"\n";
		
		
		
		
		
		return  str;
	}
	
	public void coffeeLIstAdd(CoffeeVO vo) {
		coffeeList.add(vo);	
	}
	
	
	
	
}
