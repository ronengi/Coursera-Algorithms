/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package union_find;


/**
 *
 * @author ren
 */
public class QuickUnionUF extends UF {

    private int[] id;
    private int[] sz;

    
    public QuickUnionUF(int N) {
        super(N);
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; ++i) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    
    // chase parent pointers untill reach root
    private int root(int i) {
        while (i != id[i]) {
            // improvement 2: path compression (only one extra line of code)
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    
    // check if p and q have same root
    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    
    // change root of p to point to root of q
    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j)
            return;
        
        // improvement 1: weighting        
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }
        else {
            id[j] = i;
            sz[i] += sz[j];
        }
        
    }

    
    @Override
    public int find(int p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
