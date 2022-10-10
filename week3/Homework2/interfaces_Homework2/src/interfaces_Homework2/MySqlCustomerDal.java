package interfaces_Homework2;

public class MySqlCustomerDal implements CustomerDal, Repostory{

	@Override
	public void add() {
		System.out.println("My sql eklendi");
		
	}
	
}
