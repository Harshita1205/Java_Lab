class Override{
    void show(){
        System.out.println("Super Class");
    }
}

class Child extends Override{
        
    void show(){
        System.out.println("Child Class");
    }
}
class overrideDemo{
    public static void main(String [] args){
        Override a = new Override();
        a.show();
        Child b = new Child();
        b.show();
    }
}