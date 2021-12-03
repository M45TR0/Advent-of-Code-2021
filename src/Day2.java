import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2{

    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        Scanner input = new Scanner(new File("./src/input.txt"));
        int comp1 = Integer.parseInt(input.nextLine());
        int comp2 = Integer.parseInt(input.nextLine());
        int comp3 = Integer.parseInt(input.nextLine());
        while(input.hasNextLine()){
            int comp4 = Integer.parseInt(input.nextLine());
            int calc = comp1 + comp2 + comp3;
            int calc2 = comp2 + comp3 + comp4;
            if (calc2 > calc){
                count++;
            }
            comp1 = comp2;
            comp2 = comp3;
            comp3 = comp4;
        }
        System.out.println(count);

    }
}

