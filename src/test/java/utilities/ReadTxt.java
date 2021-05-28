package utilities;

import pojos.Customers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {


    public static List<Customers> returnCustomers(String filePath) {

        List<Customers> all = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while(line != null) {
                Customers customers = new Customers();
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                String[] each = line.split(",");
                customers.setFirstName(each[0]);
                customers.setLastName(each[1]);
                customers.setSsn(each[2]);
                all.add(customers);
            }

            String everything = sb.toString();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return all;
    }


    public static List<Customers> readTxtData(String filePath)throws  Exception{
        List<Customers> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            Customers customers = new Customers();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                customers.setSsn(line);
            }
            String everything = sb.toString();
            customers.setSsn(everything);
            list.add(customers);
        } finally {
            br.close();
        }
        return list;
    }


}
