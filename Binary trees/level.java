import java.util.*;
public class level
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
        public static void levelorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                Node curr = q.remove();
                if(curr == null)                 
                {
                    System.out.println();
    
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(curr.data+ " ");
                    if(curr.left != null)
                    {
                        q.add(curr.left);
                    }
                    if(curr.right != null)
                    {
                        q.add(curr.right);
                    }
                }
            }
           
        }
    }
    public static void main(String args[])
    {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        tree.levelorder(root);
    }

}