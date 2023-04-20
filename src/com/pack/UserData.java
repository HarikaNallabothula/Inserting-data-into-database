package com. pack;
import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class UserData {


public static void main(String[] args) {
	Connection con=null;
	con=Helperclass.putConnectiion();
try {
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter equip_id:");
	int equip_id=sc.nextInt();
	System.out.println("Enter type:"+sc.nextLine());
	String type=sc.nextLine();
    System.out.println("Enter Colour:");
	String color=sc.nextLine();
	System.out.println("Enter Location:");
	String location=sc.nextLine();
	System.out.println("install_date is automatically inserted");
	/*System.out.println(" Enter Date in this yyyy-MM-Format:");
	String sdate=sc.next();	
 SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
 java.util.Date jdate=sdf.parse(sdate);
 long ms=jdate.getTime();
 java.sql.Date date=new java.sql.Date(ms);*/
	LocalDateTime date = LocalDateTime.now();  
    PreparedStatement pst=con.prepareStatement("insert into playground values(?,?,?,?,?)");
	pst.setInt(1,equip_id);
	pst.setString(2,type);
	pst.setString(3,color);
	pst.setString(4,location);
	//pst.setDate(5,date);
	pst.setObject(5,date.toLocalDate());
	pst.executeUpdate();
	System.out.println("USERDATA INSERTED SUCCESSFULLY......");
	con.close();}
catch(/*ParseException|*/SQLException e) {
	e.printStackTrace();}}}
