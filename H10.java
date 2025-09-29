import java.util.HashSet;

public class H10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set = new HashSet<String>();
	        set.add("RED");
	        set.add("WHITE");
	        
	        set.add("PINK");
	        set.add("GREY");

	        System.out.println("HashSet 1 :" + set);
	        HashSet<String> set2 = new HashSet<String>();
	        set2.add("RED");
	        set2.add("BLUE");
	        set2.add("GREEN");
	        set2.add("BLACK");
	      

	        System.out.println("HashSet 2 :" + set2);
	        
	        for(String s: set){
	      
	        if(set2.contains(s)){
	        	System.out.println("YES");
	        }
	        else {
				System.out.println("NO");
			}
	        }
	}

}
