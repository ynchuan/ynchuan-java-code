package Strategy_T;

public class Test {

	/**策略模式
	 * 使用泛型以后,再进行接口的实现，实现去强转化，避免强制转化造成的异常，通过编译器检查强转异常
	 * @param args
	 */
	public static void main(String[] args) {
		Cat[] aa={new Cat(1,1),new Cat(5,5),new Cat(2,2),new Cat(8,8)};
        Datasort<Cat> d=new Datasort<Cat>();
        d.sort(aa);
        d.p(aa);
	}
}
