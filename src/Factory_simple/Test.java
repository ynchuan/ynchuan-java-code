package Factory_simple;

public class Test {

	/**
	 * 抽象工厂模式--产生一组产品
	 * @param args
	 */
	public static void main(String[] args) {

     Moveable m=Car.getInstance();
     m.run();
	}

}
