
public class WEEK7_3 {

    public static void main(String[] args) {
       String s1="ABCDE";
       String s2="";
       for(int i=0;i<s1.length();i++){
           s2= s1.charAt(i)+s2;
       }
        System.out.println("Reversed Array is:");
        System.out.println(s2);
    }
    
}
