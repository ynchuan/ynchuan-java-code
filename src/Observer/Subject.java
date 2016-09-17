package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察主题（被观察者）
 * 
 * @author Administrator
 * 
 */
public abstract class Subject {

	List<Observer> olst = new ArrayList<Observer>();

	public void attach(Observer o) {
		olst.add(o);
	}

	public void detach(Observer o) {
		olst.remove(o);
	}

	public void nodfyObservers(String state) {
		for (Observer o : olst) {
			o.update(state);
		}
	}
}
