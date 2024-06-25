public class reverse
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
    public void addl(int data)
    {
        Node nn=new Node(data);
        if(head==null)
        {
            head = tail = nn;
            return;
        }
        tail.next = nn;
        tail = nn;
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
    public void rev() //  TC = O(n)
    {
        Node prev = null;
        Node curr = tail =  head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void del_nth_node_end(int n)
    {
        int sz=0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next; // removeFirst
            sz++;
        }
        if(n == sz)
        {
            head = head.next;
            return;
        }
        //sz-n
        int i=1;
        int tofind = sz-1;
        Node prev = head;
        while(i < tofind)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    
    public static void main(String args[])
    {
        reverse l1=new reverse();
        l1.addf(1);
        l1.addf(2);

       // l1.print();

        l1.addl(3);
        l1.addl(4);
        System.out.println("before deleting");
        l1.print();
        System.out.println("After deleting");
        l1.del_nth_node_end(3);
        l1.print();
    }
}