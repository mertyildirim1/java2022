package youTubeDemo_;

public abstract class BaseCreditDao implements CreditDao{
	public abstract void conculate();
	
	  public void save() {
		System.out.println("Kaydedildi");
	}
}
