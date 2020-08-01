import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Subset {
    int rank;
    int parent;
    int size;

    public Subset(int i, int r) {
        rank = r;
        parent = i;
        size = 1;
    }

    public Subset(int i) {
        rank = 0;
        parent = i;
        size = 1;
    }
}

class UnionFind {

    Subset[] sets;

    public UnionFind(int n) {
        sets = new Subset[n];
    }

    public void union(int i, int j) {

        int iRoot = find(i);
        int jRoot = find(j);

        if (iRoot == jRoot)
            return;

        if (sets[iRoot].rank < sets[jRoot].rank) {
            sets[iRoot].parent = jRoot;
            sets[jRoot].size += sets[iRoot].size;
        } else if (sets[iRoot].rank > sets[jRoot].rank) {
            sets[jRoot].parent = iRoot;
            sets[iRoot].size += sets[jRoot].size;
        } else {
            sets[jRoot].parent = iRoot;
            sets[iRoot].rank++;
            sets[iRoot].size += sets[jRoot].size;
        }

    }

    public int find(int i) {
        if (sets[i].parent != i)
            sets[i].parent = find(sets[i].parent);
        return sets[i].parent;
    }

    public void makeSet(int i) {
        sets[i] = new Subset(i);
    }
}

public class MergingCommunities {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nq = br.readLine().split(" ");

        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);

        String query;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++)
            uf.makeSet(i);
        while (--q >= 0) {
            query = br.readLine();
            if (query.startsWith("M")) {
                String[] mij = query.split(" ");
                int i = Integer.parseInt(mij[1]);
                int j = Integer.parseInt(mij[2]);
                uf.union(i - 1, j - 1);
            } else {
                String[] qi = query.split(" ");
                int i = Integer.parseInt(qi[1]);

                int p = uf.find(i - 1);
                System.out.println(uf.sets[p].size);
            }
        }
    }
}