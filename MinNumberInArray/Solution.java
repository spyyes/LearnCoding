package MinNumberInArray;

/**
 * a brief introduction
 *
 * @author spy@pku.edu.cn
 */
class Solution {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {
        if(numbers.length == 0){
            //返回约定值
            return -1;
        }
        for(int i = 1; i < numbers.length;i++){
            if(numbers[i] < numbers[i-1]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
}