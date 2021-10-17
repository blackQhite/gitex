package gittest;
import java.util.ArrayList;
public class carku implements IParams{
	int Big;
	int Medium;
	int Small;
	String[] s;
	public int getBig() {
		return Big;
	}
	public int getMedium() {
		return Medium;
	}
	public int getSmall() {
		return Small;
	}
	public ArrayList<Integer> getPlanParking() {
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<s.length;i++) {
			a.add(Integer.parseInt(s[i]));
		}
		return a;
	}
}
