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
public abstract class UF {

    UF(int N) {
    }

    public abstract void union(int p, int q);

    public abstract boolean connected(int p, int q);

    public abstract int find(int p);

    public abstract int count();

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new QuickUnionUF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }

    
}
