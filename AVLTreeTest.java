public class AVLTreeTest {
    private static int arr[] = { 3, 2, 1, 4, 5, 6, 7, 16, 15, 14, 13, 12, 11, 10, 8, 9 };

    /**
     * @param args
     */
    public static void main(String[] args) {
        int i;
        int j;
        AVLTree<Integer> tree = new AVLTree<Integer>();

        System.out.printf("== Add in sequence: ");
        for (i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
            tree.insert(arr[i]);
        }

        System.out.printf("\n== PreOrder Traversal: ");
        tree.preOrder();

        System.out.printf("\n== InOrder Traversal: ");
        tree.inOrder();

        System.out.printf("\n== PostOrder Traversal: ");
        tree.postOrder();
        System.out.printf("\n");

        System.out.printf("== height: %d\n", tree.height());
        System.out.printf("== Min: %d\n", tree.minimum());
        System.out.printf("== Max: %d\n", tree.maximum());
        System.out.printf("== Details of the tree: \n");
        tree.print();

        i = 8;
        System.out.printf("\n== Delete the root node: %d", i);
        tree.remove(i);

        System.out.printf("\n== height: %d", tree.height());
        System.out.printf("\n== InOrder Traversal: ");
        tree.inOrder();
        System.out.printf("\n== Details of the tree: \n");
        tree.print();

        j = 18;
        System.out.printf("\n== Insert the element: %d", j);
        tree.insert(j);

        System.out.printf("\n== PreOrder Traversal: ");
        tree.preOrder();

        // Destory tree
        tree.destroy();
    }
}

/*
== Add in sequence: 3 2 1 4 5 6 7 16 15 14 13 12 11 10 8 9 
== PreOrder Traversal: 7 4 2 1 3 6 5 13 11 9 8 10 12 15 14 16 
== InOrder Traversal: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
== PostOrder Traversal: 1 3 2 5 6 4 8 10 9 12 11 14 16 15 13 7 
== height: 5
== Min: 1
== Max: 16
== Details of the tree: 
 7 is root
 4 is  7's   left child
 2 is  4's   left child
 1 is  2's   left child
 3 is  2's  right child
 6 is  4's  right child
 5 is  6's   left child
13 is  7's  right child
11 is 13's   left child
 9 is 11's   left child
 8 is  9's   left child
10 is  9's  right child
12 is 11's  right child
15 is 13's  right child
14 is 15's   left child
16 is 15's  right child

== Delete the root node: 8
== height: 5
== InOrder Traversal: 1 2 3 4 5 6 7 9 10 11 12 13 14 15 16 
== Details of the tree: 
 7 is root
 4 is  7's   left child
 2 is  4's   left child
 1 is  2's   left child
 3 is  2's  right child
 6 is  4's  right child
 5 is  6's   left child
13 is  7's  right child
11 is 13's   left child
 9 is 11's   left child
10 is  9's  right child
12 is 11's  right child
15 is 13's  right child
14 is 15's   left child
16 is 15's  right child

== Insert the element: 18
== PreOrder Traversal: 7 4 2 1 3 6 5 13 11 9 10 12 15 14 16 18 
Process finished with exit code 0
*/

