class LeapYear {
    int year;

    void checkLeap(){
        if((year%4 == 0 && year % 100 != 0) || year%400 == 0)
            System.out.println("Leap year");
        else
            System.out.println("Not Leap year");
    }
    public static void main(String[] args) {
        LeapYear obj = new LeapYear();
        obj.year = 2019;
        obj.checkLeap();
    }
}
