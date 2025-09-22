
public class WEEK7_4 {

    public static void main(String[] args) {
      boolean isPalin =false;
       String s1="madam";
       String s2="";
       for(int i=0;i<s1.length();i++){
           s2= s1.charAt(i)+s2;
       }
       if(s1.equalsIgnoreCase(s2)){
           isPalin=true;
       }
       if(isPalin){
           System.out.println("string is a palindrome");
       }
       else
            System.out.println("string is not a palindrome");
    }
    
}
