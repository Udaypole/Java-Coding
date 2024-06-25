public class palind
{
    public static class Node
    {
        int data;
        Node next;
        
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    
    public void addf(int data)
    {
        Node nn=new Node(data);
        if(head==null)
        {
            head = tail = nn;
            return;
        }
        nn.next=head;
        head = nn;
    }
    
    public void print()
    {
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
   
    public Node findMid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while (fast !=null && fast.next !=null)
        {
            slow =slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean palin()
    {
        if(head ==null || head.next == null)
        {
            return true;
        }
        Node mid = findMid(head);


        Node curr = mid;
        Node prev = null;
        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right !=null)
        {
            if(left.data!= right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[])
    {
        palind l1=new palind();
        l1.addf(1);
        l1.addf(2);
        l1.addf(3);
        l1.addf(1);
        l1.print();
        System.out.println(l1.palin());
    }
}