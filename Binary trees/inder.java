import java.util.*;
public class inder
{
     static  class Node
    {
        int data;
        Node left;
        Node right;
        Node (int data)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    static class BinaryTree
    {
        static int idx = -1;
        public static Node buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx]== -1)
            {
                return null;
            }
            Node nn = new Node(nodes[idx]);
            nn.left = buildtree(nodes);
            nn.right = buildtree(nodes);

            return nn;
        }
        public static void postorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            postorder(root.left);
            System.out.print(root.data + " ");
            postorder(root.right);
           
        }
    }
    public static void main(String args[])
    {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        tree.postorder(root);
    }

}