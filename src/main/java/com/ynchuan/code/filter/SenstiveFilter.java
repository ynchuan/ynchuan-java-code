package com.ynchuan.code.filter;

public class SenstiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		return msg.replace("����", "**");
	}

}
