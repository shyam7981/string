package string;
import java.util.ArrayDeque;
import java.util.Deque;
public class Valid_Brackets {	
	 static boolean areBracketsBalanced(String expr)
	    {       
	        Deque<Character> stack
	            = new ArrayDeque<Character>();	        
	        for (int i = 0; i < expr.length(); i++)
	        {
	            char x = expr.charAt(i);	 
	            if (x == '(' || x == '[' || x == '{')
	            {	                
	                stack.push(x);
	                continue;
	            }   
	            if (stack.isEmpty())
	                return false;
	            char check;
	            switch (x) {
	            case ')':
	                check = stack.pop();
	                if (check == '{' || check == '[')
	                    return false;
	                break;
	 
	            case '}':
	                check = stack.pop();
	                if (check == '(' || check == '[')
	                    return false;
	                break;
	 
	            case ']':
	                check = stack.pop();
	                if (check == '(' || check == '{')
	                    return false;
	                break;
	            }
	        }	        
	        return (stack.isEmpty());
	    } 
	 public static void main(String[] args)
	    {
	        String[] str = {"()", "()[]{}", "(]", "([)]" ,"{[]}"};  
	        for (int i=0; i<str.length; i++)  
	        {  
	         if (areBracketsBalanced(str[i]))
	            System.out.println("true ");
	        else
	            System.out.println("false ");
	        }
	    }
}