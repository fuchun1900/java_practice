package MiddleClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MiddleListTest {
	public final static int number = 500;
	
	public static void insertLast(List<Integer>l, String type) {
		long total = 1000 * 100;
		long start = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			l.add(number);
		}
		long end = System.currentTimeMillis();
		System.out.printf("在 %s最后面插入%d条数据，总耗时 %d毫秒\n",type,total,end - start);
	}
	
	public static void inserMiddle(List<Integer>l, String type) {
		long total = 1000 * 100;
		long count = total;
		long start = System.currentTimeMillis();
		while(count > 0) {
			int index = (int)((l.size() -1)/2);  //中间位置
			l.add(index,number);
			--count;
		}
		long end = System.currentTimeMillis();
		System.out.printf("在 %s中间插入%d条数据，总耗时 %d毫秒\n",type,total,end - start);
	}
	
	public static void main(String args[]) {
		List<Integer>testlist = new ArrayList<Integer>();
		System.out.print("测试ArrayList: ");
		insertLast(testlist,"ArrayList");
		inserMiddle(testlist,"ArrayList");
		testlist = new LinkedList<Integer>();
		System.out.print("测试LinkedList: ");
		inserMiddle(testlist,"LinkedList");
		insertLast(testlist,"LinkedList");
	}

}
