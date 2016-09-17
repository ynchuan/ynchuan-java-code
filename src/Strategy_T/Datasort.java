package Strategy_T;

/**
 * Ã°ÔñÈëÏ£¿ì¹é¶Ñ
 * 
 * @author Administrator
 * 
 */
public class Datasort<T extends Comparable<T>> {
/**
 * 
 * @param aa
 */
	public void sort(T[] aa) {
		for (int i = 0; i < aa.length - 1; i++) {
			for (int j = 0; j < aa.length - i - 1; j++) {
				if (aa[j].compare(aa[j + 1]) == 1) {
					swap(aa, j, j + 1);
				}
			}
		}
	}

	private void swap(Object[] aa, int i, int j) {
		Object temp = aa[i];
		aa[i] = aa[j];
		aa[j] = temp;
	}

	public void p(Object[] aa) {
		for (Object a : aa) {
			System.out.println(a.toString() + ",");
		}
	}

}
