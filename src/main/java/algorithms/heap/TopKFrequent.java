package algorithms.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    Map<Integer,Integer> map = new HashMap<>();
    PriorityQueue<Integer> heap =
            new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

    public int[] topKFrequent(int[] nums, int k) {
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num : map.keySet()){
            heap.add(num);
            if (heap.size()>k){
                heap.poll();
            }
        }
        int []result = new int[k];
        for (int i = k-1; i >= 0; i--){
            result[i]= heap.poll();
        }
        return result;
    }
}
