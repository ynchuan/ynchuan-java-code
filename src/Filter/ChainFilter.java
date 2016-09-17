package Filter;

import java.util.ArrayList;
import java.util.List;

public class ChainFilter implements Filter {
	public List<Filter> chain = new ArrayList<Filter>();

	@Override
	public String doFilter(String msg) {
		for (Filter f : chain) {
			msg = f.doFilter(msg);
		}
		return msg;
	}

	public void add(Filter hf) {
		chain.add(hf);	
	}

}
