class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        HashMap<Long,Integer> map = new HashMap<>();
        int count=0;
        long sum=0;
        map.put(0L,1);
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
