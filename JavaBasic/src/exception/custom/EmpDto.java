package exception.custom;

public class EmpDto {
	private String empNo;
	
	public EmpDto() {}
	public EmpDto(String empNo) {
		this.empNo=empNo;
	}
	
	public String getEmpNo() {
		return this.empNo;
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
}
