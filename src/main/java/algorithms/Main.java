package algorithms;

import algorithms.binary_search.SearchInsertPosition;
import algorithms.hashmap.FirstUnique;
import algorithms.heap.TopKFrequent;
import algorithms.slidingwindow.MinimumSizeSubarraySum;
import algorithms.slidingwindow.RateLimiter;
import algorithms.stack.MinStack;
import algorithms.twopointers.ThreeSum;
import algorithms.trees.TreeNode;
import algorithms.trees.TreeTraversals;
import algorithms.hashmap.IsAnagram;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        testFirstUnique();
        testMinimumSizeSubarray();
        testThreeSum();
        testMinStack();
        testTreeTraversals();
        testRateLimiter();
        testIsAnagram();
        testTopKFrequent();
        testSearchInsertPosition();
    }

    private static void testFirstUnique() {
        FirstUnique fu = new FirstUnique();
        System.out.println("FirstUnique:");
        System.out.println(fu.firstUniqChar("loveleetcode")); // 2
        System.out.println(fu.firstUniqChar("aabb"));         // -1
        System.out.println();
    }

    private static void testMinimumSizeSubarray() {
        MinimumSizeSubarraySum ms = new MinimumSizeSubarraySum();
        System.out.println("MinimumSizeSubarraySum:");
        System.out.println(ms.minSubArrayLen(7, new int[]{2,3,1,2,4,3})); // 2
        System.out.println(ms.minSubArrayLen(4, new int[]{1,4,4}));       // 1
        System.out.println(ms.minSubArrayLen(11, new int[]{1,1,1,1,1}));  // 0
        System.out.println();
    }

    private static void testThreeSum() {
        ThreeSum ts = new ThreeSum();
        System.out.println("ThreeSum:");
        List<List<Integer>> result =
                ts.threeSum(new int[]{-1,0,1,2,-1,-4});
        System.out.println(result);
        System.out.println();
    }

    private static void testMinStack() {
        MinStack stack = new MinStack();
        System.out.println("MinStack:");
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        System.out.println();
    }

    private static void testTreeTraversals() {
        System.out.println("TreeTraversals:");

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeTraversals traversals = new TreeTraversals();

        System.out.println("Inorder:");
        System.out.println(traversals.inorderTraversal(root));

        System.out.println("Level order:");
        System.out.println(traversals.levelOrder(root));

        System.out.println();
    }

    private static void testRateLimiter() {
        System.out.println("RateLimiter:");

        RateLimiter limiter = new RateLimiter();

        System.out.println(limiter.allowRequest("user1", 0));
        System.out.println(limiter.allowRequest("user1", 1));
        System.out.println(limiter.allowRequest("user1", 2));
        System.out.println(limiter.allowRequest("user1", 3));

        System.out.println(limiter.allowRequest("user1", 12));

        System.out.println(limiter.allowRequest("user2", 1));
        System.out.println(limiter.allowRequest("user2", 2));
        System.out.println(limiter.allowRequest("user2", 3));
        System.out.println(limiter.allowRequest("user2", 4));

        System.out.println();
    }

    private static void testIsAnagram() {
        System.out.println("IsAnagram:");

        IsAnagram ia = new IsAnagram();

        System.out.println(ia.isAnagram("anagram", "nagaram"));
        System.out.println(ia.isAnagram("rat", "car"));
        System.out.println(ia.isAnagram("listen", "silent"));
        System.out.println(ia.isAnagram("hello", "bello"));

        System.out.println();
    }
    private static void testTopKFrequent() {
        TopKFrequent t = new TopKFrequent();

        System.out.println("TopKFrequent:");

        int[] result = t.topKFrequent(new int[]{1,1,1,2,2,3}, 2);

        System.out.println(Arrays.toString(result));
    }

    private static void testSearchInsertPosition(){
        SearchInsertPosition s = new SearchInsertPosition();

        System.out.println("SearchInsertPosition: ");
        System.out.println(s.search(new int[]{1,3,5,6},5));
        System.out.println(s.search(new int[]{1,3,5,6},2));
    }
}