import java.util.*;
public class Solution288 {
    Map<String, Set<String>> table = new HashMap<>();

    public Solution288(String[] dictionary) {
        for (String x : dictionary) {
            String abr = getAbbr(x);

            if (!table.containsKey(abr)) {
                table.put(abr, new HashSet<String>());

            }

            table.get(abr).add(x);

        }

    }

    public boolean isUnique(String word) {
        String abr = getAbbr(word);
        if (!table.containsKey(abr) || (table.get(abr).contains(word) && table.get(abr).size() == 1)) {
            System.out.println("True");
            return true;

        }
        System.out.println("False");
        return false;

    }

    private String getAbbr(String s) {
        if (s.length() < 2) {
            return s;
        }


        return s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1);

    }
    public static void main(String args[])
    {
        String d[] = { "deer", "door", "cake", "card" };
        Solution288 x = new Solution288(d);

        x.isUnique("dear"); //false
        x.isUnique("cart"); // true
        x.isUnique("cane"); //false
        x.isUnique("make"); //true

    }

}





