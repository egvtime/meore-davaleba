public class Main {
    public static void main(String[] args) {

        float third = 1.5F;
        int damgrvaleba;

        if((third%1) < 0.5){
            damgrvaleba =(int) third;
        }else{
            damgrvaleba = ((int) third)+1;
        }
        System.out.println("damgrvaleba: " + damgrvaleba);
    }}
