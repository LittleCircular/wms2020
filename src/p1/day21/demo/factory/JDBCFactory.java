package p1.day21.demo.factory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import p1.day21.demo.dao.base.IJDBC;

public class JDBCFactory {

	public static IJDBC getInstance() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/JDBCFactory.txt")));
		String path = br.readLine();
		Class<IJDBC> cls = (Class<IJDBC>)Class.forName(path);
//		IJDBC j = new IJDBC(){
//
//			@Override
//			public void getConnection() {
//				System.out.println("JDBC");
//			}
//			
//		};
//		IJDBC j1 = ()->{System.out.println("JDBC2");};
		br.close();
		return  cls.newInstance();
	}
}
