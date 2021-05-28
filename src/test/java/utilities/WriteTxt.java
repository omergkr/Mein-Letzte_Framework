package utilities;

import pojos.Customers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTxt {


    public static void saveDataInFile(String fileName, Customers customers) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            writer.append("\n"+customers.getFirstName() + " , " + customers.getLastName() + " , " + customers.getSsn());

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void saveDataInFile(String fileName, Customers[] customers)
    {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0;i<customers.length;i++)
                writer.append(customers[i].getSsn()+",\n");
            writer.close();
        } catch(Exception e){
        }
    }
}
