package Observer;

public class ConcertObserver implements Observer {

	@Override
	public void update(String state) {
		System.out.println("观察者，主题状态变化时，进行监测主题变化的响应操作!");
		System.out.println("---"+state);
		
	}


}
