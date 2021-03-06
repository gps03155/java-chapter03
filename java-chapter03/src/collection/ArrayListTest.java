package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		// iterator : 순회(반복)
		int count = list.size();
		
		for(int i=0;i<count;i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(1);
		
		// iterator2
		Iterator<String> it = list.iterator(); // iterator 호출 - Set, Tree에서 사용 가능
		
		// next가 더이상 없을 때까지 실행
		// 한번 순회가 끝나면 iterator는 다시 사용할 수 없음
		// 다시 iterator 받아야함
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println("-->");
		}

		// iterator3 for-each
		// OutOfIndex 걱정하지 않아도 됨
		// 일반 for문 사용이 속도 더 빠름
		for(String s : list) {
			System.out.println(s);
		}
	}

}
