import java.util.ArrayList;
import java.util.List;

public class moresubsequence {
     public static void main(String[] args) {
        System.out.println(moreSubsequence(3,4,"abc","dddd"));
    }
    public static String moreSubsequence(int n, int m, String a, String b) {
        int d= generateSubsequences(a);
        int f= generateSubsequences(b);
  
        if(f>d) return b;
        else return a;
  
      }
  
       public static int generateSubsequences(String s) {
          List<String> result=new ArrayList<>();
          generate(s, "", result);
          return result.size();
      }
       public static void generate(String s,String up, List<String> result) {
          if(s.isEmpty())
          {
            if(!result.contains(up))
            result.add(up);
              return;
          }
          char ch=s.charAt(0);
          generate(s.substring(1),up+ch , result);
          generate(s.substring(1), up, result);
       }
}
