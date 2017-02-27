/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package union_find;

import Standard_Libraries.StdIn;
import Standard_Libraries.StdOut;

/**
 *
 * @author ren
 */
public class QuickUnionUF extends UF {

    private int[] id;

    
    public QuickUnionUF(int N) {
        super(N);
        id = new int[N];
        for (int i = 0; i < N; ++i) {
            id[i] = i;
        }
    }

    
    // chase parent pointers untill reach root
    private int root(int i) {
        while (i != id[i]) {
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
        id[i] = j;
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
