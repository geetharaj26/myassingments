package week1.day1;

public class Mobile {
	public void makeCall(String mobileModel, float mobileWeight) {
		System.out.println("mobileModel " +mobileModel);
		System.out.println("mobileWeight " +mobileWeight);
		}
	public void sendMsg(boolean FullCharged,int mobileCost) {
		System.out.println("FullCharged " +FullCharged);
		System.out.println("mobileCost " +mobileCost);
	}
	

	public static void main(String[] args) {
		Mobile m = new Mobile() ;
		m.makeCall("oppo",320);
		m.sendMsg(true, 10000);
		System.out.println("this is my mobile");
		
		
		

	}

}
