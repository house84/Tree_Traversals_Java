
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinarytreeInsert {

    //Create Node for BST
    Node rootnode;

    //No argument Default Constructor
    BinarytreeInsert(){}

    //Constructor for Part B
    BinarytreeInsert(int nodes){

        int k = (int)(Math.random()*1000);

        this.rootnode = new Node(k);

        for(int i = 0; i < (nodes); i++){

                int b = (int)(Math.random()*1000);
                Treeinsert(rootnode,b);

        }

        Treeinsert(getNode(), rootnode.key);
    }




    static class Node {

        Node left;
        Node right;
        int key;

        public Node(int key) {
            this.key = key;
        }
    }

    //insert Node
    public void insertNode(){
        System.out.println("How many nodes would you like to enter? ");
        int number = validate(1,1000, "Nodes");
        for(int i = 0; i < number; i++){
            System.out.print("Enter node " +(i+1)+": ");
            int num = validate(-100000,100000, "Value");
            Treeinsert(rootnode, num);
        }

        Treeinsert(getNode(), rootnode.key);
    }


    //Populate Default BST with Elements
    public void run() {
        this.rootnode = new Node(30);
        //System.out.println("Building tree with root value " + rootnode.key);
        //System.out.println("=================================");
        Treeinsert(rootnode, 10);
        Treeinsert(rootnode, 45);
        Treeinsert(rootnode, 38);
        Treeinsert(rootnode, 20);
        Treeinsert(rootnode, 50);
        Treeinsert(rootnode, 25);
        Treeinsert(rootnode, 33);
        Treeinsert(rootnode, 8);
        Treeinsert(rootnode, 12);
    }

    public Node getNode(){
        return rootnode;
    }


                              //\
                             //=\\
                            //===\\
                           //=====\\
                          //=======\\
                         //=========\\
                        //===========\\
                       // Tree-Insert \\
                      //===============\\


    public void Treeinsert(Node node, int value) {
        if (value <= node.key) {
            if (node.left != null) {
                Treeinsert(node.left, value);
            } else {
                //System.out.println("  Inserted " + value + " to left of Node " + node.key);
                node.left = new Node(value);
            }
        } else if (value > node.key) {
            if (node.right != null) {
                Treeinsert(node.right, value);
            } else {
               // System.out.println("  Inserted " + value + " to right of Node " + node.key);
                node.right = new Node(value);
            }
        }
    }

    //========================================
    //Traverse PostOrder(Left, Right, Root)
    //Traverse InOrder (Left, Root, Right)
    //Travers PreOrder(Root, Left, Right)
    //========================================


    //Print Post Order Traversal
    void printPostorder(Node node) {
        if (node == null)
            return;

        // Check Left SubTree
        printPostorder(node.left);

        // Check Right SubTree
        printPostorder(node.right);

        //Root
        System.out.print(node.key + " ");
    }

    //Print Inorder Traversal
    void printInorder(Node node) {
        if (node == null)
            return;

        //Left SubTree
        printInorder(node.left);

        //Root
        System.out.print(node.key + " ");

        //Right Subtree
        printInorder(node.right);
    }

    //Preorder Traversal
    void printPreorder(Node node) {
        if (node == null)
            return;

        //Root
        System.out.print(node.key + " ");

        //Left Subtree
        printPreorder(node.left);

        //RightSubtree
        printPreorder(node.right);
    }


    // Iterative method to find height of Binary Tree
    int treeHeight(Node node)
    {
        // Base Case
        if (node == null)
            return 0;

        //Create an empty queue for level order traversal
        Queue<Node> q = new LinkedList();

        q.add(node);
        int height = -1;

        while (1 == 1)
        {
            //Number of nodes at current level.
            int nodeCount = q.size();
            if (nodeCount == 0) {return height;}

            height++;

            // Dequeue all nodes of current level and Enqueue all
            // nodes of next level
            while (nodeCount > 0)
            {
                Node newnode = q.peek();
                q.remove();
                if (newnode.left != null)
                    q.add(newnode.left);
                if (newnode.right != null)
                    q.add(newnode.right);
                nodeCount--;
            }

        }
    }



    //Check for Key in BST,
    public boolean checksearch2(Node node, int key){

        boolean exists = ifNodeExists(node, key);

        return exists;
    }


    //Check for Key in BST,
    public void checksearch(Node node, int key){
        boolean exists = false;
        exists = ifNodeExists(node, key);
        if(exists == true){
            search(node, key);
        }
        else {
            System.out.println("*** " +key + " is not located within the BST ***"); }
    }

    // Search for key
    public Node search(Node node, int key)
    {
        // Base Cases: root is null or key is present at root
        if (node==null || node.key==key){
            System.out.print(node.key +" ");
            return node;
        }


        // value is greater than root's key
        if (node.key > key){
            System.out.print(node.key +" ");
            return search(node.left, key);
        }

        // value is less than root's key
        System.out.print(node.key + " ");
        return search(node.right, key);

    }

    //Check if Key exists within BST
    static boolean ifNodeExists( Node node, int k)
    {
        if (node == null)
            return false;

        if (node.key == k)
            return true;

        //then recur on left subtree
        if(node.left != null){
        boolean res1 = ifNodeExists(node.left, k);  return res1; }

        //recur on right subtree /
        if(node.right != null) {
            boolean res2 = ifNodeExists(node.right, k); return res2; }
        else{ return false; }
    }


    // Update rootNode/Parent
    void deleteKey(int key)
    {
        rootnode = deleteRec(rootnode, key);
    }

    //Insert a new key
    Node deleteRec(Node root, int key)
    {
        //If BST empty
        if (root == null)  return root;

        //Recur down tree
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);

        // if key is same as root then delete
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Call on Successor
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    //Get Min Value
    int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    //Get Max Value
    int maxValue(Node root)
    {
        int maxv = root.key;
        while (root.right != null)
        {
            maxv = root.right.key;
            root = root.right;
        }
        return maxv;
    }



    //Method to validate User integer inputs within a range
    private static int validate(int low, int high, String type){
        int choice = -65465654;
        Scanner input = new Scanner(System.in);
        do {
           // System.out.print(type + "(" + low + "-" + high + "):  ");
            while (!input.hasNextInt()) {
                System.out.println("Not valid, enter an appropriate value.  ");
                String tryagain = input.next();
            }
            choice = input.nextInt();
        } while (choice < low || choice > high);

        return choice;
    }

}