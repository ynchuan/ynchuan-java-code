package DynamicProxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tank t=new Tank();
		InvocationHandler h=new TimeHandler(t);
		Moveable m=(Moveable)Proxy.newProxyInstance(Moveable.class, h);//前提：h中的target必须实现Moveable的接口,只能代理target中实现了moveable中存在的方法
		m.move();
//		Method[] methods=Moveable.class.getMethods();
//		for(Method m:methods){
//			System.out.println(m.getName());
//			System.out.println(m.getReturnType());
//			System.out.println(m.getParameterTypes());
//			System.out.println(m.getTypeParameters());
//			System.out.println(Modifier.toString(m.getModifiers()));
//		}
		
	}

}
