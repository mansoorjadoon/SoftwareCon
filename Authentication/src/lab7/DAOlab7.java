/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author test
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class DAOlab7 {
    
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    String csvFile = "/Users/test/desktop/SC labs/lab7.csv";
        String line = "";
        String cvsSplitBy = ",";
        
        void authenticate(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            br.readLine();
            br.readLine();
            //int count=1;
            while ((line = br.readLine()) != null) {
                Session session = factory.openSession();
                //creating transaction object  

                // use comma as separator
                String[] usr = line.split(cvsSplitBy);

                //System.out.println(line);
                Transaction t = session.beginTransaction();
                auth c1 = new auth();
                
                c1.setUserid(usr[0]); // setting the value of id
                c1.setSchema(String.valueOf(usr[2])); // setting the value of Latitude
                //c1.setLon(Double.valueOf(usr[6])); // setting the value of Longitude
                //c1.setCountry(usr[1]); // Srtting the value of Country code
                session.persist(c1);//persisting the object  
                t.commit();//transaction is commited  

                session.close();  // Closing the session after 
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

        }
        
}

