package Factory_simple;

public class Test {

	/**
	 * ���󹤳�ģʽ--����һ���Ʒ
	 * @param args
	 */
	public static void main(String[] args) {

     Moveable m=Car.getInstance();
     m.run();
	}

}
