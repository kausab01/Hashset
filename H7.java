import java.util.HashSet;
public class H7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set = new HashSet<String>();
	        set.add("RED");
	        set.add("WHITE");
	        set.add("GREEN");
	        set.add("PINK");
	        set.add("YELLOW");

	        System.out.println("HashSet :" + set);
	        String arr[] = new String[set.size()];
	        
	        int i=0;
	    
	        for(String A:set){
	          arr[i++] = A;
	        }
System.out.println("Array - ");
	        for (String n : arr)
	            System.out.println(n);
	}

}
