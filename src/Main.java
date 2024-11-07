public class Main {
    public static void main(String[] args) {

        int year = 2008;

        // ver vxvdebi davalebas radgan instruqciis mixedvit ar gamodis martla nakiani wlis gamomtvleli
        
            if((year%4) == 0){
                if(year < 100){
                    System.out.println("nakiania");
                }
                if ((year%400) == 0){
                    System.out.println("nakiania");
                }else{
                    System.out.println("ar aris nakiani");
                }
            }else{
                System.out.println("ar aris nakiani");
            }
        }
    }
