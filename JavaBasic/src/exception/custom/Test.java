package exception.custom;

public class Test {

	public static void main(String[] args) {
		Controller controller = new Controller();
		EmpDto dto = getEmpDto();
		
		try {
			controller.addEmpVocation(dto, 4);
		} catch (EmpException e) {
			switch(e.exCode) {
				//�Ʒ� ó���� ������ó�� -> �� switch�� �ʿ���µ� ���������� ���� ���ؼ� ����
				case "ERR_01" : System.out.println(e.exCode + " : " + e.getMessage()); break;
				case "ERR_02" : System.out.println(e.exCode + " : " + e.getMessage()); break;
				case "ERR_03" : System.out.println(e.exCode + " : " + e.getMessage()); break;
			}
		}
	}
	
	static EmpDto getEmpDto() {
		//return null;    //addEmpVocation(dto, 4)   //ERR_01 (EmpDto ��ü�� null�̶�)
		//return new EmpDto();  //addEmpVocation(dto, 7)  //ERR_01 (empNo�� null�̶�)
		//return new EmpDto("111"); //addEmpVocation(dto, 7); //ERR_02 (�ް��ϼ� �ʰ�)
		//return new EmpDto("111"); //addEmpVocation(dto, 4); //ERR_03 (����� emp�� �������� ����)
		return new EmpDto("emp111"); //addEmpVocation(dto, 4);  //�ް���ϿϷ�
	}

}
