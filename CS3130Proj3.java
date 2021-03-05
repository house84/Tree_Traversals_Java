import java.util.Scanner;

public class CS3130Proj3 {

    public static <BinaryTreeViewer> void main(String[] args) {

        //Continue to Run Program
        int runprogram = 1;
        //Create BST with Given data
        BinarytreeInsert BST = new BinarytreeInsert();
        //Run Tree-Insert
        BST.run();

        while(runprogram == 1) {

            System.out.println("\n============================== Binary Search Tree Menu ==============================");
            System.out.println("        *** Choose the operation you would like to be performed. ***");
            System.out.println("1)  Display traversals of Binary Search Tree. (In-order, Post-Order and Pre-Order)");
            System.out.println("2)  Show the Height of the Binary Search Tree.");
            System.out.println("3)  Show result and sequence of Tree-Search (Call Key 38 and 9)");
            System.out.println("4)  Delete key 10 then Display (In-Order, Post-Order and Pre-Order)");
            System.out.println("5)  Insert new Keys to BST");
            System.out.println("6)  Reset to Original BST");
            System.out.println("7)  Delete Key of choice");
            System.out.println("8)  Exit Program");
            System.out.println("===============================================================================");
            System.out.print("===> Please choose ");
            int choice = validate(1, 8, "option");
            System.out.println();

            //End Program
            if (choice == 8) {
                System.out.println("Exiting Program...");
                runprogram = 0;
            }

            //Output User Choices
            switch (choice) {
                case 1: System.out.print("In-Order Traversal: ");
                        BST.printInorder(BST.getNode());
                        System.out.print("\nPost-Order Traversal: ");
                        BST.printPostorder(BST.getNode());
                        System.out.print("\nPre-Order Traversal: ");
                        BST.printPreorder(BST.getNode());
                        System.out.println();
                        break;
                case 2: System.out.println("Height of the Binary Search Tree is "
                        + BST.treeHeight(BST.getNode()));
                        break;
                case 3: System.out.print("Tree Search for the key 38 has the " +
                        "following sequence: ");
                        BST.checksearch(BST.getNode(), 38);
                        System.out.print("\nTree Search for the key 9 has the " +
                                "following sequence: ");
                        BST.checksearch(BST.getNode(), 9);
                        break;
                case 4: System.out.print("\nDeleting node with the key value of 10");
                        BST.deleteRec(BST.rootnode, 10);
                        System.out.print("\nIn-Order Traversal: ");
                        BST.printInorder(BST.getNode());
                        System.out.print("\nPost-Order Traversal: ");
                        BST.printPostorder(BST.getNode());
                        System.out.print("\nPre-Order Traversal: ");
                        BST.printPreorder(BST.getNode());
                        System.out.println();
                        break;
                case 5: BST.insertNode();
                        System.out.print("\nIn-Order Traversal: ");
                        BST.printInorder(BST.getNode());
                        break;
                case 6: System.out.print("\nResetting BST to original value");
                        BST.run();
                        BST.Treeinsert(BST.getNode(), 30);
                        System.out.print("\nIn-Order Traversal: ");
                        BST.printInorder(BST.getNode());
                        break;
                case 7: System.out.print("\nKeys currently within BST: ");
                        BST.printInorder(BST.getNode());
                        System.out.print("\nEnter the key value to be deleted ");
                        int key = validate(BST.minValue(BST.rootnode), BST.maxValue(BST.rootnode), "key");
                        BST.deleteRec(BST.rootnode, key);
                        System.out.print("\nIn-Order Traversal: ");
                        BST.printInorder(BST.getNode());
                        break;
            }

        }


    }



    //Method to validate User integer inputs within a range
    private static int validate(int low, int high, String type){
        int choice = -654654;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print(type + "(" + low + "-" + high + "):  ");
            while (!input.hasNextInt()) {
                System.out.println("not valid, enter an appropriate value.  ");
                String tryagain = input.next();
            }
            choice = input.nextInt();
        } while (choice < low || choice > high);

        return choice;
    }

}