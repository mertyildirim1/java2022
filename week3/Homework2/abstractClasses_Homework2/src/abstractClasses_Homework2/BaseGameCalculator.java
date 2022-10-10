package abstractClasses_Homework2;

public abstract class BaseGameCalculator {
	public abstract void hesapla();

	public final void gameOver() { // final --> override edilemez.
		System.out.println("Oyun bitti");
	}
}
