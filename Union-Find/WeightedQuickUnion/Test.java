package WeightedQuickUnion;

class Test {
    
    public static void main(String[] args) {
        WeightedQuickUnion uf=new WeightedQuickUnion(10);
        
        uf.union(3, 4);
        uf.union(2, 9);
        uf.union(3, 9);
        uf.union(5, 6);
        
        System.out.println(uf.connected(3, 5));
        System.out.println(uf.connected(3, 9));
        
        for(int i=0; i<uf.id.length; i++) {
            System.out.print(uf.id[i]);
        }

        System.out.println();

        for(int i=0; i<uf.id.length; i++) {
            System.out.print(uf.sz[i]);
        }

        System.out.println();

        uf.union(3,5);
        
        System.out.println(uf.connected(3, 5));

        for(int i=0; i<uf.id.length; i++) {
            System.out.print(uf.id[i]);
        }

        System.out.println();

        for(int i=0; i<uf.id.length; i++) {
            System.out.print(uf.sz[i]);
        }

        return;
    }

}
