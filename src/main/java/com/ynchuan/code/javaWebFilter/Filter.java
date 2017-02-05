package com.ynchuan.code.javaWebFilter;

public interface Filter {
	void doFilter(Request req, Response res, ChainFilter cf);
}
