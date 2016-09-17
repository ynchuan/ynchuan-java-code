package Proxy;

public class TankTimeProxy implements Moveable {
	Moveable t;// 采用聚合进行静态的代理

	public TankTimeProxy(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		long t1 = System.currentTimeMillis();
		t.move();
		long t2 = System.currentTimeMillis();
		System.out.println("time:"+(t2 - t1));
	}

}
