 class Demo
{
    int chn;
    int v;
    boolean on;
    void turnon()
    {
        System.out.println("tv is on");
    }
     void turnoff()
    {
        System.out.println("tv is off");
    }
    void setch( int c)
    {
        if(c>0 && c<=40)
            chn=c;
        else
            System.out.println("enter right input");
    }
    void setvol(int vol)
    {
        v=vol;
    }
    void chnup()
    {
        chn=chn+1;
    }
    void chndown()
    {
        chn=chn-1;
    }
     void volup()
    {
       v= v+1;
    }
    void voldown()
    {
        v=v-1;
    }
}
class Tv
{
    public static void main(String[] args) 
    {
        Demo d=new Demo();
        d.setch(20);
        d.voldown();
    }
}