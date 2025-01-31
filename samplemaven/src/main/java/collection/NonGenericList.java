package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericList {

	public static void main(String[] args) {
		List s=new ArrayList ();
		s.add("RED");
		s.add(120);
		s.add(52.025);
		s.add('R');
		System.out.println(s);
	}

}
