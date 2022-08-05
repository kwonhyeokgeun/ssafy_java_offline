package exception.custom;

public class Service {
	public int addEmpVocation(EmpDto dto, int days) throws EmpException{
		if(days>5) {
			throw new EmpException("ERR_02","휴가일수가 5일 초과했습니다.");
		}
		Dao dao = new Dao();
		return dao.addEmpVocation(dto, days);
	}
}
