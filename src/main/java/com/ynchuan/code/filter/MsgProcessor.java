package com.ynchuan.code.filter;

public class MsgProcessor {
	String msg;
	ChainFilter cf;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * ҵ���Ͽ�����ʱ�仯������Ӧ��дͨ��
	 * 
	 * @return
	 */
	public String process() {
		String r = msg.replace("<", "[").replace(">", "]").replace("����ҵ", "��ҵ");
		cf.doFilter(msg);
		return r;
	}
}
