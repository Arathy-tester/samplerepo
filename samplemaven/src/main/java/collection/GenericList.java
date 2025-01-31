package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("RED");
		s.add("BLACK");
		s.add("WHITE");
		s.add("RED");
		s.add("PINK");
		s.add("GREEN");
		System.out.println(s);
		System.out.println(s.get(3));
		s.set(2, "GOLD");
		System.out.println(s);
		System.out.println(s.indexOf("RED"));
		System.out.println(s.lastIndexOf("RED"));
		s.remove(3);
		System.out.println(s);
		System.out.println(s.contains("red"));
		System.out.println(s.contains("WHITE"));





		

	}

}
