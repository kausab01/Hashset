import java.util.HashSet;

public class H4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashSet<String> h=new  HashSet<String>();
	      
	      h.add("RED");
	      h.add("WHITE");
	      h.add("PINK ");
	      h.add("YELLOW");
	      h.add("BLACK");
	      h.add("GREEN");
	      System.out.println("OG HashSet = "+h);
	      h.clear();
	      System.out.println("HashSet after removing all element = "+h);
	}

}
