package com.ynchuan.code.javaWebFilter;

/**
 * chainģʽ��������ģʽ��
 * 
 * @author Administrator
 * 
 */
public class Test {

	/**
	 * extram programe ���ޱ�� ע��stringΪ��ֵ��stringBufferΪ������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "<script>";
//		msg.replace("<", "[").replace(">","]");
		ChainFilter cf1 = new ChainFilter();
		HTMLFilter hf = new HTMLFilter();
		SenstiveFilter sf = new SenstiveFilter();
		Request req=new Request();
		req.reqStr=msg;
		Response res=new Response();
		cf1.add(hf);
		cf1.add(sf);//ע�����cf1�����cf2ʱ����ֻ��ʹ��cf2�ĵ�һ�������������cf2���в�ֹһ���������Ļ�ֻ��ʹ�õ�һ��
		cf1.doFilter(req, res, cf1);
		System.out.println("---------"+req.reqStr);
		System.out.println("~~~~~~~~"+res.resStr);
	}
}
