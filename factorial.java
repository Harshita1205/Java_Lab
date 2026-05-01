class Factorial{
    int fact(int num){
        int fact = 1;
        for(int i = 1; i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        int n = 5;
        Factorial obj = new Factorial();
        System.out.println("Factorial:" + obj.fact(n));
    }
}