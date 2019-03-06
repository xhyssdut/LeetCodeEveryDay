package leetcode_701_750;

import java.util.LinkedList;

/**
 * leetcode_701_750
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。如果之后都不会升高，请输入 0 来代替。
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的都是 [30, 100] 范围内的整数。
 * @author xin
 * @date 2019-03-05
 */
public class DailyTemperatures_739 {
    class Solution {
        public int[] dailyTemperatures(int[] T) {
            if(T==null){
                return null;
            }
            int[] result = new int[T.length];
            LinkedList<Integer> help = new LinkedList<>();
            for(int i = T.length-1;i>=0;i--){
                if(help.isEmpty()){
                    result[i] = 0;
                    help.push(i);
                }else {
                    while(!help.isEmpty()){
                        if(T[i]>T[help.peek()]){
                            help.pop();
                        }else {
                            result[i] = help.peek()-i;
                            break;
                        }
                    }
                    if(help.isEmpty()){
                        result[i] = 0;
                    }
                    help.push(i);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new DailyTemperatures_739().new Solution();
        solution.dailyTemperatures(new int[]{89,62,70,58,47,47,46,76,100,70});
    }
}
