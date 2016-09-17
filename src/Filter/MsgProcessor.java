package Filter;

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
	 * 业务上可能随时变化，所以应该写通用
	 * 
	 * @return
	 */
	public String process() {
		String r = msg.replace("<", "[").replace(">", "]").replace("被就业", "就业");
		cf.doFilter(msg);
		return r;
	}
}
