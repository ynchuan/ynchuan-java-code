package com.ynchuan.code.filter;

public class FaceFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		return msg.replace("����ҵ", "jiuye");
	}

}
