package Bridge;

public class Wild extends Gift {
	public Wild(GiftImp imp) {
		this.imp = imp;//拥有了具体实现以后进行实物的操作
	}

}
