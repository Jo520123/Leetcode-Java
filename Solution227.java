import java.util.*;

public class Solution227 {


    public int calculate(String s) {

        char op = '+';
        int val = 0;
        int ans = 0;
        char[] chr_list = s.toCharArray();

        Stack<Integer> table = new Stack<>();


        for (int i = 0; i < chr_list.length; i++)
        {
            if (Character.isDigit(chr_list[i]))
            {
                val = val * 10 + chr_list[i] -'0';

            }

            if (i == chr_list.length - 1 || "+-*/".indexOf(chr_list[i]) != -1)
            {
                if (op == '+')
                {
                    table.push(val);
                }
                else if (op == '-')
                {
                    table.push(-val);
                }
                else if (op == '*')
                {
                    int m_tol = (int) (table.pop() * val);
                    table.push(m_tol);
                }
                else
                    {
                        int d_tol = (int) (table.pop() / val);
                        table.push(d_tol);
                    }
                op = chr_list[i];
                val = 0;
            }
        }

        for (int x : table) {
            ans += x;
        }
        return ans;
    }

    public static void main(String arg[]) {

        Solution227 j = new Solution227();

        String s1 =  "3+2*2";
        //Output: 7
        System.out.println(j.calculate(s1));

        String s2 = " 3/2 ";
        //Output: 1
        System.out.println(j.calculate(s2));


        String s3 = " 3+5 / 2 ";
        //Output: 5
        System.out.println(j.calculate(s3));
        
    }

}
