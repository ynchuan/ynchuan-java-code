package com.ynchuan.code.dynamicProxy;
import java.lang.reflect.Method;
public class TankTimeProxy implements Moveable{
	InvocationHandler h; 
	public TankTimeProxy(InvocationHandler h) {
		this.h = h;
	}
  @Override
  public void move(){
	try{
    Method md=Moveable.class.getMethod("move");
    h.invoke(this,md);} 
	  catch(Exception e){
      e.printStackTrace();
     }
  }
}