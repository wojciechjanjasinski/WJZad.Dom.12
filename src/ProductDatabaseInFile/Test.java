package ProductDatabaseInFile;

import java.io.*;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) throws IOException {
        Product[] productsOne = new Product[3];
        productsOne[0] = new Product("Marfel-GJ;", "Lożitej;", 169.99);
        productsOne[1] = new Product("Small;", "Elegom;", 199.99);
        productsOne[2] = new Product("Matrel;", "Kenżyngton;", 220.99);

        String fileName = "testProductBoards.csv";
        try(
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter)
        ) {
            for (Product product : productsOne) {
                writer.write(product.getName());
                writer.write(" ");
                writer.write(product.getProducer());
                writer.write(" ");
                writer.write(String.valueOf(product.getPrice()));
                writer.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (
        var fileReader = new FileReader(fileName);
        var reader = new BufferedReader(fileReader)

        ){

            StringBuilder stringBuffer = new StringBuilder();
            for (String eachLine = reader.readLine(); eachLine!= null; eachLine = reader.readLine()){
                stringBuffer.append(eachLine);
                stringBuffer.append("\n");
                eachLine = reader.readLine();
                String[] split = eachLine.split(";");
                double a =Double.parseDouble(split[2]);
                Product[] products = new Product[3];
                products[0] = new Product(split[0], split[1], a);
                products[1] = new Product(split[0], split[1], a);
                products[2] = new Product(split[0], split[1], a);
                System.out.println(Arrays.toString(products));
            }
            System.out.println(stringBuffer.toString());
        }

    }
}
