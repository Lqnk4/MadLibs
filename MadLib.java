import java.io.*;
import java.util.Scanner;


public class MadLib {
    public static void main(String... args) throws IOException {
        File _madLibs = new File("MadLib.txt");
        Scanner input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader(_madLibs));


        for(int i = 0;i <7; i++) {


        }

        StringBuilder output = new StringBuilder();


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
