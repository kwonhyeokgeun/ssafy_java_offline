package exception.custom;

public class Service {
	public int addEmpVocation(EmpDto dto, int days) throws EmpException{
		if(days>5) {
			throw new EmpException("ERR_02","�ް��ϼ��� 5�� �ʰ��߽��ϴ�.");
		}
		Dao dao = new Dao();
		return dao.addEmpVocation(dto, days);
	}
}
