# Colison Resolution Technique

### 1. Chaining
In chaining, we make each cell of hash table point to a linked list of records that have same hash function value. Chaining is simple, but requires additional memory outside the table.

```
Hash Table with 5 Buckets:
--------------------------
| 0 | -> (Key: 15)
--------------------------
| 1 | -> (Key: 7) -> (Key: 22)
--------------------------
| 2 |
--------------------------
| 3 | -> (Key: 13)
--------------------------
| 4 |
--------------------------
```
Advantages:
- Simple to implement.
- Hash table never fills up, we can always add more elements to the chain.
- It is mostly used when it is unknown how many and how frequently keys may be inserted or deleted.

Deadvantages:
- Time Complexity: O(n) (Worst Case)
- Wastage of Space (Some Parts of hash table are never used)
- If the chain becomes long, then search time can become O(n) in worst case.
- Uses extra space for links.

### 2. Open Addressing
In open addressing, all elements are stored in the hash table itself. Each table entry contains either a record or NIL. When searching for an element, we one by one examine table slots until the desired element is found or it is clear that the element is not in the table.

#### a. Linear Probing
In linear probing, we linearly probe for next slot. For example, typical gap between two probes is 1.

Advantages:
- Easy to implement.
- Cache friendly.

Deadvantages:
- Primary Clustering: The main problem with linear probing is clustering, many consecutive elements form groups and it starts taking time to find a free slot or to search an element.

#### b. Quadratic Probing

- Quadratic probing is an improvement over Linear Probing where we use a quadratic function to probe for next slot. For example, typical gap between two probes is 1, 4, 9, 16, ...
- Q(v,i) = (hf(v) c1i + c2i^2) % m
- c1 and c2 are positive auxiliary constants, m is the size of the hash table, hf(v) is the hash function and i is the probe number starting from 0.

Advantages:
- Less clustering than linear probing because quadratic probing uses a quadratic function to probe for next slot.

Deadvantages:
- Quadratic probing can enter in to an infinite loop, we need to make sure that the hash table is never full.