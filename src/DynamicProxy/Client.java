package DynamicProxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

/**
 * 代理模式---静态代理
 * @author Administrator
 *
 */
public class Client {
  public static void main(String[] args){
	 String rt="\n";
	 String  src=""+
	 "package DynamicProxy;"+rt+

	 "public class TankTimeProxy implements Moveable {"+rt+
	 "  Moveable t;// 采用聚合进行静态的代理"+rt+

	 "	public TankTimeProxy(Moveable t) {"+rt+
	 "		super();"+rt+
	 "		this.t = t;"+rt+
	 "	}"+rt+

	 "	@Override"+rt+
	 "	public void move() {"+rt+
	 "		long t1 = System.currentTimeMillis();"+rt+
	 "		t.move();"+rt+
	 "		long t2 = System.currentTimeMillis();"+rt+
	 "		System.out.println(\"time:\"+(t2 - t1));"+rt+
	 "	}"+rt+
	 "}";
	 String fileName=System.getProperty("user.dir")+"/src/TankTimeProxy.java";
	 
	 try {
		//编写.java文件
		File f=new File(fileName);
		FileWriter fw=new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		//编译文件成.class文件
		JavaCompiler jc=ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr=jc.getStandardFileManager(null, null, null);
		Iterable units=fileMgr.getJavaFileObjects(fileName);
		CompilationTask ct=jc.getTask(null, fileMgr, null, null,  null, units);
		ct.call();
		fileMgr.close();
		//加载二进制文件进内存
		URL[] urls=new URL[]{new URL("file:/"+System.getProperty("user.dir")+"/src")};
		URLClassLoader ucl=new URLClassLoader(urls);
		Class c=ucl.loadClass("DynamicProxy.TankTimeProxy");
		System.out.println(c);
		Constructor ctt=c.getConstructor(DynamicProxy.Moveable.class);
		Moveable m=(Moveable)ctt.newInstance(new Tank());
		m.move();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
  }
}
