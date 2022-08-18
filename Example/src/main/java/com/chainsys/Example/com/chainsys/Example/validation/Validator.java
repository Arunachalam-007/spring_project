package com.chainsys.Example.com.chainsys.Example.validation;

import org.springframework.stereotype.Repository;

@Repository
public class Validator {

	public boolean bidVal(String bid) {

		if ((bid.trim().length() > 2) && (!bid.equals(""))) {
			return true;
		} else {
			return false;
		}
	}
	public boolean cidVal(String cid) {

		if ((cid.trim().length() > 2) && (!cid.equals(""))) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean cnameVal(String cname) {

		String expression = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";

		if ((cname.trim().length() > 3) || (cname.matches(expression))) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean addrVal(String addr) {
		if ((addr.trim().length() > 3) && (!addr.equals(""))) {
			return true;
		} else {
			return false;
		}
	}

	public boolean cmobileVal(String mob) {
		String expression = "(0/91)?[7-9][0-9]{9}";
		if ((mob.trim().length() > 3) && (mob.matches(expression)) && (!mob.equals(""))) {
			return true;
		} else {
			return false;
		}
	}
}
