package gittest;
import java.util.ArrayList;
public class ParkingSystem implements IParking{
	int big;
	int medium;
	int small;
	ArrayList<String> st=new ArrayList<String>();
	public ParkingSystem(int big, int medium, int small) {
		this.big=big;
		this.medium=medium;
		this.small=small;
		st.add("null");
	}
	public void print() {
		System.out.println(st.toString());
	}
	public static String[] parse(String input) throws Exception {
		String str1=input;
		String[] str2=str1.split("[0123456789.]+");
		return str2;
	}
	public boolean addCar(int carType) {
		if(carType==1) {
			if(this.big>0) {
				this.big--;
				st.add("true");
				return true;
			}
			else {
				st.add("false");
				return false;
			}
		}
		else if(carType==2) {
			if(this.medium>0) {
				this.medium--;
				st.add("true");
				return true;
			}
			else {
				st.add("false");
				return false;
			}
		}
		else if(carType==3) {
			if(this.small>0) {
				this.small--;
				st.add("true");
				return true;
			}
			else {
				st.add("false");
				return false;
			}
		}
		else {
			st.add("null");
			return true;
		}
	}
	public static void main(String[] args) throws Exception{
		IParams params =IParking.parse();
		ParkingSystem ps=new ParkingSystem(params.getBig(),params.getMedium(),params.getSmall());
		ArrayList<Integer> plan=params.getPlanParking();
		for(int i=0;i<plan.size();i++){
			ps.addCar(plan.get(i));
		}
		ps.print();
	}

}
