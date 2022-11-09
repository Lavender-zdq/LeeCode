/**
 * 剑指 Offer 11. 旋转数组的最小数字
 *
 */

public class Offter11 {

    public int minArray(int[] numbers) {
        Integer res=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(res>numbers[i]){
                res=numbers[i];
            }
        }
        return  res;

    }


}
