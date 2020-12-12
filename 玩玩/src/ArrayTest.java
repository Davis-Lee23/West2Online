public class ArrayTest {
    public static void main(String[] args) {
        int[] y = {2,6,7,9,10,11,4,3,7};
        int smallest = y[0];
        int indexsmallest = 0;
        for(int i= 0;i<y.length;i++){
            if(y[i] % 2==0){
                if(y[i] > smallest){
                    smallest =y[i];
                    indexsmallest = i;
                }
            }
        }
        System.out.println("最大的偶数为: "+smallest);
        System.out.println("最大的索引为: "+ indexsmallest);
    }
}
