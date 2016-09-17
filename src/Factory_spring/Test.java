package Factory_spring;

import java.util.Properties;

public class Test {

	/**
	 * 当通过抽象工厂获取产品，产品的类型比较确定
	 * 通过spring的ioc，通过反射机制，可以获取多个类型的产品，前提是产品的类型已经进行了作者的默认，如car=Car,key=car时，作者进行了类型为Car的认证，这也是抽象工厂不能增加类型的软肋解决办法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Properties pros = new Properties();
		try {
			pros.load(Test.class.getClassLoader().getResourceAsStream(
					"Factory_spring/spring.property"));
			String vehicleTypeName = pros.getProperty("vehicleType");
			Object o = Class.forName(vehicleTypeName).newInstance();
			Moveable m = (Moveable) o;//此处实现了产品类型的作者指定
			m.run();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
