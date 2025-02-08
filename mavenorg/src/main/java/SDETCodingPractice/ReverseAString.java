package SDETCodingPractice;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str= "Akshay";
		String revStr ="";
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
		  
		  for(int i = str.length()-1; i>=0 ;i--){ 
			  revStr = revStr+str.charAt(i);			  

		  }
		  
		  System.out.println(revStr);
		  
		 


	}

}
