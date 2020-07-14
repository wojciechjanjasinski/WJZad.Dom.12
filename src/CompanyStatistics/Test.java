package CompanyStatistics;

import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        String fileName = "InputData.txt";
        String[] employeesString = new String[1];
        System.out.println(Arrays.toString(employeesString));
        Employee[] employees = Arrays.copyOf(employeesString, employeesString.length, Employee[].class);
        System.out.println(Arrays.toString(employees));
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
                for (String s : employeesString) {
                    s = eachLine;
                    System.out.println(s);
                    Arrays.fill(employeesString, s);
                }
            }
        }
    }
}
