package CompanyStatistics;

import ProductDatabaseInFile.Product;

import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        String fileName = "InputData.txt";

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader)

        ){

            for (String eachLine = reader.readLine(); eachLine!= null; eachLine = reader.readLine()){
                String[] split = eachLine.split(";");
                double b = Double.parseDouble(split[3]);
                double c = Double.parseDouble(split[5]);
                Employee[] employees = new Employee[1];
                employees[0] = new Employee(split[1], split[2], b, split[4], c);
                System.out.println(Arrays.toString(employees));

                //String split 5
                //double a =Double.parseDouble(split[2]);
//                Product[] products = new Product[1];
//                products[0] = new Product(split[0], split[1], a);
//                System.out.println(Arrays.toString(products));

            }

        }
    }
}
