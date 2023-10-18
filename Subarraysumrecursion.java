import java.util.ArrayList;
import java.util.List;

public class Subarraysumrecursion {
    
    public static void main(String[] args) {

        int a[]={1 ,2 ,3 ,1 ,1 ,1};
        long k=3;
        System.out.println(subarraysWithSumKwithlist(a,k));
        
    }
    //  public static  int subarraysWithSumK(int []a, long k) {
    //      List < Boolean >  result=new ArrayList<>();
    //     long sum=0;int in=0;
    //     subarray(a, k,sum,0,result);
    //     for( int i=0;i<result.size();i++)
    //     {
    //         if(result.get(i)==true)
    //         in++;
    //     }
    //     return in;
    // }
    // public static void subarray(int []a, long k,long sum, int i, List < Boolean >  result) 
    //     {
    //         if(i==a.length-1)
    //         {
    //            if(k==sum)
    //            result.add(true);
    //            else
    //            result.add(false);
    //            return ;
    //         }
    //         sum+=a[i];
    //         subarray(a,k,sum,i+1,result);
    //         sum-=a[i];
    //         subarray(a,k,sum,i+1,result);
    //     }


    public static List< List < Integer > > subarraysWithSumKwithlist(int []a, long k) {
        List< List < Integer > >   result=new ArrayList<>();
        long sum=0;
        subarraywithlist(a, k,sum,0,new ArrayList<>(),result);
        return result;
    }
    public static void subarraywithlist(int []a, long k,long sum, int i, List < Integer >  temp, List< List < Integer > >   result) 
        {
            if(i==a.length-1)
            {
               if(k==sum)
               result.add(new ArrayList<>(temp));
               return ;
            }
            temp.add(a[i]);
            subarraywithlist(a, k, sum + a[i], i + 1, temp, result);
            temp.remove(temp.size() - 1);
            subarraywithlist(a,k,sum,i+1,temp,result);
        }
}
