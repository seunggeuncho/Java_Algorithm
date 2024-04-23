public class Kadane {
    static int[] lst = {-2,1,3,4,-1,-1,-1,4};
    public static void main(String[] args) {

        int max_val = lst[0];
        int current = 0;
        int stand = 0;

        for(int i = 1;i < lst.length;i++){
            if (current < current + lst[i]){
                if (current + lst[i] < lst[i]){
                    current = lst[i];
                }else{
                    current += lst[i];
                }
                if (max_val < current){
                    max_val = current;
                }
            }else{
                current += lst[i];
            }
        }
        System.out.println("my" + max_val);
        maxSub();
    }

    public static void maxSub(){

        int cursum= 0;
        int maxsum = lst[0];

        for (int i = 0; i < lst.length;i++){
            if (cursum + lst[i] < lst[i]){
                cursum = lst[i];
            }else{
                cursum += lst[i];
            }
            if (maxsum < cursum){
                maxsum = cursum;
            }
        }
        System.out.println("definition : " + maxsum);


    }
}
