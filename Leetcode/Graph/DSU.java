package Leetcode.Graph;

import java.util.*;

public class DSU {
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    DSU(int n) {
        for (int i = 0; i < n; i++) {
            parent.add(i);
            size.add(1);
        }
    }

    // Time : O(4 * Alpha)
    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int ulp = findUPar(parent.get(node));
        // path Compression
        parent.set(node, ulp);
        return ulp;
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);

        // Alredy in the same Union
        if (ulp_u == ulp_v)
            return;

        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}
