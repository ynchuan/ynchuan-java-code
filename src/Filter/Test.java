package Filter;

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
		String msg = "大家好，<script> 敏感 被就业，";
		ChainFilter cf1 = new ChainFilter();
		HTMLFilter hf = new HTMLFilter();
		FaceFilter ff = new FaceFilter();
		SenstiveFilter sf = new SenstiveFilter();
		ChainFilter cf2 = new ChainFilter();
		cf1.add(hf);
		cf1.add(ff);
		cf2.add(sf);
		cf1.add(cf2);
		System.out.println(cf1.doFilter(msg));
	}
}
