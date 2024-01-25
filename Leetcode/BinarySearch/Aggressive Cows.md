# Aggressive Cows

```
class Solution {
    public static boolean isPosible(int[] stalls , int min_distance , int k){
        int currDistance = 0 , currCow = 1;
        for(int i = 1 ; i < stalls.length ; i++){
            currDistance += stalls[i] - stalls[i-1];
            if(currDistance >= min_distance){
                currDistance = 0;
                currCow++;
            }
        }
        if(currCow >= k) return true;
        return false;
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int si = 1 , ei = stalls[stalls.length - 1] - stalls[0] , ans = 0;
        while(ei >= si){
            int mid = (ei-si)/2 + si;
            if(isPosible(stalls , mid , k)){
                ans = mid;
                si = mid + 1;
            }else ei = mid - 1;
        }
        return ans;
    }
}
```

- Foucus on the isPosible function
- isPosible function is takes min_distance and k as input and return true if it is possible to place k cows with min_distance between them
- Now, think the range in which the answer lies
- See, that we have alredy sorted the stalls array
- The answer lies between 1 and stalls[stalls.length - 1] - stalls[0]
- stalls[stalls.length - 1] - stalls[0] is the maximum distance between any two stalls , so we can place only one cow in that distance
- Now, we have to find the maximum distance between two stalls such that we can place k cows
- So, as we have range in which the answer lies , we can apply binary search
- Suppose, we have mid = (ei-si)/2 + si
- Now, if we can place k cows with min_distance = mid , then one possible answer is mid, but we have to find the maximum distance between two stalls such that we can place k cows
- So, we will check for the right part of the mid, before that we will store the mid in ans
- If we can't place k cows with min_distance = mid , then we will check for the left part of the mid
- We will continue this process until si <= ei
- At last, we will return ans
 <br/>
 <br/>
<b>Binary Search is the small part of the problem , the main part is to find the isPosible function</b>
