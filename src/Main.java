public class Main {
    public static void main(String[] args) {

        // 0 gaxadet is romelic gindat gamotvalot

        double F = 1;
        double C = 0;

        if (C==0 & F ==0){
            System.out.println("0.0C=32F and 0.0F=-17.(7)");
        }
        if (C!=0 & F!=0) {
            System.out.println("this equation is disabled");
        }

        if (F == 0 & C != 0){
            F=(C*1.8)+32;
            System.out.println(C + "C=" + F);
        }
        if (C == 0 & F != 0){
            C=(F-32)/1.8;
            System.out.println(F + "F=" + C);
        }
    }}
