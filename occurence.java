
public class Main
{
	public static void main(String[] args) {
	    String str="PRANESHWAR ";
	    //String str1="world";
		//System.out.println("statement  :  "+str.isEmpty());
		//System.out.println("Start / end with  :  "+str.endsWith("friends"));
		char ch='R';
		int count=0;
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)==ch)
		    {count++;
		    }
		}
		System.out.println(count);
	}
}
 