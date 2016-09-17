package Proxy;
/**
 * 代理模式---静态代理
 * @author Administrator
 *
 */
public class Client {
  public static void main(String[] args){
	  Tank t=new Tank();
	  TankTimeProxy ttp =new TankTimeProxy(t);
	  TankLogProxy tlp =new TankLogProxy(ttp);
	  tlp.move();
  }
}
