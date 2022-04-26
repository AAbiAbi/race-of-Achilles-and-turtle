public class race{
	 public static void main(String[] args) {
	 	String a = "Achilles";
	 	String t = "tortoise";
	 	double aPos = 0;
	 	double tPos = 100;
	 	int aSpeed = 20;
	 	int tSpeed = 10;
	 	double time = 0;
	 	while(aPos < tPos){
	 		System.out.println("" + a + "at the position" + aPos);
	 		System.out.println("" + t + "at the position" + tPos);
	 		double Reach_Time = (tPos - aPos)/aSpeed;
	 		time = time + Reach_Time;
	 		aPos = aPos + aSpeed * Reach_Time;
	 		tPos = tPos + tSpeed * Reach_Time;



	 	}
		
	}
}