package com.crm.vtiger.GenericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
	 * This class contain generic methods to read data from database
	 * @author vinay
	 * 
	 */
	public class DataBaseUtility
	{
		Connection con=null;
		ResultSet result=null;
		Driver driverRef;
		/**
		 * Connection with data base is established
		 * @throws SQLException 
		 * @throws throwable
		 * 
		 */
		public void ConnectToDB() throws SQLException
		{
			DriverManager.registerDriver(driverRef);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet","root","root");
	    }
		
		/**
		 * DB connection is closed
		 * @throws Throwable
		 */
		public void closeDB() throws Throwable
		{
			con.close();
		}
		
		/**
		 * This method returns the data wrt column index
		 * @param query
		 * @param Columnindex
		 * @return 
		 * @throws Throwable
		 */
		
		public String getDataFromDB(String query,int Columnindex) throws Throwable
		{
			String value=null;
			result=con.createStatement().executeQuery(query);
			while(result.next())
			{
				value=result.getString(Columnindex);
			}
			return value;
		}
      
	
	/** 
	 * get data from Db and verify
	 *@param query
	 *@param columnName
	 *@param expData
	 *@return
	 *@throws SQLException
	 */
	
	public String getDataFromDB(String query,int  columnName,String expData) throws SQLException
	{
		boolean flag=false;
		result=con.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnName).equalsIgnoreCase(expData))
            {
	             flag=true;
	              break;
            }
			if(flag)
			{
				System.out.println(expData+"data verified in database");
				return expData;
			}
			else
			{
				System.out.println(expData+"data not verified");
				return expData;
			}
		}
		return expData;
	}
}
