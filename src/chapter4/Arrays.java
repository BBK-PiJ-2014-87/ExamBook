package chapter4;

public class Arrays {
	int[][] arr;
	String name;
	
	public Arrays(String name, int i, int j){
		this.name = name;
		arr = new int[i][j];
	}
	
	public void initialize(){
		int start = 100;		
		for (int i= 0; i<this.arr.length; i++){			
			for( int j=0; j <this.arr[i].length; j++){
				arr[i][j] = start+j+1;
			}
			start = start + 100;
		}
	}
	
	public String printOneArray2(int[] array){
		String result = "";
		int comma = 0;
		for (int i : array){
			result = result +i;
			if (comma < array.length-1){
				result += ",";
				comma++;
			}
		}
		return result;
		
	}
	
	public String printOneArray(int[] array){
		String result = "";
		for (int i : array){
			result = result +"{"+ i +"}";			
		}
		return result;
	}
	
	@Override
	public String toString(){
		String result = "";
		for(int[] i : this.arr){
			result = result + "[" + printOneArray2(i) + "]\n";		
		}
		return result;
	}

}
