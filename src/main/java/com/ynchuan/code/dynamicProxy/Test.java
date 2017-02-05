package com.ynchuan.code.dynamicProxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tank t=new Tank();
		InvocationHandler h=new TimeHandler(t);
		Moveable m=(Moveable)Proxy.newProxyInstance(Moveable.class, h);//ǰ�᣺h�е�target����ʵ��Moveable�Ľӿ�,ֻ�ܴ���target��ʵ����moveable�д��ڵķ���
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
