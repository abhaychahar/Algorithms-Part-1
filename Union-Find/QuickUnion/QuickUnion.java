package QuickUnion;

class QuickUnion {

    int[] id;

    QuickUnion(int n) {
        id=new int[n];

        for(int i=0; i<id.length; i++) {
            id[i]=i;
        }
    }

    int root(int i) {
        while(id[i]!=i) {
            i=id[i];
        }

        return i;
    }

    boolean connected(int p, int q) {
        return root(p)==root(q);
    }

    void union(int p, int q) {
        int p_root=root(p);
        int q_root=root(q);
        
        id[p_root]=q_root;
        
        return;
    }

}