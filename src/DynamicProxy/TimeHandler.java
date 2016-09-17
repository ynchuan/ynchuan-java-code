package DynamicProxy;

import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	Object target;

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public void invoke(Object o, Method m) {
		long t1 = System.currentTimeMillis();
		try {
			m.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long t2 = System.currentTimeMillis();
		System.out.println("time:" + (t2 - t1));

	}

}
