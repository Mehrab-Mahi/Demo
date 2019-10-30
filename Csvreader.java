
package csvreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Csvreader {

    
    public static void main(String[] args) {
        
        String csvFile = "D:\\New folder/country.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println(country[0] + " " + country[1] + " " +country[2] + " " +country[3] + " " + country[4] + " "+ country[5]  );

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }
    
}
