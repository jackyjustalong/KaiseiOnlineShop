package tokyo.kaisei.bean;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer uId;
    private String username;
    private String password;
    private String email;
    private String tel;
    private String postCode;
    private String ken_name;
    private String city_name;
    private String address;
    private String fname;
    private String lname;
    private String fname1;
    private String lname1;
    private Integer admin_id;
    private Date createtime;
    private Date updatetime;
    private boolean invalid;
    private Integer auth;
    private String birthday;
    private String gender;
	public Integer getUId() {
		return uId;
	}
	public void setUId(Integer uId) {
		this.uId = uId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPost_code(String postCode) {
		this.postCode = postCode;
	}
	public String getKen_name() {
		return ken_name;
	}
	public void setKen_name(String ken_name) {
		this.ken_name = ken_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname1() {
		return fname1;
	}
	public void setFname1(String fname1) {
		this.fname1 = fname1;
	}
	public String getLname1() {
		return lname1;
	}
	public void setLname1(String lname1) {
		this.lname1 = lname1;
	}
	public Integer getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public boolean isInvalid() {
		return invalid;
	}
	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}
	public Integer getAuth() {
		return auth;
	}
	public void setAuth(Integer auth) {
		this.auth = auth;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Users(Integer uId, String username, String password, String email, String tel, String postCode,
			String ken_name, String city_name, String address, String fname, String lname, String fname1, String lname1,
			Integer admin_id, Date createtime, Date updatetime, boolean invalid, Integer auth, String birthday,
			String gender) {
		super();
		this.uId = uId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.tel = tel;
		this.postCode = postCode;
		this.ken_name = ken_name;
		this.city_name = city_name;
		this.address = address;
		this.fname = fname;
		this.lname = lname;
		this.fname1 = fname1;
		this.lname1 = lname1;
		this.admin_id = admin_id;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.invalid = invalid;
		this.auth = auth;
		this.birthday = birthday;
		this.gender = gender;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [uId=" + uId + ", username=" + username + ", password=" + password + ", email=" + email + ", tel="
				+ tel + ", postCode=" + postCode + ", ken_name=" + ken_name + ", city_name=" + city_name + ", address="
				+ address + ", fname=" + fname + ", lname=" + lname + ", fname1=" + fname1 + ", lname1=" + lname1
				+ ", admin_id=" + admin_id + ", createtime=" + createtime + ", updatetime=" + updatetime + ", invalid="
				+ invalid + ", auth=" + auth + ", birthday=" + birthday + ", gender=" + gender + "]";
	}
	
	
    
    

}
