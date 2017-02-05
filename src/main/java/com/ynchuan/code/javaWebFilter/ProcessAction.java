package com.ynchuan.code.javaWebFilter;

public class ProcessAction implements Action {

	@Override
	public void doController(Request req, Response res) {
		System.out.println("processaction----"+req.reqStr);
		res.resStr="amnb";

	}

}
