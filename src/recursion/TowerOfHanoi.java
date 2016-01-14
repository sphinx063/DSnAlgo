package recursion;

public class TowerOfHanoi {

	private int towerSize;
	public TowerOfHanoi(int towerSize){
		this.towerSize = towerSize;
	
	}
	
	
	public void moveTowerOfHanoi(int size,String fromPole,String intermediatePole,String toPole){
		if(size == 1){
			moveDisk(fromPole,toPole);
			return;
		}
		else{
			moveTowerOfHanoi(size-1 ,fromPole,toPole,intermediatePole);
			moveDisk(fromPole,toPole);
			moveTowerOfHanoi(size-1,intermediatePole,fromPole,toPole);
		}
		
	}
	public void moveDisk(String fromPole,String toPole){
		System.out.println("Moving disk from "+fromPole+" to "+toPole);
	}
}
