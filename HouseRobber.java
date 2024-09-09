/*
 * This will be my HouseRobber class that will contain my solution to the problem
 *
 * This is a leetcode problem for the Dynamic Programming tutorial.
 * @Author: Nicholas Burkett
 * @Date: 09/08/2024
 */

public class HouseRobber{
        
        //This will be my rober function that will solve the problem at hand.
        public int run(int[] nums){
                //Need to define my edge cases
                if(nums.length == 0) return 0; 
                if(nums.length ==  1) return nums[0];

                //Now I need to create an array to store the max money that can be robbed/house
                int[] dp = new int[nums.length];

                //Base cases
                dp[0] = nums[0];    //Rob the first house
                dp[1] = Math.max(nums[0], nums[1]);  //Rob the house that has more
                
                //Fill the dp array
                for(int i = 2; i < nums.length; i++){
                        dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
                }

                //The last entry in the array will have the max value.
                return dp[nums.length - 1];
        }
}
