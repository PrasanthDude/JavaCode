package com.prasanth.basic;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class FileRead 
{
	static Dao gt;
	static 
	{
		gt = new Dao();
	}


	public static void main(String[] args) throws Exception {
		
		FileRead fr= new FileRead();
		String s1 = "Java";
		String s2 = "Python";
		String s3 = "Go";
		String s4 = "Ruby";
		String s5 = "Perl";
		String s6 = "C";
		String s7 = "C++";
		String s8 = "JavaScript";
		StringBuffer sb = new StringBuffer();
		ArrayList<String> al = new ArrayList<String>();
		File file = new File("C:\\Users\\Prasanth.Ravi\\Desktop\\Folder1\\prasanth.pdf");
		FileInputStream fis = new FileInputStream(file.getAbsolutePath());
		XWPFDocument document = new XWPFDocument(fis);
		List<XWPFParagraph> paragraphs = document.getParagraphs();
		System.out.println("Total no of paragraph " + paragraphs.size());
		for (XWPFParagraph para : paragraphs) {
			sb.append(para.getText());
		}
		String document1 = sb.toString();
		String data = (sb.toString());
		String data_lower = data.toLowerCase();
		if (data_lower.contains(s1)) {
			al.add(s1);
		}
		if (data_lower.contains(s2)) {
			al.add(s2);
		}
		if (data_lower.contains(s3)) {
			al.add(s3);
		}
		if (data_lower.contains(s4)) {
			al.add(s4);
		}
		if (data_lower.contains(s5)) {
			al.add(s5);
		}
		if (data_lower.contains(s6)) {
			al.add(s6);
		}
		if (data_lower.contains(s7)) {
			al.add(s7);
		}
		if (data_lower.contains(s7)) {
			al.add(s8);
		}
		String pt = ".*JAVA.*";
		Pattern pattern = Pattern.compile(pt);
		Matcher matcher = pattern.matcher(data);
		String phone =fr. validate(sb.toString());
		String email = getPersonalEmail(sb.toString());
		String dob = getDob(sb.toString());
		String Employer = null;
		System.out.println("KeySkills :" + al);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(dob);
		Connection con = gt.getConnection();
		Employer = getEmployers(data_lower);
		System.out.println(Employer);
		PreparedStatement stmt = con.prepareStatement("insert into pop values(?,?,?,?,?)");
		stmt.setString(2, email);
		stmt.setString(3, phone);
		stmt.setString(1, al.toString());
		stmt.setString(4, dob);
		stmt.setString(5, Employer);
		int i = stmt.executeUpdate();
		System.out.println(i + " records inserted");
		con.close();
		fis.close();
	}

public  String validate(String s) 
{
String phone = null;

Matcher m = Pattern.compile("\\d{10}").matcher(s);
while (m.find()) 
phone = m.group();
return phone;

}

	public static String getEmployers(String sb) throws Exception {
		ArrayList<String> al = new ArrayList<String>();
		StringBuffer sb1 = new StringBuffer();
		Connection con=gt.getConnection();

		PreparedStatement stmt = con.prepareStatement("select * from employers");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			al.add(rs.getString(1));
		}
		for (String string : al) {
			if (sb.contains(string)) {
				sb1.append(string);
				sb1.append(",");
			}
		}
		String Emp = sb1.toString();
		int w = Emp.length();
		Emp = Emp.substring(0, w - 1);
		return Emp;

	}

	public static String getPersonalEmail(String s) {
		String email = null;
		Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(s);
		while (m.find()) {
			email = m.group();
		}
		return email;
	}

	public static String getDob(String s) {
		String dob = null;
		Matcher m = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}").matcher(s);
		while (m.find()) 
		{
			dob = m.group();
		}
		return dob;
	}
}