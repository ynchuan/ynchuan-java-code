package com.ynchuan.code.dynamicProxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * ����ģʽ---��̬����
 * @author Administrator
 *
 */
public class Client {
  public static void main(String[] args){
	 String rt="\n";
	 String  src=""+
	 "package DynamicProxy;"+rt+

	 "public class TankTimeProxy implements Moveable {"+rt+
	 "  Moveable t;// ���þۺϽ��о�̬�Ĵ���"+rt+

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
		//��д.java�ļ�
		File f=new File(fileName);
		FileWriter fw=new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		//�����ļ���.class�ļ�
		JavaCompiler jc=ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr=jc.getStandardFileManager(null, null, null);
		Iterable units=fileMgr.getJavaFileObjects(fileName);
		CompilationTask ct=jc.getTask(null, fileMgr, null, null,  null, units);
		ct.call();
		fileMgr.close();
		//���ض������ļ����ڴ�
		URL[] urls=new URL[]{new URL("file:/"+System.getProperty("user.dir")+"/src")};
		URLClassLoader ucl=new URLClassLoader(urls);
		Class c=ucl.loadClass("DynamicProxy.TankTimeProxy");
		System.out.println(c);
		Constructor ctt=c.getConstructor(com.ynchuan.code.dynamicProxy.Moveable.class);
		Moveable m=(Moveable)ctt.newInstance(new Tank());
		m.move();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
  }
}
