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

