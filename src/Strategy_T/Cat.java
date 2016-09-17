package Strategy_T;



public class Cat extends Comparable<Cat> {
	private int height;
	private int width;

	public Cat(int height,int width) {
		this.height=height;
		this.width=width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int compare(Cat o) {
		if (o instanceof Cat) {
			Cat c = o;
			if (this.height > c.getHeight()) {
				return 1;
			} else if (this.height < c.getHeight()) {
				return -1;
			} else
				return 0;
		} else {
			// 創建轉換異常并拋出
			throw new ClassCastException();
		}
		
	}

	@Override
	public String toString() {
		
		return height + "|" + width;
	}

}
