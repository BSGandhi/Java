
public class PrintString {
	public static void main(String[] args) {
	System.out.println("s7a5g4");
	String Str="s7a5g4";
	
	for(int i=0;i<Str.length();i++) {
	  if (i%2==0){
	    char c=Str.charAt(i);
      int n=Integer.valueOf((Str.charAt(i+1) + ""));
	    for(int j=0;j<n;j++) {
	      System.out.print(c);
	      }
	    }
	  }
  }
}
