class Solution {
    class Pair{
        int key; 
        int value;
        Pair(int k, int val)
        {
            key = k;
            value = val;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        // PriorityQueue<Pair> pq = new Priori
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.key - b.key);
        for(Map.Entry<Integer, Integer> e: hm.entrySet())
        {
            int key = e.getValue();
            int value = e.getKey();
            pq.offer(new Pair(key, value));
        }
        while(pq.size() > k)
        {
            pq.poll();
        }
        int[] ans = new int[k];
        int i = 0;
        while(!pq.isEmpty())
        {
            Pair a = pq.poll();
            ans[i] = a. value;
            i++;
        }
        return ans;
    }
}