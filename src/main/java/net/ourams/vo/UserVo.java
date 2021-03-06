package net.ourams.vo;

public class UserVo {
	private int userNo;
	private String email;
	private String password;
	private String userName;
	private int userType;
	private String logoPath;
	private String phoneNumber;
	private int seatNo;
	private int postCnt;
	private int accessStat;

	public UserVo() {
	}

	public UserVo(int userNo, String email, String password, String userName, int userType, String logoPath,
			String phoneNumber) {
		this.userNo = userNo;
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.userType = userType;
		this.logoPath = logoPath;
		this.phoneNumber = phoneNumber;
	}

	public UserVo(int userNo, String email, String password, String userName, int userType, String logoPath,
			String phoneNumber, int seatNo, int postCnt, int accessStat) {
		this.userNo = userNo;
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.userType = userType;
		this.logoPath = logoPath;
		this.phoneNumber = phoneNumber;
		this.seatNo = seatNo;
		this.postCnt = postCnt;
		this.accessStat = accessStat;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getPostCnt() {
		return postCnt;
	}

	public void setPostCnt(int postCnt) {
		this.postCnt = postCnt;
	}

	public int getAccessStat() {
		return accessStat;
	}

	public void setAccessStat(int accessStat) {
		this.accessStat = accessStat;
	}

	@Override
	public String toString() {
		return "UserVo [userNo=" + userNo + ", email=" + email + ", password=" + password + ", userName=" + userName
				+ ", userType=" + userType + ", logoPath=" + logoPath + ", phoneNumber=" + phoneNumber + ", seatNo="
				+ seatNo + ", postCnt=" + postCnt + ", accessStat=" + accessStat + "]";
	}

}
