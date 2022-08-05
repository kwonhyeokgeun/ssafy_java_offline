package exception.custom;

public class Controller {
	public int addEmpVocation(EmpDto dto, int days) throws EmpException{
		if(dto==null || dto.getEmpNo() == null) {
			throw new EmpException("ERR_01","사원정보가 없습니다.");
		}
		Service service = new Service();
		return service.addEmpVocation(dto, days);
	}
}
