package JavaWebFilter;

public class SenstiveFilter implements Filter {

	@Override
	public void doFilter(Request req, Response res, ChainFilter cf) {
		req.reqStr=req.reqStr.replace("√Ù∏–", "**");
		cf.doFilter(req,res,cf);
		res.resStr=res.resStr.replace("b", "&");
	}
	}

