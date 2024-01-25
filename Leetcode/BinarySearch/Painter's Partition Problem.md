# Painter's Partition Problem

```
class Solution{
    static boolean isPosible(int[] arr , long min_time , int k){
        long curr_time = 0, painter = 0;
        for(int i = 0 ; i < arr.length ; i++){
            curr_time += arr[i];
            if(curr_time == min_time){
                painter++;
                curr_time = 0;
            }else if(curr_time > min_time){
                painter++;
                curr_time = 0;
                curr_time += arr[i];
            }
        }
        if(curr_time > 0) painter++;
        if(painter <= k) return true;
        return false;
    }
    static long minTime(int[] arr,int n,int k){
        //code here
        long max_element = Integer.MIN_VALUE , sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += (long)arr[i];
            max_element = Math.max(max_element , (long)arr[i]);
        }
        long si = max_element , ei = sum , ans = 0;
        while(ei >= si){
            long mid = (ei-si)/2 + si;
            if(isPosible(arr , mid , k)){
                ans = mid;
                ei = mid - 1;
            }else si = mid + 1;
        }
        return ans;
    }
}
```

- Focus on the isPosible function
- isPosible function takes min_time and k as input and return true if it is possible to paint the boards with min_time
- Now, think the range in which the answer lies
- Here, the answer lies between the maximum element in the array and the sum of all the elements in the array
- when the painter is 1 , then the minimum time will be the sum of all the elements in the array
- when the painter is equal to the number of boards , then the minimum time will be the maximum element in the array
- So, we have to find the minimum time such that we can paint the boards with k painters
- So, as we have range in which the answer lies , we can apply binary search
- Suppose, we have mid = (ei-si)/2 + si
- Now, if we can paint the boards with min_time = mid , then one possible answer is mid, but we have to find the minimum time such that we can paint the boards with k painters
- So, we will check for the left part of the mid, before that we will store the mid in ans
- If we can't paint the boards with min_time = mid , then we will check for the right part of the mid
- We will continue this process until si <= ei
- At last, we will return ans
 <br/>
 <br/>
<b>Binary Search is the small part of the problem , the main part is to find the isPosible function</b>
