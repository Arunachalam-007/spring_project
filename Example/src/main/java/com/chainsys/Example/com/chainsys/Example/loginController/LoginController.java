package com.chainsys.Example.com.chainsys.Example.loginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.Example.com.chainsys.Example.loginDao.LoginDao;
import com.chainsys.Example.com.chainsys.Example.loginModel.Login;
import com.chainsys.Example.com.chainsys.Example.validation.Validator;

@Controller
public class LoginController {

	@Autowired
	LoginDao ld;
	
	@Autowired
	Validator v;
	
	Login lo=new Login();
	@GetMapping("/login")
	public String loginInfo(@RequestParam("cname") String cName,@RequestParam("bid") String bId,@RequestParam("ccity") String cCity,@RequestParam("cmob") String cMobile) {
		
		
		
		if(v.cnameVal(cName)) {
			lo.setCname(cName);
		}
		else {
			System.out.println("Invalid");
		}	
		
		if(v.bidVal(bId)) {
			lo.setBid(bId);
		}
		else {
			System.out.println("Invalid");
		}
		
//		if(v.cidVal(cId)) {
//			lo.setCid(cId);
//		}
//		else {
//			System.out.println("Invalid");
//		}
		if(v.addrVal(cCity)) {
			lo.setCcity(cCity);
		}
		else {
			System.out.println("Invalid");
		}
		if(v.cmobileVal(cMobile)) {
			lo.setCmobile(cMobile);
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println(lo.getCname()+" "+lo.getBid()+" "+lo.getCid()+" "+lo.getCcity()+" "+lo.getCmobile());
		
		ld.loginDetails(lo);
		return "update.jsp";
	}
	
	@GetMapping("/update")
	public String updateInfo(@RequestParam("cid") String cId,@RequestParam("cmob") String cMobile) {
		
		if(v.cidVal(cId)) {
			lo.setCid(cId);
		}
		else {
			System.out.println("Invalid");
		}
		if(v.cmobileVal(cMobile)) {
			lo.setCmobile(cMobile);
		}
		else {
			System.out.println("Invalid");
		}
		
		ld.updateDetails(lo);
		return "delete.jsp";
	}
	
	@GetMapping("/delete")
	public String deleteInfo(@RequestParam("cid") String cId) {
		if(v.cidVal(cId)) {
			lo.setCid(cId);
		}
		else {
			System.out.println("Invalid");
		}
		
		ld.deleteDetails(lo);
		return "addUser.jsp";
	}
	
}
