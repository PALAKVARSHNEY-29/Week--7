
public class WEK7_6 {
public static void fibo(int first, int second, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(first + " ");
        fibo(second, first + second, n - 1);
    }
    public static void main(String[] args) {
      //fibonacci series without recursion
int N=10;
        int first=0;
        int second=1;
        System.out.println("without recursion:");
        for(int i=1; i<=N-2; i++){
            if(i==1){
                System.out.print(first+ ", ");
            }
            if(i==2){
                System.out.print(second+", ");
            }
            int third =first+second;
            System.out.print(third+", ");
            first=second;
            second=third;
        }
        System.out.println("\nwith recursion:");
          //WITH RECURSION
        fibo(0, 1, N);
    }
    
}
