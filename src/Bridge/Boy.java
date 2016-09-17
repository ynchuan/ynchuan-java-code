package Bridge;

public class Boy {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pursue(MM m) {
		Gift g = new Warm(new Flower());//实现礼物的A、B类的组合，似于使用聚合实现两两的组合
		give(g, m);
	}

	public void give(Gift g, MM m) {

	}
}
