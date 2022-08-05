package exception.custom;

public class Test {

	public static void main(String[] args) {
		Controller controller = new Controller();
		EmpDto dto = getEmpDto();
		
		try {
			controller.addEmpVocation(dto, 4);
		} catch (EmpException e) {
			switch(e.exCode) {
				//아래 처리는 동일한처리 -> 즉 switch가 필요없는데 구조적으로 보기 위해서 넣음
				case "ERR_01" : System.out.println(e.exCode + " : " + e.getMessage()); break;
				case "ERR_02" : System.out.println(e.exCode + " : " + e.getMessage()); break;
				case "ERR_03" : System.out.println(e.exCode + " : " + e.getMessage()); break;
			}
		}
	}
	
	static EmpDto getEmpDto() {
		//return null;    //addEmpVocation(dto, 4)   //ERR_01 (EmpDto 자체가 null이라서)
		//return new EmpDto();  //addEmpVocation(dto, 7)  //ERR_01 (empNo가 null이라서)
		//return new EmpDto("111"); //addEmpVocation(dto, 7); //ERR_02 (휴가일수 초과)
		//return new EmpDto("111"); //addEmpVocation(dto, 4); //ERR_03 (사번이 emp로 시작하지 않음)
		return new EmpDto("emp111"); //addEmpVocation(dto, 4);  //휴가등록완료
	}

}
