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
public class QuickFindUF extends UF {

    private int[] id;
    

    public QuickFindUF(int N) {
        super(N);
        id = new int[N];
        for (int i = 0; i < N; ++i)
            id[i] = i;
    }


    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }
    
    
    @Override
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; ++i) {
            if (id[i] == pid)
                id[i] = qid;
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
