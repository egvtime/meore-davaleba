public class Main {
    public static void main(String[] args) {

        // mtliani bolo davaleba ert kodshi chavsvi:
        // average aris sashualos gageba,
        //parity aris kent-luwobis gageba,
        // comparing aris shedareba
        //addition aris damateba 4nishniaze metebis,
        //triangle aris samkutxeti tu sheidzleba gaxdes magis gageba
        String task ="triangle";


        double x = 90;
        double y = 45;
        double z = 45;
        double k = 5413;

        double answer = 0;

        if (task == "average"){
            answer = (x+y+z)/3;
            System.out.println(answer);
        }

        if (task == "parity") {
            if (x%2 >0) {
                System.out.println("kenti");
            } else {
                System.out.println("kenti");
            }
        }

        if (task == "comparing") {
            if (x > y) {
                System.out.println("x aris meti");
            } else{
                if (x < y) {
                    System.out.println("y aris meti");
                } else {
                    System.out.println("tolia");
                }
            }}

            if (task == "addition") {
                if (x<1000){x=0;}
                if (y<1000){y=0;}
                if (z<1000){z=0;}
                if (k<1000){k=0;}

                System.out.println(x+y+z+k);
            }


            if (task == "triangle") {
                if ((x+y+z) == 180) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
        }
