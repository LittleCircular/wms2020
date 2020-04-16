package p1.day21.demo.dao;

import p1.day21.demo.dao.base.IJDBC;

public class OracleJDBC implements IJDBC{
	
//	public IJDBC getConnection(){
//		return new OracleJDBC();
//	}
	
	public void getConnection(){
		System.out.println("OracleJDBC");
	}
}
