package net.ourams.vo;

import java.util.List;

public class CourseDataroomVo {
	/*
	 * data room 
	 */
	private int dataRoomNo;
	private int courseNo;
	private String dataRoomName;
	private int pRoomNo;
	/*
	 * data room file
	 */
	private int dataRoomFileNo;
	/* private int dataRoomNo; */
	/* private int fileNo; */
	
	/*
	 * data room file tag
	 */
	private int dataRoomFileTagNo;
	/*
	 * private int dataRoomFileNo;
	 * private int dataTagNo;
	 */
	
	/*
	 * data tag 
	 */
	private int dataTagNo;
	private String dataTagName;
	
	/*
	 * data file  
	 */
	private int fileNo;
	private String fileName;
	private String saveName;
	private long fileSize;
	private String regDate;
	private String filePath;
	
	


	public CourseDataroomVo(int dataRoomNo, 
							int courseNo, 
							String dataRoomName, 
							int pRoomNo, 
							int dataRoomFileNo,
							int dataRoomFileTagNo, 
							int dataTagNo, 
							String dataTagName, 
							int fileNo, 
							String fileName, 
							String saveName,
							long fileSize, 
							String regDate, 
							String filePath) {
		this.dataRoomNo = dataRoomNo;
		this.courseNo = courseNo;
		this.dataRoomName = dataRoomName;
		this.pRoomNo = pRoomNo;
		this.dataRoomFileNo = dataRoomFileNo;
		this.dataRoomFileTagNo = dataRoomFileTagNo;
		this.dataTagNo = dataTagNo;
		this.dataTagName = dataTagName;
		this.fileNo = fileNo;
		this.fileName = fileName;
		this.saveName = saveName;
		this.fileSize = fileSize;
		this.regDate = regDate;
		this.filePath = filePath;
	}

	

	public CourseDataroomVo() { }


	public int getDataRoomNo() {
		return dataRoomNo;
	}


	public void setDataRoomNo(int dataRoomNo) {
		this.dataRoomNo = dataRoomNo;
	}


	public int getCourseNo() {
		return courseNo;
	}


	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}


	public String getDataRoomName() {
		return dataRoomName;
	}


	public void setDataRoomName(String dataRoomName) {
		this.dataRoomName = dataRoomName;
	}


	public int getpRoomNo() {
		return pRoomNo;
	}


	public void setpRoomNo(int pRoomNo) {
		this.pRoomNo = pRoomNo;
	}


	public int getDataRoomFileNo() {
		return dataRoomFileNo;
	}


	public void setDataRoomFileNo(int dataRoomFileNo) {
		this.dataRoomFileNo = dataRoomFileNo;
	}


	public int getDataRoomFileTagNo() {
		return dataRoomFileTagNo;
	}


	public void setDataRoomFileTagNo(int dataRoomFileTagNo) {
		this.dataRoomFileTagNo = dataRoomFileTagNo;
	}


	public int getDataTagNo() {
		return dataTagNo;
	}


	public void setDataTagNo(int dataTagNo) {
		this.dataTagNo = dataTagNo;
	}


	public String getDataTagName() {
		return dataTagName;
	}


	public void setDataTagName(String dataTagName) {
		this.dataTagName = dataTagName;
	}


	public int getFileNo() {
		return fileNo;
	}


	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}




	public String getSaveName() {
		return saveName;
	}



	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}



	public long getFileSize() {
		return fileSize;
	}


	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	@Override
	public String toString() {
		return "CourseDataroomVo [dataRoomNo=" + dataRoomNo + ", courseNo=" + courseNo + ", dataRoomName="
				+ dataRoomName + ", pRoomNo=" + pRoomNo + ", dataRoomFileNo=" + dataRoomFileNo + ", dataRoomFileTagNo="
				+ dataRoomFileTagNo + ", dataTagNo=" + dataTagNo + ", dataTagName=" + dataTagName + ", fileNo=" + fileNo
				+ ", fileName=" + fileName + ", saveName=" + saveName + ", fileSize=" + fileSize + ", regDate="
				+ regDate + ", filePath=" + filePath + "]";
	}
	
	
	
	
}
