package JavaWebFilter;

/**
 * chain模式（责任链模式）
 * 
 * @author Administrator
 * 
 */
public class Test {

	/**
	 * extram programe 极限编程 注：string为传值，stringBuffer为传引用
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "<script>";
//		msg.replace("<", "[").replace(">","]");
		ChainFilter cf1 = new ChainFilter();
		HTMLFilter hf = new HTMLFilter();
		SenstiveFilter sf = new SenstiveFilter();
		Request req=new Request();
		req.reqStr=msg;
		Response res=new Response();
		cf1.add(hf);
		cf1.add(sf);//注：如果cf1中添加cf2时，则只能使用cf2的第一个过滤器，如果cf2中有不止一个过滤器的话只能使用第一个
		cf1.doFilter(req, res, cf1);
		System.out.println("---------"+req.reqStr);
		System.out.println("~~~~~~~~"+res.resStr);
	}
}
