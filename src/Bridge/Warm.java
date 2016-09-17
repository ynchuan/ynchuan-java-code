package Bridge;

public class Warm extends Gift {
	/**
	 * 桥接模式中，相当于在A类别中给B类别设置接口，实现各自的两两组合
	 * 
	 * @param imp
	 */
	public Warm(GiftImp imp) {
		this.imp = imp;//拥有了具体实现以后进行实物的操作
	}

}
