package JavaWebFilter;

import java.util.ArrayList;
import java.util.List;

public class ChainFilter implements Filter {
	public List<Filter> chain = new ArrayList<Filter>();
	int index = 0;

	public void add(Filter hf) {
		chain.add(hf);
	}

	@Override
	public void doFilter(Request req, Response res, ChainFilter cf) {
		//當請求過濾器完成請求過濾，則進入處理過程，處理完成以後進行響應的過濾
		if (index == chain.size()) {
			new ProcessAction().doController(req, res);//此處可以進行處理的擴展，通過通用方法的擴展
			return;
		}
		Filter f=chain.get(index);
		index++;
		f.doFilter(req, res, cf);
		
	}

}
