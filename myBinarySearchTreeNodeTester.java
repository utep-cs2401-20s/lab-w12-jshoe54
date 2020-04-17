import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class myBinarySearchTreeNodeTester {
   @Test
    public void testTree1() {
        // create tree here, root = new myBinarySearchTreeNode(arr = {7,2,9})
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(new int[]{7, 2, 9});
        root.print();
        assertEquals(3, root.size());
        assertEquals(1, root.depth(2));
        assertEquals(2, root.depth(9));
        assertEquals(3, root.height());
    }
    @Test
    public void testTree2() {
        
        // create tree here, root = new myBinarySearchTreeNode(arr = {7, 2, 5, 8, 1, 3})
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(new int[]{7, 2, 5, 8, 1, 3});
        root.print();
        assertEquals(6, root.size());
        assertEquals(3, root.depth(3));
        assertEquals(2, root.depth(5));
        assertEquals(4, root.height());
    }
    @Test
    public void testTree3() {
        // create tree here, root = new myBinarySearchTreeNode(arr = {25, 0, 20, 5, 15, 10})
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(new int[]{25, 0, 20, 5, 15, 10});
        root.print();
        assertEquals(6, root.size());
        assertEquals(5, root.depth(10));
        assertEquals(4, root.depth(15));
        assertEquals(6, root.height());
    }
    @Test
    public void testTree4() {
        // create tree here, root = new myBinarySearchTreeNode(arr = {10, 5, 12, 15, 3, 7, 6, 11})
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(new int[]{10, 5, 12, 15, 3, 7, 6, 11});
        root.print();
        assertEquals(8, root.size());
        assertEquals(3, root.depth(6));
        assertEquals(2, root.depth(7));
        assertEquals(3, root.height());
    }
    @Test
    public void testTree5() {
        // create tree here, root = new myBinarySearchTreeNode(arr = {30, 56, 10, 0, 89, 20, 14})
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(new int[]{30, 56, 10, 0, 89, 20, 14});
        root.print();
        assertEquals(7, root.size());
        assertEquals(3, root.depth(14));
        assertEquals(2, root.depth(20));
        assertEquals(4, root.height());
    }
}
