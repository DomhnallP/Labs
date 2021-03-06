import java.util.*;

public class partitions {

	public static void main (String[] args){
		Scanner myscanner = new Scanner(System.in);
		int items = myscanner.nextInt();
		int[] contents = new int[items];
		for(int i=0;i<items;i++){
			contents[i]=myscanner.nextInt();
		}
		int[] solution = solve(contents);
		int subset1=0;
		int subset2=0;

		for(int i=0;i<items;i++){
			if(solution[i]==-1){
				subset1+=contents[i];
			}else if(solution[i]==1){
				subset2+=contents[i];
			}
		}
		System.out.println(Math.abs(subset1-subset2));
	}

	public static int[] solve(int[] contents){

	        int[] values=new int[contents.length];
    for(int j = 0;j<contents.length;j++){
        values[j]=contents[j];
    }
    
     for(int j = 0;j<contents.length;j++){
        values[j]=-values[j];
				}
	  Arrays.sort(values);
	  for(int j = 0;j<contents.length;j++){
            values[j]=-values[j];
					}
		int[] left=new int[contents.length];
		int[] right=new int[contents.length];

		for(int i = 0;i<contents.length;i++){
             int counterLeft=0;
			    int counterRight=0;
			if(i==0){
				left[0]=contents[i];
				values[i]=-1;
			}
			else if(i==1){
				right[1]=contents[i];
				values[i]=1;

			}
			else{
               
				for(int j = 0;j<contents.length;j++){
					counterLeft+=left[j];
					counterRight+=right[j];
					}
				}
				if(counterLeft>counterRight){
					values[i]=1;
                    right[i]=contents[i];
				}
				else if(counterRight>counterLeft){
					values[i]=-1;
                    left[i]=contents[i];
				}
			}
        for(int j = 0;j<contents.length;j++){
           System.out.println(contents[j]);
					}
		
	return values;
	}
}