# Library Management System

Library management system is a project which aims in developing a computerized 
system to maintain all the daily work of library .This project has many features 
which are generally not available in normal library management systems like 
facility of admin login through which the admin can monitor the whole system 
.The librarian after logging into his account can generate various option such as 
new student, new book, issue book, return book details .
Overall this project of mine is being developed to help staff of library to maintain 
the library in the best way possible and also reduce the human efforts…
# Objectives 
The aim of this project is to develop a system that can handle & manage the activities involved in a library in an efficient and reliable way. Less managing personnel and easy searching availability and user profile managing are major goals in this project..
1.	Develop a system that can replace the manual library managing system.
2.	Develop a database which stores user details and book details .
3.	Give reliable search facility should have logins.
4.	Administrator or librarian should have logins.
5.	Create an easy to understand user friendly environment .
6.	Attractive user interfaces to navigate through the system for the users.
7.	Develop the system documentation with detailed UML specifications…

# Requirement Collection & Analysis : 
## Software Configuration :

This software package is developed using java as front and which is supported by sun micro system .
Operating system : Windows 11 .
Language : Java Runtime Environment , NetBeans 8.2 .
Database : Localhost .
## Hardware Configuration: 
Processor : intel core -5.
Hard Dick : 128 SSD.
RAM: 8 GB or more .
# Main Function
```java
import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class connection_project {
    
    
    
    private static String servername ="localhost";
    private static String username ="root";
    private static String dbname ="library_management_system";
    private static Integer portNumber = 3306;
     private static String password ="";
     
     
     public static Connection getConnection()
     {
         
         Connection connection = null;
         
        MysqlDataSource   datasource  = new     MysqlDataSource ();
         
         datasource.setServerName(servername);
         datasource.setUser(username);
         datasource.setDatabaseName(dbname);
         datasource.setPortNumber(portNumber);
         datasource.setPassword(password);
         
        try {
            connection = datasource.getConnection();
             connection= DriverManager.getConnection("jdbc:mysql://localhost/library_management_system","root","");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(connection_project.class.getName()).log(Level.SEVERE, null, ex);
        }
         return connection ;
         
     }
}


```
# Context Diagram
![context](https://github.com/ibrahim-patwary/java_project/assets/144773009/48bb6a11-5b85-4e01-8a0e-591f9b7f06b7)
# Project Preview
## Splash Screen
![loading_screen](https://github.com/ibrahim-patwary/java_project/assets/144773009/38e9cb41-8c64-4162-8968-8c62c63d17bd)
## Log In Screen
![log_in](https://github.com/ibrahim-patwary/java_project/assets/144773009/f311fc36-11ef-46ea-97eb-42ca3ebb473d)
## Sing Up Screen
![sign_up](https://github.com/ibrahim-patwary/java_project/assets/144773009/8cdf7fa2-f442-467a-bfb7-6928ebb6639f)
## Forget Password Screen
![forget](https://github.com/ibrahim-patwary/java_project/assets/144773009/f09b3d2e-612e-411a-9593-c82fac964331)
## Dash Board Screen
![dash_board](https://github.com/ibrahim-patwary/java_project/assets/144773009/bceefd97-16e5-44eb-83c3-9efcc01af3e6)
## Add Members Screen
![add member](https://github.com/ibrahim-patwary/java_project/assets/144773009/90453e4e-fc61-4387-bdcc-6ca7625fb533)
## Members List Screen
![member_list](https://github.com/ibrahim-patwary/java_project/assets/144773009/a9bdf5f6-eb91-4d79-83a6-f469c3b24284)
## Update Members Details Screen
![edit_member](https://github.com/ibrahim-patwary/java_project/assets/144773009/3c282745-f468-4008-afb6-260ef2d01c91)
## Add Books Screen
![add_book](https://github.com/ibrahim-patwary/java_project/assets/144773009/f88b9c93-6b84-4ba3-a74b-e0013184a32e)
## Books List Screen
![book_list](https://github.com/ibrahim-patwary/java_project/assets/144773009/d4998369-cd17-4e69-ae56-a847b5e2c55b)
## Update Books Details Screen
![edit_book_list](https://github.com/ibrahim-patwary/java_project/assets/144773009/fcafb881-2ff4-4ba3-ad32-80307ce5d198)
## Issue Books Screen
![issue_book](https://github.com/ibrahim-patwary/java_project/assets/144773009/2dc083d6-ef7a-4af4-bd07-f98d9e41a8a6)
## Return Books Screen
![return_book](https://github.com/ibrahim-patwary/java_project/assets/144773009/386bf4b1-d8ab-44c7-bf5e-c405676a5313)
## About Me Screen
![about](https://github.com/ibrahim-patwary/java_project/assets/144773009/0b0b7ee6-4cc8-4fdc-9903-5a23b16e38c1)

# Documentation
The Project Documentation is [here](https://rb.gy/6m24b)
# Acknowledgements
We take this occasion to thank God, almighty for blessing us with his 
grace and taking our endeavor to a successful culmination .We extend 
our sincere and heartfelt thanks to our esteemed guide, and We also 
take this opportunity to express a deep sense of gratitude to our course 
teacher Md. REDUANUL HAQUE for cordial support, valuable 
suggestions and guidance.
# Contact 
If you have any questions, feedback, or inquiries about my 2D scene project, please feel free to contact me at Email: ibrahim15-3802@diu.edu.bd
