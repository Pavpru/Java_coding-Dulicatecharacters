import java.util.*;
public class Duplicatecharacters {

	public static void main(String[] args) {
		String name="my name is prunthvinn";
		char namechar[]=name.toCharArray();
		Arrays.sort(namechar);
		int count=0;
//		System.out.println(namechar);
//		System.out.println(namechar.length);
		System.out.println("Duplicate Characters and count");
		for(int i=0;i<namechar.length-1;i++) {
			
			if(namechar[i]==namechar[i+1]) {
				if(count!=0) {
				System.out.println(namechar[i+1]+"                            "+count);
				}while(namechar[i]==namechar[i+1]) {
					
					i++;
					count++;
			
				}
				}
		}
	}
}
