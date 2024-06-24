public class Exercise {
    public static void main(String[] args) {
        int year = 1900;
        boolean result = Exercise.isLeapYear(year);
        System.out.println(result);

    }

    static boolean isLeapYear(int year) {

        if(year%4 == 0 && year%100 != 0 || year%400 == 0){
            return true;
        }
        return false;
    }
}
