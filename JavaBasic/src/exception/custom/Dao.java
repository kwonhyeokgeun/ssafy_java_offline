package exception.custom;

public class Dao {
	public int addEmpVocation(EmpDto dto, int days) throws EmpException{
		//DB ���� �۾� ������ validation üũ
		if(dto.getEmpNo().indexOf("emp") !=0 ) { //�����  emp�� ������������.
			throw new EmpException("ERR_03","����� �ùٸ��� �ʽ��ϴ�."); //ERR_03�� throw
		}
		System.out.println("�ް���� �Ϸ�");
		return 1;
	}

}
