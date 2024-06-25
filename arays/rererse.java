public class rererse {
 /**
 * 
 */
public static void  rev(numbs[])
 {
    int fst=0;
    int lst=n.length-1;

    while(fst<lst)
    {
        for(int i=0;i<n.length;i++)
         {
            int t = n[lst];
            n[lst]=n[fst];
            n[fst]=t;
            fst++;
            lst--;
         }
    }  

}
public static void main(String[] args) {
    int n[]={2,5,7,4,9};
    rev(n);
    for(int i=0;i<n.length;i++)
    {
        System.out.println(n[i]+" ");
    }
    System.out.println();
}
    
}
