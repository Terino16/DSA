
import java.util.ArrayList;


public class Solution {
    public static void recursion(String s, int i, ArrayList<String> result)
    {
        if(s.length()==2*i)
        {
            result.add(s);
            return;
        }
        recursion(s+"()",i,result);
        recursion("("+s+")",i,result);
        
    }
    public static void main(String[] args) {
       ArrayList<String> result=new ArrayList<>();
        recursion("",2,result);
        System.out.println(result);
    } 
}