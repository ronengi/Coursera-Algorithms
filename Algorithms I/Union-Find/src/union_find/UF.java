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
public abstract class UF {

    UF(int N) {}
    
    public abstract void union(int p, int q);

    public abstract boolean connected(int p, int q);

    public abstract int find(int p);

    public abstract int count();
    
}
