package WeightedQuickUnion;

class WeightedQuickUnion {
    
    int[] id;
    int[] sz;

    WeightedQuickUnion(int n) {
        id=new int[n];
        sz=new int[n];

        for(int i=0; i<id.length; i++) {
            id[i]=i;
            sz[i]=1;
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
        
        if(p_root==q_root) {
            return;
        }
        
        if(sz[p_root]<sz[q_root]) {
            id[p_root]=q_root;
            sz[q_root]+=sz[p_root];
        }
        else {
            id[q_root]=p_root;
            sz[p_root]+=sz[q_root];
        }

        return;
    }

}
