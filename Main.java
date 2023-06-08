
import java.util.Scanner;
import java.time.LocalTime;

public class Main
{
	public static void main(String[] args) {
		MinMAx();
		BinaryArray();
		Time();
	}
	
	
	public static void MinMAx(){
	    int arr[] = {4,6,32,12,1,45,11};
	    int min = arr[0];
	    int max = arr[0];
	    for (int i = 0; i < arr.length;i++){
	        if(arr[i] > max){
	            max = arr[i];
	        }
	         else if (arr[i] < min){
	            min = arr[i];
	        }      
	    }
	    System.out.print("Max = "+max+"\n"+"Min = "+min+"\n");
	}
	
	
	 public static void BinaryArray() {
	     int size = 4;
        int[][]binArr = new int [size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(i == j){
                    binArr[i][j] = 1;
                }
                else{
                    binArr[i][j] = 0;
                }
                System.out.print(" "+binArr[i][j]);
        }
        System.out.println();
    }
}

      public static void Time() {
        Scanner in = new Scanner(System.in, "866");
        System.out.print("Введите Ваше имя: ");
        String Name = in.next();
        String s1;
        int Hour = LocalTime.now().getHour();
        if (Hour == 23 || Hour < 5)
            s1 = "Доброй ночи";
        else if (Hour < 12)
            s1 = "Доброе утро";
        else if (Hour < 18)
            s1 = "Добрый день";
        else
            s1 = "Добрый вечер";
        System.out.println(Name);
        System.out.println(s1 + ", " + Name + "!");
        in.close();
    }

}
