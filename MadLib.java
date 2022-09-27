import java.io.*;
import java.util.*;
import java.time.*;


public class MadLib {
    public static void main(String... args) throws IOException {
        Scanner input = new Scanner(System.in);

        /**
         * User input replaces FULL CAPS WORDS
         */

        String[] madLib = {
            "It was a ADJ november day.",
            "I woke up to the ADJ smell of BIRD roasting in the ROOM downstairs.",
            "I VERB down the stairs to see if I could help VERB the dinner.",
            "My mom said, 'See if NAME needs a fresh NOUN.' ",
            "So I carried a tray of glasses full of NOUN into the VERB room.",
            "When I got there, I couldn't believe my NOUN!",
            "There were PLURALNOUN VERB on the NOUN!"
        };

        int lineCount = madLib.length;

        List<String> output = new ArrayList<>();

        System.out.println("Your name is: ");
        String name = input.nextLine();
        

        for(int i = 0;i <lineCount; i++) {
            String[] line = madLib[i].split(" ");
            for(int j = 0;j < line.length;j++) {
                if(line[j].equals(line[j].toUpperCase()) && line[j].length() > 1) {
                    System.out.println("Please enter a " + line[j]);
                    output.add(input.nextLine());
                }
            }

        }

        System.out.println("Name: " + name);
        System.out.println("Date: " + java.time.LocalDate.now());

        int flag = 0;

        for(int i = 0;i < lineCount;i++) {
            String[] lineOut = madLib[i].split(" ");
            for(int j = 0;j < lineOut.length;j++) {
                if(lineOut[j].equals(lineOut[j].toUpperCase()) && lineOut[j].length() > 1) {
                    lineOut[j] = output.get(flag);
                    flag++;
                }
            }
            for(int j = 0;j < lineOut.length;j++) {
                System.out.print(lineOut[j] + " ");
            }
            System.out.print("\n");
        }

        input.close();

    }

    public static void replaceAll(StringBuilder builder, String from, String to) {
        int index = builder.indexOf(from);
        while (index != -1) {
            builder.replace(index, index + from.length(), to);
            index += to.length(); // Move to the end of the replacement
            index = builder.indexOf(from, index);
        }
    }
}
