package Strategy;

public class CatWidthCompraptor  implements Comparator {
	/**
	 * 创建比较策略---宽度比较策略
	 */
	@Override
	public int compare(Object o1, Object o2) {
		Cat c1 = (Cat) o1;
		Cat c2 = (Cat) o2;
		if (c1.getWidth() > c2.getWidth()) {
			return -1;
		} else if (c1.getWidth() < c2.getWidth()) {
			return 1;
		} else {
			return 0;
		}
	}

}
