import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2part2 {
    public static void main(String[] args) throws FileNotFoundException {
        int horizontal = 0;
        int depth = 0;
        int aim = 0;

        Scanner input = new Scanner(new File("./src/input2.txt"));

        while(input.hasNextLine()) {
            String take = input.nextLine();
            String[] splitter = take.split(" ");
            String command = splitter[0];
            int value = Integer.parseInt(splitter[1]);
            switch (command) {
                case "forward":
                    horizontal += value;
                    depth = depth + (value * aim);
                    break;
                case "down":
                    aim += value;
                    break;
                case "up":
                    aim -= value;
                    break;
            }
        }
        System.out.println("Horizontal: " + horizontal + " Depth: " + depth + " multiplied: " + horizontal*depth);
    }
}
