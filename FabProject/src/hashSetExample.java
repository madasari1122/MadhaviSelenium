import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("India");
		hs.add("he");
		hs.add("she");
		/*System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.size());		
		System.out.println(hs.isEmpty());*/
		Iterator<String> i= hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}

}
