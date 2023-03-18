package misc;

public class main_misc {

	public static void main(String[] args) {
		//
    int[] v = {1,1,0,0,1};
    bulbs(v,0,0);
	}
	public static int search_zero(int[] v,int idx) {
		//return the index of the left most zero
		
		for(int i = idx;i < v.length;i++){
			if(v[i] == 0){
				return i;
			}
		}
		return -1;
	}
	public static int all_on(int[]v){
		//return 1 if v is all on,0 if not
		for(int i = 0;i < v.length;i++){
			if(v[i] == 0) {
				return 0;
			}
		}
		return 1;
	}
	public static void turn_on(int[] v,int idx) {
		if(v[idx] == 0) {
			for(int i = idx;i < v.length;i++){
				if(v[i] == 1) {
					v[i] = 0;
				}
				else if(v[i] == 0) {
					v[i] =  1;
				}
			}
		}
	}
	public static void print_arr(int []v) {
		for(int i = 0;i < v.length;i++) {
			System.out.print(v[i]);
		}
		System.out.println();
	}
	public static void bulbs(int[] v,int idx,int k){
		//{0,0,0,1,0,1,0,1}
		//I will implement an algorithm that always search the 0 that is most to the left
		if(k == 0 && v[idx] == 1) {
			k--;
		}
		if(all_on(v) == 1) {
			System.out.print("Number of switches: " + k);
			return;
		}
		else {
			turn_on(v,idx);
			print_arr(v);
			bulbs(v,search_zero(v,idx+1),k+1);
		}
		
		
		
		
		
	}

}
