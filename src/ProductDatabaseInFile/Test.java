package ProductDatabaseInFile;

import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        Product[] productsTest = new Product[3];
        productsTest[0] = new Product("FX-Marble", "Lożitej", 159.99);
        productsTest[1] = new Product("OZA-Trackball", "Elegom", 135.49);
        productsTest[2] = new Product("Alant", "Genzington", 175.78);
        
        
        String fileName = "testProductBoards.csv";
        try(
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter)
        ) {
            for (Product product : productsTest) {
                writer.write(product + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (
        var fileReader = new FileReader(fileName);
        var reader = new BufferedReader(fileReader)

        ){

            StringBuilder stringBuffer = new StringBuilder();
            String eachLine =reader.readLine();
            while (eachLine != null){
                stringBuffer.append(eachLine);
                stringBuffer.append("\n");
                eachLine = reader.readLine();
            }
            System.out.println(stringBuffer.toString());
        }

    }
}
