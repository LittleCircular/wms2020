package p1.day21.demo.dao;

import p1.day21.demo.dao.base.IJDBC;

public class DB2JDBC implements IJDBC{
	
//	public IJDBC getConnection(){
//		return new DB2JDBC();
//	}
	
	public void getConnection(){
		System.out.println("DB2JDBC");
	}
	
}
