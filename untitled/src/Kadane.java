public class Kadane {
    static int[] lst = {-2,1,-3,4,-1,2,1,-5,4};
    public static void main(String[] args) {

        int max_val = lst[0];
        int current = 0;
        int stand = 0;

        for(int i = 1;i < lst.length;i++){
            if (current > current + lst[i]){
                stand = lst[i];
                current = lst[i] + current;
            }else{
                current = current + lst[i];
                if (current > max_val){
                    max_val = current;
                }
            }
        }
        System.out.println(max_val);
    }
}
