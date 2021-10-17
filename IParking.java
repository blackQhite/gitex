package gittest;
import java.util.Scanner;
public interface IParking {
	public void print() ;
	public boolean addCar(int carType);
	public static IParams parse() throws Exception {
		String s1[]=new String[3];
		String s2[]=new String[4];
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2[]=str1.split("[\\p{Punct}]+");
		carku c=new carku();
		for(int i=1;i<str2.length;i++) {
			if(i<4) {
				s1[i-1]=str2[i];
			}
			else {
				s2[i-4]=str2[i];
			}
		}
		c.Big=Integer.parseInt(s1[0]);
		c.Medium=Integer.parseInt(s1[1]);
		c.Small=Integer.parseInt(s1[2]);
		c.s=s2;
		s.close();
		return c;
	}
}
