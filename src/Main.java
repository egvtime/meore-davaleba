public class Main {
    public static void main(String[] args) {

        int time = 3762; //second

            int hour;
            int minute;
            int second;

            hour = time/3600;
            minute = (time%3600)/60;
            second = (time%60);

        System.out.println(hour + ":" + minute + ":" + second );
    }}
