package java16;

import java.util.ArrayList;

public class CastingTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는 스트링");//업캐스팅(자동형변환)
		list.add(123);//int-->Integer(auto-boxing)-->Object
		list.add(12.33);
		list.add(true);
		
		String str=(String)list.get(0);
		//다운 캐스팅

	}

}
