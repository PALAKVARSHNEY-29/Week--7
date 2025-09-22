
public class WEEK7_7 {
    public static int gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        //without recrusion
        int a=5;
        int b=4;
        int r=0;
        r=a%b;
        while(r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        System.out.println("GCD of given numbers is:"+b);
        //with recursion
        System.out.println("Gcd of given two number is (with recursion): "+gcd(a,b));
    }
    
}
