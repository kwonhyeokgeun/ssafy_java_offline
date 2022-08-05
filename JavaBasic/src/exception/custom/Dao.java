package exception.custom;

public class Dao {
	public int addEmpVocation(EmpDto dto, int days) throws EmpException{
		//DB 관련 작업 수행전 validation 체크
		if(dto.getEmpNo().indexOf("emp") !=0 ) { //사번이  emp로 시작하지않음.
			throw new EmpException("ERR_03","사번이 올바르지 않습니다."); //ERR_03를 throw
		}
		System.out.println("휴가등록 완료");
		return 1;
	}

}
