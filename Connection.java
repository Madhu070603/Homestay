package com.registartion;

import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Connection implements Serializable{
	private static final long serialVersionUID = 6081417964063918994L;

	public List<Registration> getRegistarion() throws ClassNotFoundException, SQLException {

		java.sql.Connection connect = null;

		String url = "jdbc:mysql://localhost:3306/project";

		String username = "root";
		String password = "Sneha0909";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection(url, username, password);
			// System.out.println("Connection established"+connect);

		} catch (SQLException ex) {
			System.out.println("in exec");
			System.out.println(ex.getMessage());
		}
	  
		List<Registration> cars = new ArrayList<Registration>();
		PreparedStatement pstmt = connect.prepareStatement("select empName,gender,dob,address,emailaddress,mobilenumber *from Registration");
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			Registration car = new Registration();
			car.setEmpName(rs.getString("empname"));
			car.setGender(rs.getString("gender"));
			car.setDob(rs.getDate("dob"));
			car.setAddress(rs.getString("address"));
			car.setEmailAddress(rs.getString("emailaddress"));
			car.setMobileNumber(rs.getString("mobilenumber"));

			cars.add(car);

		}

		// close resources
		rs.close();
		pstmt.close();
		connect.close();

		return cars;

	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private PreparedStatement prepareStatement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}