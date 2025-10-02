import java.util.HashSet;

public class H11 {

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
	        set2.add("GREY");
	      

	        System.out.println("HashSet 2 :" + set2);
	        HashSet<String> set3 = new HashSet<String>();
	        for(String s: set){
	      
	        if(set2.contains(s)){
	        	set3.add(s);
	        }
	        else {

			}
	        }
	        System.out.println(set3);
	}

}
