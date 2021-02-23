package emp;
import java.util.*;
class RearrangeSpaces {
    public String spaces(String str) {
        String[] words = str.trim().split("\\W+");
        int spaces = str.length() - str.replace(" ", "").length();
        
        int between = words.length == 1 ? 0 : spaces / (words.length - 1);
        return String.join(" ".repeat(between), words) + " ".repeat(spaces - between * (words.length - 1));
    }
    public static void main(String args[])
    {
    	Scanner sc= new Scanner(System.in); 
    	System.out.print("Enter a string: ");
    	String str= sc.nextLine(); 
    	Solution s=new Solution();
    	String str1=s.spaces(str);
    	System.out.println(str1);
    }
}