package p1.day21.demo.dao;

import p1.day21.demo.dao.base.IJDBC;

public class MySQLJDBC implements IJDBC{
	
//	public IJDBC getConnection(){
//		return new MySQLJDBC();
//	}
	
	public void getConnection(){
		System.out.println("MySQLJDBC");
	}
}
