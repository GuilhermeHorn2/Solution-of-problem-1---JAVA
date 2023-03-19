package misc;

public class main_misc {

	public static void main(String[] args) {
		//
	int[] v = {0,1,0,0,1};
	System.out.println(bulb(v));
		
	}
	public static int bulb(int[]v) {
		//
		int c = 0;
		for(int i = 0;i < v.length;i++) {
			//check if the number of flips is even
			//if is even we dont flip
			if(c % 2 == 0) {
				v[i] = v[i];
			}
			//if is not even we flip
			else if(c % 2 != 0){
				if(v[i] == 1) {
					v[i] = 0;
				}
				else if(v[i] == 0) {
					v[i] = 1;
				}
			}
			//if v[i] is 1 we dont need do do nothing
			if(v[i] == 1) {
				continue;
			}
			//if v[i] == 0 the bit must be fliped
			else {
				c++;
			}
			
			
		}
		return c;
		
	}

}
