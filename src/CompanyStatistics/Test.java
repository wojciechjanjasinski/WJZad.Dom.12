package CompanyStatistics;

import java.io.*;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Test {
    public static void main(String[] args) throws IOException {
        String fileName = "InputData.txt";
        Employee[] employees = new Employee[1];
        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader)

        ) {

            for (String eachLine = reader.readLine(); eachLine != null; eachLine = reader.readLine()) {
                String[] split = eachLine.split(";");
                double b = Double.parseDouble(split[2]);
                double c = Double.parseDouble(split[4]);
                employees[0] = new Employee(split[0], split[1], b, split[3], c);
                System.out.println(Arrays.toString(employees));
                double something = 0;
                double sum = DoubleStream.of(c).sum();
                something = something + sum;
                System.out.println(something);
            }
        }


    }
}
