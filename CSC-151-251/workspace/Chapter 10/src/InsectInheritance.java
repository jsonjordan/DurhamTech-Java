
public class InsectInheritance {

	public static void main(String[] args) {
	
		
	bumblebee b = new bumblebee();
	b.setInsectData(6, 3);
	b.setTimesSting(1);
	b.preferredFlower();
	
	System.out.printf("Bee has %d legs and %d parts and can sting %d times", b._legs, b._bodyParts, b._timesSting);
	
	
	grasshopper g = new grasshopper();
	g.setInsectData(6, 3);
	g.setJumpsPerMinute(10);
	
	
	
	}
	
	
	

}


class insect {
	int _legs;
	int _bodyParts;
	
	public void setInsectData ( int legs, int bodyParts){
		_legs = legs;
		_bodyParts = bodyParts;
}
	}
		

class bumblebee extends insect {
	public int _timesSting;
	
	public void setTimesSting ( int timesSting){
		_timesSting = timesSting;
		
	}
	public void preferredFlower(){
		System.out.println("Rose");
	}
	}


class grasshopper extends insect {
	public int _jumpsPerMinute;

	
	public void setJumpsPerMinute ( int jumpsPerMinute){
		_jumpsPerMinute = jumpsPerMinute;
}
}