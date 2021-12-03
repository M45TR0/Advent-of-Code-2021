import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) throws FileNotFoundException {
        int horizontal = 0;
        int depth = 0;

        Scanner input = new Scanner(new File("./src/input2.txt"));

        while(input.hasNextLine()) {
            String take = input.nextLine();
            String[] splitter = take.split(" ");
            String command = splitter[0];
            int value = Integer.parseInt(splitter[1]);
            switch (command) {
                case "forward":
                    horizontal += value;
                    break;
                case "down":
                    depth += value;
                    break;
                case "up":
                    depth -= value;
                    break;
            }
        }
        System.out.println("Horizontal: " + horizontal + " Depth: " + depth + " multiplied: " + horizontal*depth);
    }
}
