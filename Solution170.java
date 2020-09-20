import java.util.HashMap;
public class Solution170 {
    public HashMap<Integer, Integer> store_dic = new HashMap<Integer, Integer>();

    public void add(int number){
        if (store_dic.containsKey(number))
        {store_dic.put(number, store_dic.get(number)+1);}
        else
        {store_dic.put(number,1);}
    }

    public boolean find(int value) {
        for (Integer x : store_dic.keySet()) {
            int ans = value - x;
            if (store_dic.containsKey(ans) || (ans == x && store_dic.get(ans) > 1)) {
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        Solution170 s = new Solution170();
        s.add(1);
        s.add(3);
        s.add(5);

        System.out.println(s.find(4));
        System.out.println(s.find(7));
        //add(1); add(3); add(5);
        //find(4) -> true
        //find(7) -> false

    }
}

