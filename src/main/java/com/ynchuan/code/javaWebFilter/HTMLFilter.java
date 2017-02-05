package com.ynchuan.code.javaWebFilter;

public class HTMLFilter implements Filter{

	@Override
	public void doFilter(Request req, Response res, ChainFilter cf) {
		req.reqStr=req.reqStr.replace("<", "[").replace(">","]");
		cf.doFilter(req,res,cf);
		res.resStr=res.resStr.replace("a", "!");
	}



}
