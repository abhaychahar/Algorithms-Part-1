package QuickFind;

class test {
    
    public static void main(String[] args) {
        QuickFind uf=new QuickFind(10);
        
        uf.union(0, 5);
        uf.union(5, 6);
        uf.union(1, 2);
        uf.union(2, 7);
        uf.union(3, 8);
        uf.union(3, 4);
        uf.union(4, 9);

        System.out.println(uf.connected(1, 7));
        System.out.println(uf.connected(8, 9));

        for(int i=0; i<uf.id.length; i++) {
            System.out.print(uf.id[i]);
        }
    }

}
