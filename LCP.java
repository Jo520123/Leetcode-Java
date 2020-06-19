public class LCP {

    public String longestCommonPrefix1(String[] strs)
    {
        if (strs.length == 0)
            return "";

        String prex = strs[0];

        for (int i=1; i < strs.length; i++)
            while (strs[i].indexOf(prex) != 0)
            {
                prex = prex.substring(0,prex.length()-1);
                if (prex.isEmpty())
                    return "";
            }

        return prex;
    }

    public static void main(String args[]){

        LCP ss = new  LCP();

        String[] a = {"flower","flow","flight"};
        System.out.println(ss.longestCommonPrefix1(a));
    }
}
