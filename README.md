# Algorithms Practice (Java)

A small collection of classic algorithm problems implemented in Java with focus on clean code and interview-style solutions.

## Covered patterns
- Two pointers
- Sliding window
- HashMap usage
- Stack
- Tree traversals (DFS/BFS)

## Implementations
- `algorithms.twopointers.ThreeSum` - find all unique triplets that sum to 0 (O(n^2))
- `algorithms.slidingwindow.MinimumSizeSubarraySum` - minimal length subarray with sum >= target (O(n))
- `algorithms.hashmap.FirstUnique` - first unique character in a string (O(n))
- `algorithms.stack.MinStack` - stack with O(1) min retrieval
- `algorithms.tree.TreeTraversals` - inorder (DFS) and level-order (BFS)

## How to run
## Build

mvn clean package

## Run locally

java -jar target/AlgorithmPractice-1.0-SNAPSHOT.jar

## Run with Docker

docker build -t algo-practice .
docker run --rm algo-practice

## Notes
Each solution aims to be:
- Reusable (no hardcoded inputs inside methods)
- Time/space complexity aware
- Easy to read and explain in an interview
