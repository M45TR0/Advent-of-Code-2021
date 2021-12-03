import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1{

    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        Scanner input = new Scanner(new File("./src/input.txt"));
        int comp1 = Integer.parseInt(input.nextLine());
        while(input.hasNextLine()){
            int comp2 = Integer.parseInt(input.nextLine());
            if (comp1 < comp2) {
                count++;
            }
            comp1 = comp2;
        }
        System.out.println(count);
    }
}

