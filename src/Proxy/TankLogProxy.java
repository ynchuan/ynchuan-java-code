package Proxy;

public class TankLogProxy implements Moveable {
	Moveable t;// 采用聚合进行静态的代理

	public TankLogProxy(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		System.out.println("tank start....");
		t.move();
		System.out.println("tank stop .....");
	}

}
