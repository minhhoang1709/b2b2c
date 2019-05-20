package b2b2c.dto;

public class UserDto {
	private int userId;
	private String userName;
	private String userFullname;
	
	public UserDto() {
		
	}
	
	public UserDto(int userId, String userName, String userFullname) {
		this.userId = userId;
		this.userName = userName;
		this.userFullname = userFullname;
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
	public String getUserFullname() {
		return userFullname;
	}
	public void setUserFullname(String userFullname) {
		this.userFullname = userFullname;
	}
	
	
}
