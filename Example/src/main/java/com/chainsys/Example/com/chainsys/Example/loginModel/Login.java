package com.chainsys.Example.com.chainsys.Example.loginModel;

public class Login {

	private String cname;
	private String bid;
	private String cid;
	private String ccity;
	private String cmobile;
	public String getCname() {
		return cname;
	}
	@Override
	public String toString() {
		return "Login [cname=" + cname + ", bid=" + bid + ", cid=" + cid + ", ccity=" + ccity + ", cmobile=" + cmobile
				+ "]";
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public String getCmobile() {
		return cmobile;
	}
	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}
	
	
}
