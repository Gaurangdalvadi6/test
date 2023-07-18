package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connectivity.DatabaseConnection;
import model.User;

public class UserDao {
	public static void insertUser(User u) {
		try {
			Connection con = DatabaseConnection.getConnection();
			String sqlString = "insert into darshan (name,contact,gender,dob,address,email,password) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sqlString);
			pst.setString(1, u.getName());
			pst.setLong(2, u.getContact());
			pst.setString(3, u.getGender());
			pst.setString(4, u.getDob());
			pst.setString(5, u.getAddress());
			pst.setString(6, u.getEmail());
			pst.setString(7, u.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static User loginUser(User u) {
		User user = null;
		try {
			Connection con = DatabaseConnection.getConnection();
			String sqlString = "select * darshan where email=? and password=?";
			PreparedStatement pst = con.prepareStatement(sqlString);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setContact(rs.getLong("contact"));
				user.setGender(rs.getString("gender"));
				user.setDob(rs.getString("dob"));
				user.setAddress(rs.getString("address"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection con = DatabaseConnection.getConnection();
			String sqlString = "select * darshan where email=?";
			PreparedStatement pst = con.prepareStatement(sqlString);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static User userById(int id) {
		User user = null;
		try {
			Connection con = DatabaseConnection.getConnection();
			String sqlString = "select * darshan where id=?";
			PreparedStatement pst = con.prepareStatement(sqlString);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setContact(rs.getLong("contact"));
				user.setGender(rs.getString("gender"));
				user.setDob(rs.getString("dob"));
				user.setAddress(rs.getString("address"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return user;
	}
}
