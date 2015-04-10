import java.util.Scanner;
public class ArrayListHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);//create a scanner
		    
		    MyStack stack = new MyStack();//宣告mystack類別
		   		    
		    for (int i = 0; i < 5; i++)//連續輸入五個字串元素
		    { 
		    	System.out.println("請輸入第"+(i+1)+"個元素" );
		     	stack.push(input.nextLine());//把元素放在堆疊陣列,從頂端開始,索引值0~4
		    }
		    
		    System.out.println(stack.getSize() + " strings are: ");//輸出字串陣列的大小
		    while (!stack.isEmpty())//確認堆疊是否為空
		      System.out.println(stack.pop());//如果堆疊不為空,將輸入的五個字串以相反順序顯示,美輸出一個元素就回傳並刪除堆疊頂端的元素
	}

}
