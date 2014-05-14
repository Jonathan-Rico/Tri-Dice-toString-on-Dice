public class Dice {	
	private int mBounces;
	private int mDices;
	public Dice(int dices, int bounces){
		mDices = dices;
		mBounces = bounces;
}
	public int Throw(int dices, int bounces) {	
		int total = 0;
		mDices = dices;
		mBounces = bounces;		
		for (int j = bounces; j >0; j--) {
			for (int k = dices; k >0; k--){
			int die = (int) (1 + (Math.random() * 6));
			System.out.printf("Dice # %d is % d\n", k , die);
			total = total + die;
			}	
		}
		System.out.printf("Total value of each dice rolled added is %s\n", total);
		return total;
	}
	@Override
	public String toString(){
		return "Dice: " + mDices + "      Rolls per die: " + mBounces;
		
	}
}

