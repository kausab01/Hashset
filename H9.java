import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class H9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set = new HashSet<String>();
	        set.add("RED");
	        set.add("WHITE");
	        set.add("GREEN");
	        set.add("PINK");
	        set.add("YELLOW");

	        System.out.println("HashSet :" + set);
	        ArrayList<String> s=new ArrayList<String>(set);
	        
	        System.out.println("ArrayList - "+s);
	}

}
