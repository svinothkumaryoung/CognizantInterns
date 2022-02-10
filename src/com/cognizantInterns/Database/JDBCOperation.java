package com.cognizantInterns.Database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDBCOperation {
    InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    ResultSet rs1;


    Registeration r=new Registeration();
    void getDate() throws IOException
    {
        System.out.println("Enter the Name ");
        r.setName(bufferedReader.readLine());
        System.out.println("Enter the Department");
        r.setDept(bufferedReader.readLine());
        System.out.println("Enter the Email Id");
        r.setEmailid(bufferedReader.readLine());
        System.out.println("Enter the Date of Birth");
        LocalDate ld=LocalDate.parse(bufferedReader.readLine());
        r.setDateOfBirth(ld.toString());
        System.out.println("Enter the Mobile No");
        r.setMobilNe(bufferedReader.readLine());
    }
    void insertData()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/cogniInterns10022022","root","12345678");
            PreparedStatement ps=connection.prepareStatement("insert into registeration(name,dept,emailid,dateofBirth,mobileNo) values(?,?,?,?,?);");
            ps.setString(1,r.getName());
            ps.setString(2,r.getDept());
            ps.setString(3,r.getEmailid());
            ps.setString(4,r.getDateOfBirth());
            ps.setString(5,r.getMobilNe());
            int i=ps.executeUpdate();//DML Based Operation ExecuteUpdate is used
            if(i>0)
            {
                System.out.println("Value Inserted Successfully");
            }
            else
            {
                System.out.println("Error in Insertion");
            }
        }

        catch(ClassNotFoundException cnfe)
        {
            System.out.println("Class Driver Not Found");

        }
        catch(SQLException e)
        {
            System.out.println("SQL Query Is not found");
        }

    }
     void ReteriveData() throws IOException
     {
         System.out.println("Enter the Serial no u Want to Reterive");
         r.setSno(Integer.parseInt(bufferedReader.readLine()));
         try
         {

             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/cogniInterns10022022","root","12345678");
             PreparedStatement ps1=connection.prepareStatement("select * from registeration where sno=?");
             ps1.setInt(1,r.getSno());
             rs1= ps1.executeQuery();
             while(rs1.next())
             {
                 System.out.println("Sno "+rs1.getInt(1));
                 System.out.println("Name "+rs1.getString(2));
                 System.out.println("Department "+rs1.getString(3));
                 System.out.println("Email id "+rs1.getString(4));
                 System.out.println("Date of Birth "+rs1.getString(5));
                 System.out.println("Mobile Number "+rs1.getString(6));
             }



         }
         catch(ClassNotFoundException cnfe)
         {
             System.out.println("Class Not Found Exception");
         }
         catch(SQLException sqlException)
         {
             System.out.println("SQL Excaption");
         }
     }
     void chooseTheOperation() throws IOException
     {
         System.out.println("Enter your Choice ");
         System.out.println("1.Insert\n2.Update\n3.Delete\n4.Reterive Data\n5.Reterive Condition");
         int s= Integer.parseInt(bufferedReader.readLine());
         switch (s)
         {
             case 1:
                 this.getDate();
                 this.insertData();
                 break;
             case 2:
                 System.out.println("Coming Soon....");
                 break;
             case 3:
                 System.out.println("Coming Soon....");
                 break;
             case 4:
                 System.out.println("Coming Soon....");
                 break;
             case 5:
                this.ReteriveData();
                 break;
             default:
                 System.out.println("Please Choose Correct Options");
                 break;
         }
     }


    public static void main(String[] args) throws IOException{
        JDBCOperation vin=new JDBCOperation();
        vin.chooseTheOperation();
    }

}
