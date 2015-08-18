package spring_mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class EmployeeDAOImpl implements EmployeeDAO{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public void getDBConnection() {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			conn=DriverManager.getConnection(url,"scott","tiger");
		}
		catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void closeDBConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void addEmployee(Employee employee){
		getDBConnection();
		String query="insert into employee values(?,?,?)";
		try{
			pst=conn.prepareStatement(query);
			pst.setInt(1, employee.getEmpcode());
			pst.setString(2, employee.getEmpname());
			pst.setDouble(3, employee.getSalary());
			pst.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			closeDBConnection();
		}
	}
	public void updateEmployee(Employee em){
		getDBConnection();
		//Employee e = new Employee();
		double amt = em.getSalary()+300;
		String name = em.getEmpname();
		String query="update employee set salary=? where empname=?";
		
		try{
			
			pst=conn.prepareStatement(query);
			pst.setDouble(1,amt);
			pst.setString(2,name);
		/*	pst.setInt(1, employee.getEmpcode());
			pst.setString(2, employee.getEmpname());
			pst.setDouble(3, employee.getSalary());*/
			pst.executeUpdate();
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			closeDBConnection();
		}
	}
	public List<Employee> getEmployees(){
		getDBConnection();
		Employee emp;
		List<Employee> empls =new ArrayList<Employee>();
		try{
			pst=conn.prepareStatement("select *from employee");
			rs=pst.executeQuery();
			while(rs.next()){
				emp=new Employee();
				emp.setEmpcode(rs.getInt("Empcode"));
				emp.setEmpname(rs.getString("Empname"));
				emp.setSalary(rs.getDouble("Salary"));
				empls.add(emp);
			}}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			closeDBConnection();
		}
		return empls;

	}
}

