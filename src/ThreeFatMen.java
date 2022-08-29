import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.io.*;

public class ThreeFatMen {

    public static void main(String[] args) throws Exception {
        int[] weight = {98, 106, 214};

//        try (FileReader reader = new FileReader("ThreeFatMen.txt")) {
//            int c;
//            while ((c = reader.read()) != -1) {
//                System.out.println((char) c);
//                reader.close();
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }


        Arrays.sort(weight);
        int maxWeight = weight[weight.length - 1];
        int minWeight = weight[0];

        if (minWeight < 94 || maxWeight > 727) {
            System.out.println("error");
        } else System.out.println("Максимальный вес: " + maxWeight);
    }
}
