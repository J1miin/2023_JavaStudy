package Bpg434_Q1;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorPr {
	private Vector<Integer> v;
	private Iterator<Integer> it;
	
	public VectorPr() {
		v = new Vector<Integer>();
		it = v.iterator();
	}
	
	public void addNumtoVector(Scanner scanner) {
		int inputNum;
		
		while (true) {
			System.out.print("정수 >> ");
			inputNum = scanner.nextInt();
		
			if(inputNum==-1) {
				break;
			}else {
				v.add(inputNum);
			}
		}
	}
	
	public int maxNum() {
		it = v.iterator(); 
		//벡터에 요소를 추가했으니까, 이터레이터를 이용할 때도 초기화해줘야 한다.**
		
		int iVectorNum;
		int iMax =-1;
		
		while(it.hasNext()) {
			iVectorNum=it.next();
			if(iMax<iVectorNum) {
				iMax= iVectorNum;
			}
		}
		return iMax;
	}
	


}
