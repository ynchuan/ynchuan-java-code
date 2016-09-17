package Filter;

public class SenstiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		return msg.replace("Ãô¸Ğ", "**");
	}

}
