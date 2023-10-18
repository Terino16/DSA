import java.util.ArrayList;
import java.util.List;

public class printsubsequences {
    public static void main(String[] args) {
        System.out.println(generateSubsequences("abc"));
    }
    public static List<String> generateSubsequences(String s) {
        List<String> result=new ArrayList<>();
        generate(s, "", result);
        return result;
    }
     public static void generate(String s,String up, List<String> result) {
        if(s.isEmpty())
        {
            result.add(up);
            return;
        }
        char ch=s.charAt(0);
        generate(s.substring(1),up+ch , result);
        generate(s.substring(1), up, result);
     }
}
