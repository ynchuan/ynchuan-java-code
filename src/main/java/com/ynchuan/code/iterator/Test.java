package com.ynchuan.code.iterator;
/**
 * iteratorģʽ��������ӽӿڷ���Iterator��ȡ���������������Ļ�ȡ�����˼��Ͻӿ��У�����������ȡ�Ժ��ڸ��������ı�������ʵ���н��нڵ�Ļ�ȡ�Ͳ���
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
		//ʵ�ֱ���Ľӿ�
		Iterator ite = al.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next().toString());
		}
	}
}
