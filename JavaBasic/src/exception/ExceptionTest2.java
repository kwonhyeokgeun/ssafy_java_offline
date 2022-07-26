package exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.m();
	}
}

class Controller{
	public void m() {
		Service service = new Service();
		service.m();
	}
}

class Service{
	public void m() {
		Dao dao = new Dao();
		try {
			dao.m();
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		
	}
}

class Dao{
	public void m() throws NullPointerException{
		String s = null;
		s.length();
	}
}