Lab 7: Data Analysis with Hibernate
Mansoor Ali
BESE 5B
32676

Introduction: 
In this lab, I solved a real world problem, where by data collected with 3 novel graphical password authentication schemes (CHC and its variants, CO-CHC and Rogue CHC) will be used to build a simple data storage and analysis application in Java.
Description:
Graphical password schemes are unconventional types of passwords in which a user’s password is in the form of images or some points on an image. They are in use around us in the form of the picture password in Windows and the pattern recognition password in Android. A graphical password scheme named Convex Hull Click password is a potential graphical password under research. 
The following three graphical password schemes were recently used for a usability study: 
1) Convex Hull Click Graphical Password Scheme (CHC) 2) Centroid-Oriented Convex Hull Click Graphical Password Scheme (CO-CHC) 3) Rogue Convex Hull Click Graphical Password Scheme (Rogue CHC) 
In this study, a user had to complete 5 successful logins of the scheme, called rounds. Each round is represented by a row in the CSV File.  Each round consists of 5 challenges or rounds in which the password had to be entered correctly, with at most 2 wrong tries. On 3rd wrong try the user would not be authenticated in that particular round and the state would be set as False
Techniques used: 
Hibernate
 Data Analysis 
 HQL and HCQL  
Parsing CSV files

Approach:
 Using the jdbc driver and database I imported all the data from CSV and uploaded them to database.
After the data is uploaded to db,I have read the data from db and authenticated the user based on the tests and attempts made by the user.
The user is authenticated once all the challenges return true values.
How to run:
To run the project you need a IDE such as Netbeans. 
The project has been developed in Netbeans hence contains the netbeans configuration files.
To run the database a SQL server is needed.
The database is running on localhost on port 3306.

