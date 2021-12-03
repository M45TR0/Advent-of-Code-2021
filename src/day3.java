import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day3 {
    public static void main(String[] args) throws FileNotFoundException {
        int zero;
        int one;

        Scanner input = new Scanner(new File("./src/input3.txt"));
        String length = input.nextLine();
        int[] gamma = new int[length.length()];
        int epsilon = 0;
        for (int i = 0; i < length.length(); i++){
            zero = 0;
            one = 0;

            Scanner loop = new Scanner(new File("./src/input3.txt"));
            while(loop.hasNextLine()) {
                String take = loop.nextLine();
                String[] splitter = take.split("");
                int value = Integer.parseInt(splitter[i]);
                if (value == 0) {
                    zero++;
                 } else {
                    one++;
                 }

                if (zero > one) {
                    gamma[i] = 0;
                }
                else if ( one > zero) {
                    gamma[i] = 1;
                }
            }


        }

        long res=0;
        for (int i : gamma) {
            res = (res * 10) + i;
        }
        System.out.println(res);

        long decimalnumber = 0;
        long decimalnumberreverse = 0;
        long power = 0;
        while(true)
        {
            if (res == 0)
            {
                break;
            }
            else
            {
                long temp = res%10;
                long temp2 = 0;
                if (temp == 0){
                    temp2 =1;
                }
                else if (temp == 1){
                    temp2 = 0;
                }
                decimalnumber += temp*Math.pow(2, power);
                decimalnumberreverse += temp2*Math.pow(2, power);
                res = res/10;
                power++;
            }
        }

        System.out.println(decimalnumber * decimalnumberreverse);
    }
}
