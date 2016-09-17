package Observer;
/**
 * 观察者模式
 * 当监测主题发生变化时进行事件的外传，以此其他地方做出响应
 * @author Administrator
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcertObserver co=new ConcertObserver();
		ConcreteSubject cs=new ConcreteSubject();
		cs.attach(co);//完成观察者对象的添加
		cs.change("111");//产生事件变化时进行事件的向外传递
	}

}
