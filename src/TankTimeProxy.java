package DynamicProxy;
import java.lang.reflect.Method;
public class TankTimeProxy implements DynamicProxy.Moveable{
  DynamicProxy.InvocationHandler h;// 采用聚合进行静态的代理
	public TankTimeProxy(DynamicProxy.InvocationHandler h) {
		this.h = h;
	}
  @Override
  public void move(){
	try{
    Method md=DynamicProxy.Moveable.class.getMethod("move");
    h.invoke(this,md);} 
	  catch(Exception e){
      e.printStackTrace();
     }
  }
}