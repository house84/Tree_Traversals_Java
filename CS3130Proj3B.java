import java.util.ArrayList;

public class CS3130Proj3B {
    public static void main(String[] args) {


        //Display introduction
        System.out.println("\n== Find Average Height of BST with differing Nodes and BST's Compared ==");

        //Array List of 5 Elements ========================================
        int sum = 0;
        ArrayList<BinarytreeInsert> t5 = new ArrayList<>(5);
        //t5 ArrayList BST with 100 Nodes
        for(int i = 0; i< 5;i++) {
            t5.add(new BinarytreeInsert(100));
            sum += t5.get(i).treeHeight(t5.get(i).getNode());
        }
        System.out.print("\nAverage Height t5 with 100 nodes is " + (sum/5));

        //t5 ArrayList BST with 500 Nodes
        sum = 0;
        ArrayList<BinarytreeInsert> t51 = new ArrayList<>(5);
        for(int i = 0; i< 5;i++) {
            t51.add(new BinarytreeInsert(500));
            sum += t51.get(i).treeHeight(t51.get(i).getNode());
        }
        System.out.print("\nAverage Height t5 with 500 nodes is " + (sum/5));

        //t5 ArrayList BST with 10000 Nodes
        sum = 0;
        ArrayList<BinarytreeInsert> t52 = new ArrayList<>(5);
        for(int i = 0; i< 5;i++) {
            t52.add(new BinarytreeInsert(1000));
            sum += t52.get(i).treeHeight(t52.get(i).getNode());
        }
        System.out.print("\nAverage Height t5 with 1000 nodes is " + (sum/5));


        //Array List of 10 Elements ========================================
        //t10 ArrayList BST with 100 Nodes
        sum = 0;
        ArrayList<BinarytreeInsert> t10 = new ArrayList<>(10);
        for(int i = 0; i< 10;i++) {
            t10.add(new BinarytreeInsert(100));
            sum += t10.get(i).treeHeight(t10.get(i).getNode());
        }
        System.out.print("\nAverage Height t10 with 100 nodes is " + (sum/10));


        //t10 ArrayList BST with 500 Nodes
        sum = 0;
        ArrayList<BinarytreeInsert> t101 = new ArrayList<>(10);
        for(int i = 0; i< 10;i++) {
            t101.add(new BinarytreeInsert(500));
            sum += t101.get(i).treeHeight(t101.get(i).getNode());
        }
        System.out.print("\nAverage Height t10 with 500 nodes is " + (sum/10));

        //t10 ArrayList BST with 1000 Nodes
        sum = 0;
        ArrayList<BinarytreeInsert> t102 = new ArrayList<>(10);
        for(int i = 0; i< 10;i++) {
            t102.add(new BinarytreeInsert(1000));
            sum += t102.get(i).treeHeight(t102.get(i).getNode());
        }
        System.out.print("\nAverage Height t10 with 1000 nodes is " + (sum/10));

        //Array List of 15 Elements ========================================
        //t15 ArrayList BST with 100 Nodes
        sum = 0;
        ArrayList<BinarytreeInsert> t15 = new ArrayList<>(15);
        for(int i = 0; i< 15;i++) {
            t15.add(new BinarytreeInsert(100));
            sum += t15.get(i).treeHeight(t15.get(i).getNode());
        }
        System.out.print("\nAverage Height t15 with 100 nodes is " + (sum/15));

        //t5 ArrayList BST with 100 Nodes
        sum = 0;
        ArrayList<BinarytreeInsert> t151 = new ArrayList<>(15);
        for(int i = 0; i< 15;i++) {
            t151.add(new BinarytreeInsert(500));
            sum += t151.get(i).treeHeight(t151.get(i).getNode());
        }
        System.out.print("\nAverage Height t15 with 500 nodes is " + (sum/15));

        //t5 ArrayList BST with 100 Nodes
        sum = 0;
        ArrayList<BinarytreeInsert> t152 = new ArrayList<>(15);
        for(int i = 0; i< 15;i++) {
            t152.add(new BinarytreeInsert(1000));
            sum += t152.get(i).treeHeight(t152.get(i).getNode());
        }
        System.out.print("\nAverage Height t15 with 1000 nodes is " + (sum/15));

    }
}
