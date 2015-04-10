//MyStack繼承ArrayList類別設計新的堆疊類別
public class MyStack extends java.util.ArrayList<Object> {
	  public boolean isEmpty() {
		    return super.isEmpty();//確認父類別的ArrayList是否為空,若堆疊是空的,則回傳true
		  }

		  public int getSize() {//回傳堆疊的元素個數
		    return size();
		  }

		  public Object peek() {//回傳堆疊頂端的元素,但不加以刪除
		    return get(getSize() - 1);
		  }

		  public Object pop() {//回傳並刪除堆疊頂端的元素
		    Object o = get(getSize() - 1);
		    remove(getSize() - 1);
		    return o;
		  }

		  public Object push(Object o) {//加一元素於堆疊頂端
		    add(o);
		    return o;
		  }

		  public int search(Object o) {//搜尋特定元素的索引值
		    return indexOf(o);
		  }

		  public String toString() {//輸出堆疊元素
		    return "stack: " + toString();
		  }
		}
