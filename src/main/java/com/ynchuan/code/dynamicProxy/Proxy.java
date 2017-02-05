package com.ynchuan.code.dynamicProxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
/**
 * ��̬����ģʽ--���Զ��κ�ʵ����ĳһ�ӿڵĶ����е�override�ķ���������Ӵ��?ʵ��Ȩ�ޣ���־��ʱ�䣬����ȵ��¼��ļ�¼
 * 1������ʵ���˽ӿڵĲ�Ҫ���д���Ķ���
 * 2��ͨ���interface���д�����Ķ�̬������������$Proxy��------���к���ʵ�ֽӿڵķ������ڶ�Ӧ�ķ����н����õķ���ת����method���󣬴���handler�н�����Ӷ���ĵ���
 * 3������������Ҫ��ӵ��࣬��ʵ��ͳһ�Ľӿ�InvocationHandler
 * 4��ʵ����InvocationHandler������ͨ������target���б���������ע�룬��ʵ�ֱ����������ͳһ��interface�ķ����ĵ��ô��?
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
				+ "  DynamicProxy.InvocationHandler h;// ���þۺϽ��о�̬�Ĵ���" + rt +

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
			// ��д.java�ļ�
			File f = new File(fileName);
			FileWriter fw = new FileWriter(f);
			fw.write(src);
			fw.flush();
			fw.close();
			// �����ļ���.class�ļ�
			JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager fileMgr = jc.getStandardFileManager(null,
					null, null);
			Iterable units = fileMgr.getJavaFileObjects(fileName);
			CompilationTask ct = jc.getTask(null, fileMgr, null, null, null,
					units);
			ct.call();
			fileMgr.close();
			// ���ض������ļ����ڴ�
			URL[] urls = new URL[] { new URL("file:/"
					+ System.getProperty("user.dir") + "/src/") };
			URLClassLoader ucl = new URLClassLoader(urls);
			Class c = ucl.loadClass("DynamicProxy.TankTimeProxy");
			System.out.println(c);
			Constructor ctt = c
					.getConstructor(com.ynchuan.code.dynamicProxy.InvocationHandler.class);
			return ctt.newInstance(h);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
