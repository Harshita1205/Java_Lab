class PrintName{
    String name;
    void display(){
        System.out.println("My name is" +name);
}
public static void main(String[] args){
    PrintName obj=new PrintName();
    obj.name="Mahul Dutta";
    obj.display();
}
}