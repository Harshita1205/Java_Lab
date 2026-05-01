class CheckNumber {
    int num; 

    CheckNumber(int n) {
        num = n;
    }

    void check() {
        if (num > 0)
            System.out.println("Number is positive");
        else if (num < 0)
            System.out.println("Number is Negative");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        CheckNumber obj = new CheckNumber(0);
        obj.check();
    }
}
