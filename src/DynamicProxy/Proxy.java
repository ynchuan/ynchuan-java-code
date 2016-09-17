package DynamicProxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;
/**
 * 动态代理模式--可以对任何实现了某一接口的对象中的override的方法进行添加代理，实现权限，日志，时间，事物等的事件的记录
 * 1、创建实现了接口的并要进行代理的对象
 * 2、通过传递interface进行代理类的动态创建，并返回$Proxy类------类中含有实现接口的方法，在对应的方法中讲调用的方法转化成method对象，传至handler中进行添加对象的调用
 * 3、创建代理中要添加的类，类实现统一的接口InvocationHandler
 * 4、实现了InvocationHandler的类中通过设置target进行被代理对象的注入，并实现被代理对象中统一于interface的方法的调用代理。
 * 
 * 
 * @author Administrator
 *
 */
public class Proxy {
	public static Object newProxyInstance(Class itf, InvocationHandler h) {
		String rt = "\n";
		String itfName = itf.getName();
		Method[] methods = itf.getMethods();
		String strMethod = "";
		for (Method m : methods) {
			strMethod += "  @Override" + rt;
			// strMethod+="
			// "+Modifier.toString(m.getModifiers()).replace("abstract","
			// ")+m.getReturnType()+" "+m.getName()+"(){" +rt+
			strMethod += "  public void " + m.getName() + "(){" + rt + "	try{"
					+ rt + "    Method md=" + itfName + ".class.getMethod(\""
					+ m.getName() + "\");" + rt + "    h.invoke(this,md);} "
					+ rt + "	  catch(Exception e){" + rt
					+ "      e.printStackTrace();" + rt + "     }" + rt + "  }";
		}
		String src = "" + "package DynamicProxy;" + rt
				+ "import java.lang.reflect.Method;" + rt +

				"public class TankTimeProxy implements " + itfName + "{" + rt
				+ "  DynamicProxy.InvocationHandler h;// 采用聚合进行静态的代理" + rt +

				"	public TankTimeProxy(DynamicProxy.InvocationHandler h) {"
				+ rt + "		this.h = h;" + rt + "	}" + rt + strMethod + rt +
				// " @Override"+rt+
				// " public void move() {"+rt+
				// " long t1 = System.currentTimeMillis();"+rt+
				// " t.move();"+rt+
				// " long t2 = System.currentTimeMillis();"+rt+
				// " System.out.println(\"time:\"+(t2 - t1));"+rt+
				// " }"+rt+
				"}";
		String fileName = System.getProperty("user.dir")
				+ "/src/TankTimeProxy.java";

		try {
			// 编写.java文件
			File f = new File(fileName);
			FileWriter fw = new FileWriter(f);
			fw.write(src);
			fw.flush();
			fw.close();
			// 编译文件成.class文件
			JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager fileMgr = jc.getStandardFileManager(null,
					null, null);
			Iterable units = fileMgr.getJavaFileObjects(fileName);
			CompilationTask ct = jc.getTask(null, fileMgr, null, null, null,
					units);
			ct.call();
			fileMgr.close();
			// 加载二进制文件进内存
			URL[] urls = new URL[] { new URL("file:/"
					+ System.getProperty("user.dir") + "/src/") };
			URLClassLoader ucl = new URLClassLoader(urls);
			Class c = ucl.loadClass("DynamicProxy.TankTimeProxy");
			System.out.println(c);
			Constructor ctt = c
					.getConstructor(DynamicProxy.InvocationHandler.class);
			return ctt.newInstance(h);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
