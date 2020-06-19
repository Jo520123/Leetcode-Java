public class SellStock1
{
    public int maxProfit(int prices[]){
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i=0; i <prices.length; i++){
            if(prices[i] < min_price)
                min_price = prices[i];
            else if (prices[i]-min_price > max_profit)
                max_profit = prices[i]-min_price;
        }
        return max_profit;
    }

    public static void main(String args[])
    {

        SellStock1 ss = new SellStock1();
        //int[] arr = {7,1,5,3,6,4};
        int[] arr = {7,6,4,3,1};
        System.out.println(ss.maxProfit(arr));

    }


}
