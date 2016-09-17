package Factory_spring;

import java.util.LinkedList;
import java.util.List;
public class Car implements Moveable {
	public static Car car = new Car();// ---单例
	public static List<Car> cars = new LinkedList<Car>();// ---多例

	/**
	 * 静态工厂方法 ----只要可以控制对象的产生的方法，都可以命名为“工厂方法”--实现单例 --实现多例
	 * 
	 * @return
	 */
	public static Car getInstance() {
		return car;
	}

	/**
	 * 静态工厂方法 ----只要可以控制对象的产生的方法，都可以命名为工厂方法---简单工厂
	 * 
	 * @return
	 */
	public static Car getInstance1() {
		if (car != null) {
			return car;
		} else {
			return new Car();
		}
	}

	public void run() {
		System.out.println("-----running--");
	}
}
