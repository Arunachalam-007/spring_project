package com.chainsys.Example.com.chainsys.Example.loginDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chainsys.Example.com.chainsys.Example.loginModel.Login;

@Repository
public class LoginDao {

	@Autowired
	JdbcTemplate jdbctem;

	public void loginDetails(Login l) {
		String query = "insert into bankDetails7(cname,branchId,custId,custCity,cmobile) values(?,?,cid_val.nextval,?,?)";
		Object[] values = { l.getCname(),l.getBid(),l.getCcity(),l.getCmobile() };		
		int i=jdbctem.update(query, values);
		System.out.println(i);
	}
	public void updateDetails(Login l) {
		String query = "update bankDetails7 set cmobile=? where custId=?";
		Object[] values = { l.getCmobile(),l.getCid()};		
		int i=jdbctem.update(query, values);
		System.out.println(i);
	}
	
	
	public void deleteDetails(Login l) {
		String query = "delete from bankDetails7 where custId=?";
		Object[] values = {l.getCid()};		
		int i=jdbctem.update(query, values);
		System.out.println(i);
	}
	 

}
