import java.util.*;
public class ToyList{
    public static void main(String[] args){
    	//Test run
        int[] prices = {1,2,3,4,5};
        int amount_to_spend = 10;
        int test = maximumToys(prices, amount_to_spend);


    }

    public static int maximumToys(int[] prices, int amount_to_spend){
        Arrays.sort(prices);
        int max_index = 0;
        for(int i = 0; i < prices.length; i++){        //Choosing max index
            if(prices[i] > amount_to_spend){
                max_index = i;
            }
            else{
                max_index = prices.length;
            }
        }
        System.out.println(max_index);

        int price_values = 0;
        Integer[] array = new Integer[max_index];
        if(prices[0] <= amount_to_spend){
            price_values += prices[0];
            array[0] = prices[0];
        }

        for(int i = 1; i < max_index; i++){
            if((price_values + prices[i]) <= amount_to_spend){
                array[i] = prices[i];
                price_values += prices[i];
            }
        }

        int arrayLength = 0;
        for(int i = 0; i < array.length; i++){
            if(!(array[i] == null)){
                arrayLength++;
            }
        }

        System.out.println("Max amount of toys: " + arrayLength);
        return arrayLength;
    }
}