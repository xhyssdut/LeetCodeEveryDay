package leetcode_401_450;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode_401_450
 *
 * @author xin
 * @date 2019-03-01
 */
public class FizzBuzz_412 {
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> list = new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(n%3==0){
                    list.add("Fizz");
                }else if(n%5==0){
                    list.add("Buzz");
                }else if(n%15==0){
                    list.add("FizzBuzz");

                }else {
                    list.add(""+i);

                }
            }
            return list;
        }
    }
}
