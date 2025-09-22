public class WEEK7 {
    public static void binary_search(int a[],int x){
         int lb=0;
         int ub=(a.length-1);
         
         while(lb<ub){
             int mid =(lb+ub)/2;
             if(a[mid]==x){
                 System.out.println("Element is found in index:"+mid);
                 break;
             }
             else if(x>a[mid]){
                 lb=mid+1;
             }
             else
                 ub=mid-1;
         }
    }
    public static void main(String[] args) {
         int a[]={23,24,34,36,57};
         int x=36;
        binary_search(a,x);
    }
    
}
