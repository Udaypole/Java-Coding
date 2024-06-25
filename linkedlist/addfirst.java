public class addfirst
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
    public void addindex(int index,int data)
    {
        if(index==0)
        {
            addf(data);
            return;
        }
        Node nn= new Node(data);
        Node temp = head;
        int i = 0;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        nn.next = temp.next;
        temp.next = nn;
    }
    public int removefirst()
    {
        int val=head.data;
        head=head.next;
        return val;
    }
    public int search(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1)
        {
            return -1;
        }
        return idx+1;
    }

    public int rec_search (int key)
    {
        return helper(head,key);
    }

    public static void main(String args[])
    {
        addfirst l1=new addfirst();
        l1.addf(1);
        l1.addf(2);

       // l1.print();

        l1.addl(3);
        l1.addl(4);
        l1.addindex(2,9);
        l1.print();
        l1.removefirst();
        l1.print();
        System.out.println(l1.rec_search(3));
        System.out.println(l1.rec_search(10));
    }
}