package ProductDatabaseInFile;

import CompanyStatistics.Employee;

import java.io.*;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) throws IOException {
        String[] strings = new String[3];
        strings[0] = "nazwa1;producent1;cena1";
        strings[1] = "nazwa2;producent2;cena2";
        strings[2] = "nazwa3;producent3;cena3";

        String fileName = "testProductBoards.csv";
        try(
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter)
        ) {
            for (String stringsOne : strings) {
                writer.write(stringsOne + "\n");
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
                String[] split = eachLine.split(";");
                Product product = new Product(split[0], split[1], split[2]);
                Product[] products = new Product[3];
                products[0] = new Product(split[0], split[1], split[2]);
                products[1] = new Product(split[0], split[1], split[2]);
                products[2] = new Product(split[0], split[1], split[2]);
                System.out.println(Arrays.toString(products));
            }
            System.out.println(stringBuffer.toString());
        }

    }
}
