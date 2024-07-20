import scala.Int;

import java.util.ArrayList;
import java.util.*;

public class TestCollect {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);


        List<Integer> newNums = mkNewList(nums);
        System.out.println(nums);
        System.out.println(newNums);

//        multi(nums);
//        System.out.println(nums);
    }
    // TODO 原始數據想要把每條數據乘以2，產生新的集合(不可變)
    public static List<Integer> mkNewList(List<Integer> nums) {
        List<Integer> nums2 = new ArrayList<Integer>();
        for (Integer num: nums) {
            nums2.add(num * 2);
        }
        return nums2;
    }

    // TODO 原始數據想要把每條數據乘以2，自身集合發生變化(可變)
    public  static void multi(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++){
            Integer num = nums.get(i);
            nums.set(i, num * 2);
        }
    }
}
