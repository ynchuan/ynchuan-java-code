package Factory_abstract;

public class Test {

	/**
	 * 抽象工厂模式----创建一个工厂，产生一组产品,类似于网络换皮肤
	 * 一般工厂，产生产品
	 * 抽象工厂，可以产生新的产品系列，但是不能增加产品品种
	 * @param args
	 */
	public static void main(String[] args) {
     AbstractFactory vf=new Defaultfactory(); // --扩展说明: 在确定产品类型的情况下，重建工厂，实现产品的生产
     Moveable m=vf.createMoveable();
     m.run();
     Weapen w=vf.createWeapen();
     w.shoot();
     Food f=vf.createFood();
     f.printName();
	}

}
