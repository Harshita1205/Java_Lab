class Oddeven{
    int num;
    void check(){
        if(num%2==0)
            System.out.println("even!");
        else
            System.out.println("odd!");
    }
    public static void main(String[] args)
    {
        Oddeven obj=new Oddeven();
        obj.num=12;
        obj.check();
    }
}