class Max{
    int a,b,c;
    max(int x, int y, int z){
        a=x;
        b=y;
        c=z;
    }
    void checkmax(){
        if(a>b && a>c)
        System.out.println("Maximum is:" +a);
    else if(b>c)
        System.out.println("Maximum is:" +b);
    else
        System.out.println("Maximum is:" +c);
 }
 public static void main(String[] args)
{
    Max.obj=new Max(20,30,40);
    obj.checkmax();
}
}