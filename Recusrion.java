import java.util.ArrayList;

public class Recusrion {
    public static ArrayList func(int arr[], ArrayList lest, int j, int i)
    {
        if(i==arr.length)
            return lest;

        if(j==arr[i])
            lest.add(i);

        return func(arr,lest,j,i+1);


    }
    public static void main (String[] args) throws java.lang.Exception
    {
        int arr[]={1,2,3,4,5,5,9,7,5,8,9};
        ArrayList lest=new ArrayList();

        System.out.println(func(arr,lest,5,0));

    }


}
