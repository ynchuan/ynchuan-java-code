package com.ynchuan.code.filter;

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
		String msg = "��Һã�<script> ���� ����ҵ��";
		ChainFilter cf1 = new ChainFilter();
		HTMLFilter hf = new HTMLFilter();
		FaceFilter ff = new FaceFilter();
		SenstiveFilter sf = new SenstiveFilter();
		ChainFilter cf2 = new ChainFilter();
		cf1.add(hf);
		cf1.add(ff);
		cf2.add(sf);
		cf1.add(cf2);
		System.out.println(cf1.doFilter(msg));
	}
}
