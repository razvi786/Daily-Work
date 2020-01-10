package com.cts.list;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li=new ArrayList();
		
		li.add("Hello");
		li.add(2020);
		li.add("January");
		li.add(true);
		li.add(1,"Hey");
		System.out.println(li);
		System.out.println(li.size());
		li.remove("January");
		System.out.println(li);
		li.remove(0);
		System.out.println(li);
		
		ArrayList li2=new ArrayList();
		li2.add("Syed");
		li2.add(false);
		li2.addAll(li);
		System.out.println(li2);
		
		System.out.println(li2.contains(2020));
		
		Iterator i=li2.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		for(Object obj:li2) {
			System.out.print(obj+" ");
		}
		
		ListIterator lit=li2.listIterator();
		
		System.out.println();
		while(lit.hasNext()) {
			Object obj=lit.next();
			System.out.print(obj);
			if(obj.equals(2020)) {
				break;
			}
		}
		
		System.out.println();
		while(lit.hasPrevious()) {
			System.out.print(lit.previous());
		}
		
		LinkedList<Integer> ll=new LinkedList<>();
		
		ll.add(2);
		ll.add(999);
		ll.addFirst(34);
		
		System.out.println();
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
	}

}
