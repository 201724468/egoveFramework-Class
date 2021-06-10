package egovframework.example.main.vo;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class MainVo {
	private int classSeq;
    private String className;
    private String classCode;
    private String classNote;
    private String classProfessor;
    private String pgMode;
    private Date regiDtm;
    private String fileName;
    private MultipartFile uploadFile;
    
	/**
	 * @return the classSeq
	 */
	public int getClassSeq() {
		return classSeq;
	}
	/**
	 * @param classSeq the classSeq to set
	 */
	public void setClassSeq(int classSeq) {
		this.classSeq = classSeq;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the classCode
	 */
	public String getClassCode() {
		return classCode;
	}
	/**
	 * @param classCode the classCode to set
	 */
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	/**
	 * @return the classNote
	 */
	public String getClassNote() {
		return classNote;
	}
	/**
	 * @param classNote the classNote to set
	 */
	public void setClassNote(String classNote) {
		this.classNote = classNote;
	}
	/**
	 * @return the classProfessor
	 */
	public String getClassProfessor() {
		return classProfessor;
	}
	/**
	 * @param classProfessor the classProfessor to set
	 */
	public void setClassProfessor(String classProfessor) {
		this.classProfessor = classProfessor;
	}
	/**
	 * @return the pgMode
	 */
	public String getPgMode() {
		return pgMode;
	}
	/**
	 * @param pgMode the pgMode to set
	 */
	public void setPgMode(String pgMode) {
		this.pgMode = pgMode;
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @return the uploadFile
	 */
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	/**
	 * @param uploadFile the uploadFile to set
	 */
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	/**
	 * @return the regiDtm
	 */
	public Date getRegiDtm() {
		return regiDtm;
	}
	/**
	 * @param regiDtm the regiDtm to set
	 */
	public void setRegiDtm(Date regiDtm) {
		this.regiDtm = regiDtm;
	}
    
}
