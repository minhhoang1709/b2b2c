package b2b2c.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbluser")
public class UserModel {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_pass")
	private String userPass;

	@Column(name = "user_fullname")
	private String userFullname;

	@Column(name = "user_address")
	private String userAddress;

	@Column(name = "user_email")
	private String userEmail;

	@Column(name = "user_phone")
	private String userPhone;

	@Column(name = "user_created_date")
	private String userCreatedDate;

	public UserModel() {

	}

	public UserModel(int userId, String userName, String userPass, String userFullname, String userAddress,
			String userEmail, String userPhone, String userCreatedDate) {
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.userFullname = userFullname;
		this.userAddress = userAddress;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userCreatedDate = userCreatedDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserFullname() {
		return userFullname;
	}

	public void setUserFullname(String userFullname) {
		this.userFullname = userFullname;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserCreatedDate() {
		return userCreatedDate;
	}

	public void setUserCreatedDate(String userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}
}
