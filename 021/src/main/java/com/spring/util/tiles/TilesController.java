package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tiles")
public class TilesController {

	
	
	@RequestMapping(value = "/content1" , method=RequestMethod.GET)
	public String content1() {
		//tiles설정 파일의 definition 태그의 name속성의 벨류와 return값은 매칭한다
		return "tiles/content1";
	}
	
	@RequestMapping(value = "/content2" , method=RequestMethod.GET)
	public String content2() {
		//tiles설정 파일의 definition 태그의 name속성의 벨류와 return값은 매칭한다
		return "tiles/content2";
	}
	@RequestMapping(value = "/content3" , method=RequestMethod.GET)
	public String content3() {
		//tiles설정 파일의 definition 태그의 name속성의 벨류와 return값은 매칭한다
		return "tiles/content3";
	}
}
