package com.cognizantInterns.Database;

import java.io.BufferedReader;
import java.io.FileWriter;
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

    public static Connection getConnect()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cogniInterns10022022","root","12345678");

        }
        catch(Exception e)
        {
            System.out.println("Exception ");
        }
        return con;
    }


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
            Connection connection=getConnect();
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


        catch(SQLException e)
        {
            System.out.println("SQL Query Is not found");
        }

    }
     void ReteriveDatawithCondition() throws IOException
     {
         System.out.println("Enter the Serial no u Want to Reterive");
         r.setSno(Integer.parseInt(bufferedReader.readLine()));
         try
         {

             Connection connection=getConnect();
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

         catch(SQLException sqlException)
         {
             System.out.println("SQL Excaption");
         }
     }
     public void reteriveData() throws IOException
     {
         FileWriter fileWriter=new FileWriter("vin.txt");
         try{
             Connection connection=getConnect();
             PreparedStatement ps=connection.prepareStatement("select * from registeration ");

             ResultSet rs=ps.executeQuery();
             System.out.println("Sno\tName\t\t\t\t\tDepartment\t\t\t\t\tEmailid\t\t\t\t\tDate of Birth\t\t\tMobile Number\t\t\t");
             fileWriter.write("Sno\tName\t\t\t\t\tDepartment\t\t\t\t\tEmailid\t\t\t\t\tDate of Birth\t\t\tMobile Number\t\t\t");
             fileWriter.write("\n");
             while(rs.next())
             {
                 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t\t\t\t"+rs.getString(3)+"\t\t\t\t\t"+rs.getString(4));
                 fileWriter.write(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t\t\t\t"+rs.getString(3)+"\t\t\t\t\t"+rs.getString(4));
                 fileWriter.write("\n");
             }
             fileWriter.close();
         }

         catch (SQLException sqle)
         {
             System.out.println("SQLException");
         }
     }
   public  void updateRecords() throws IOException,ClassNotFoundException,SQLException
     {
         this.reteriveData();
         System.out.println("Enter the Sno u want to Update");
         int s=Integer.parseInt(bufferedReader.readLine());
         Connection connection=getConnect();
         System.out.println("Enter the Name u want to update");
         r.setName(bufferedReader.readLine());
         PreparedStatement ps1=connection.prepareStatement("update registeration set name=? where sno=? ");
         ps1.setString(1,r.getName());
         ps1.setInt(2,s);
         int i=ps1.executeUpdate();
         if(i>0)
         {
             System.out.println("Updated Successfully");
         }
         else
         {
             System.out.println("Error in Updation");
         }



     }

     void chooseTheOperation() throws IOException,ClassNotFoundException,SQLException
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
                 this.updateRecords();
                 break;
             case 3:
                 System.out.println("Coming Soon....");
                 break;
             case 4:
                this.reteriveData();
                 break;
             case 5:
                this.ReteriveDatawithCondition();
                 break;
             default:
                 System.out.println("Please Choose Correct Options");
                 break;
         }
     }


    public static void main(String[] args) throws IOException,ClassNotFoundException,SQLException{
        JDBCOperation vin=new JDBCOperation();
        vin.chooseTheOperation();
    }

}
