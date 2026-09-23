package DSA.LinkedList;
/*
Question:
Design a data structure that follows the Least Recently Used (LRU) cache policy.
Implement get(key), which returns the value if the key exists, and put(key,value), which inserts or updates a key.
When the cache exceeds its capacity, remove the least recently used key.
Input:
        capacity = 2;
        put(1,1);
        put(2,2);
        get(1);
        put(3,3);
        get(2);
        capacity1 = 1;
        put(2,1);
        get(2);
        put(3,2);
        get(2);
        get(3);
Example 1:
Output:
1
-1
Explanation:
Key 2 is the least recently used after adding key 3, so it is removed.
Example 2:
Output:
1
-1
2
Explanation:
The cache keeps only the most recently used key because its capacity is 1.
--------------------------------------------------
*/
public class LL139_LRUCache_146 {
}
