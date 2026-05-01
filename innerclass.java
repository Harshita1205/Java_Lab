class Outer{
    int n = 10;
    class Inner{
        void display(){
            System.out.println("number from outer class is " + n);
        }
    }
    public static void main(String[] args){
        Outer obj = new Outer();
        Outer.Inner innerObj = obj.new Inner();
        innerObj.display();
    }
}