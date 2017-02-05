package com.ynchuan.code.strategyT;

public class Test {

	/**����ģʽ
	 * ʹ�÷����Ժ�,�ٽ��нӿڵ�ʵ�֣�ʵ��ȥǿת��������ǿ��ת����ɵ��쳣��ͨ����������ǿת�쳣
	 * @param args
	 */
	public static void main(String[] args) {
		Cat[] aa={new Cat(1,1),new Cat(5,5),new Cat(2,2),new Cat(8,8)};
        Datasort<Cat> d=new Datasort<Cat>();
        d.sort(aa);
        d.p(aa);
	}
}
