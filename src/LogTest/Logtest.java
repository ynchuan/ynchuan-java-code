package LogTest;

import java.io.File;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

public class Logtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("1aaa:" + Thread.currentThread().getContextClassLoader().getResource(""));
		System.out.println("2:" + Logtest.class.getClassLoader().getResource(""));
		System.out.println("3:" + ClassLoader.getSystemResource(""));
		System.out.println("4:" + Logtest.class.getResource(""));//IdcardClient.class文件所在路径
		System.out.println("5:" + Logtest.class.getResource("/").getFile()); // Class包所在路径，得到的是URL对象，用url.getPath()获取绝对路径String
		System.out.println("6:" + new File("/").getAbsolutePath());
		System.out.println("7:" + System.getProperty("user.dir"));
		System.out.println("8:" + System.getProperty("file.encoding"));//获取文件编码
		File f = new File(".");

		System.out.println("9."+f.getAbsolutePath());
//		PropertyConfigurator.configure("log4j.properties");
//		Logger logger = Logger.getLogger(Logtest.class);
//		logger.debug(" debug ");
//		logger.error(" error ");
	}

}
