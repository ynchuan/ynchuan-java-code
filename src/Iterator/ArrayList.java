package Iterator;

public class ArrayList implements Collection {
	Object[] objects = new Object[10];// 创建大小为10的引用数组，其字节大小为4*10个字节，并非12*10个字节
	int index = 0;

	@Override
	public void add(Object o) {
		if (index == objects.length) {
			Object[] obj = new Object[objects.length * 2];
			System.arraycopy(objects, 0, obj, 0, objects.length);
			objects = obj;
		}
		objects[index] = o;
		index++;
	}

	@Override
	public int size() {
		return index;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterator iterator() {

		return new Iterator() {
			int currIndex = 0;

			@Override
			public boolean hasNext() {
				if (currIndex < index) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public Object next() {
				Object o = objects[currIndex];
				currIndex++;
				return o;
			}

		};
	}
}
