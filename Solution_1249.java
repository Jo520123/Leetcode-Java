import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
public class Solution_1249 {

        public String minRemoveToMakeValid(String s) {
            List<Integer> Del = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) == '(')
                {
                    stack.push(i);
                }
                else if(s.charAt(i) == ')')
                {
                    if(stack.isEmpty())
                    {
                        Del.add(i);
                    }
                    else
                    {
                        stack.pop();
                    }
                }

            }

            while(! stack.isEmpty())
            {
                Del.add(stack.pop());
            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++)
            {
                if(! Del.contains(i))
                {
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        }

        public static void main(String args[]) {

            Solution_1249 ss = new Solution_1249();
            String s = "lee(t(c)o)de)";
            System.out.println(ss.minRemoveToMakeValid(s));

        }
    }
