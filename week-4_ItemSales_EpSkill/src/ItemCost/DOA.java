package ItemCost;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ItemCost.Bean;
import ItemCost.DBUtil;

public class DOA {

	public int item_Insert(Bean market) throws ClassNotFoundException, SQLException{
		
		Connection con=DBUtil.DBConnection();
		PreparedStatement ps=con.prepareStatement("insert into sales values(?,?,?)");  
		ps.setInt(1,market.getitemId());
		ps.setString(2,market.getitemName());
		ps.setInt(3,market.getitemCost());
		int i = ps.executeUpdate();
		con.close();
		return i;
	}
	
	public void Items_Display() throws ClassNotFoundException, SQLException{
		Connection con=DBUtil.DBConnection();
		PreparedStatement ps=con.prepareStatement("select * from sales");
		ResultSet display = (ResultSet) 
		ps.executeQuery();
		System.out.println("itemid \t itemname \t itemcost");
		while(display.next()) {
			System.out.print(display.getInt(1));
			System.out.print("\t  "+display.getString(2));
			System.out.print("\t \t  "+display.getInt(3));
			System.out.println();
		}
		con.close();
	}
	
	public void items_totalCost() throws ClassNotFoundException, SQLException{
		Connection con=DBUtil.DBConnection();
		PreparedStatement ps=con.prepareStatement("SELECT sum(itemcost) FROM sales.sales;");
		ResultSet display = (ResultSet) 
		ps.executeQuery();
		System.out.println("itemCost");
		int sum = 0;
		while(display.next()) {
			int c = display.getInt(1);
			sum = sum + c;
			System.out.println("Total Cost "+sum);
		}
		con.close();
	}
}

