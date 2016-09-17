package Iterator;
/**
 * iterator模式：采用添加接口方法Iterator获取遍历器（遍历器的获取放在了集合接口中），遍历器获取以后，在各自容器的遍历器的实现中进行节点的获取和操作
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Collection al = new ArrayList();
		for (int i = 0; i < 15; i++) {
			al.add(new Integer(i));
		}
		System.out.println(al.size());
		//实现遍历的接口
		Iterator ite = al.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next().toString());
		}
	}
}
