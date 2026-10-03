package DSA.Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
Question:
Given an array of integers representing asteroids, determine the state
of the asteroids after all collisions.

A positive value represents an asteroid moving right.
A negative value represents an asteroid moving left.
When two asteroids collide:
1. The smaller asteroid explodes.
2. If both have the same size, both explode.
3. Asteroids moving in the same direction never collide.
Input:
        int[] asteroids1 = {5, 10, -5};
        int[] asteroids2 = {8, -8};
        int[] asteroids3 = {10, 2, -5};
Example 1:
Output:
        [5, 10]
Explanation:
        10 and -5 collide.
        10 survives because it is larger.
Example 2:
Output:
        []
Explanation:
        8 and -8 have the same size, so both explode.
Example 3:
Output:
        [10]
Explanation:
        2 and -5 collide and 5 survives.
        Then 10 and -5 collide, and 10 survives.
--------------------------------------------------
*/
public class ST173_AsteroidCollision_735 {

    public static int[] asteriodCollision(int nums[]){
        ArrayList<Integer> list=new ArrayList<>();
        for(int n:nums){
            if(n>0)list.add(n);
            else{
                while(!list.isEmpty() && list.getLast()>0 && list.getLast()<Math.abs(n)){
                    list.removeLast();
                }
                if(!list.isEmpty() && list.getLast()==Math.abs(n)){
                    list.removeLast();
                } else if (list.isEmpty() || list.getLast()<0) {
                    list.add(n);

                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] asteroids1 = {5, 10, -5};
        int[] asteroids2 = {8, -8};
        int[] asteroids3 = {10, 2, -5};
        System.out.println(asteriodCollision(asteroids1));
        System.out.println(asteriodCollision(asteroids2));
        System.out.println(asteriodCollision(asteroids3));

    }
}
