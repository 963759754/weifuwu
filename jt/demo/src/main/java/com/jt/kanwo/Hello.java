package com.jt.kanwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
		@RequestMapping("/nihao")
		@ResponseBody
	public String s() {
		return"nishi";
	}
}
