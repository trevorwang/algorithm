import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0) {
            return list;
        }
        if (rowIndex == 0) {
            list.add(1);
            return list;
        }
        list.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            int tmp = list.get(0);
            for (int j = 1; j < i; j++) {
                int tt = list.get(j);
                list.set(j, tmp + tt);
                tmp = tt;
            }
            list.add(1);
        }
        return list;
    }
}
// @lc code=end
