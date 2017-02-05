package com.ynchuan.code.javaWebFilter;

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
		//��Ո���^�V�����Ո���^�V���t�M��̎���^�̣�̎����������M��푑����^�V
		if (index == chain.size()) {
			new ProcessAction().doController(req, res);//��̎�����M��̎��ĔUչ��ͨ�^ͨ�÷����ĔUչ
			return;
		}
		Filter f=chain.get(index);
		index++;
		f.doFilter(req, res, cf);
		
	}

}
