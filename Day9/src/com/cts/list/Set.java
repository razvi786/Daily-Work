package com.cts.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			HashSet<String> hs=new HashSet<String>();
			
			hs.add("Syed");
			hs.add("Ehsan");
			hs.add("Ali");
			
			System.out.println(hs);
			
			LinkedHashSet<String> lhs=new LinkedHashSet<>();
			
			lhs.add("Syed");
			lhs.add("Ehsan");
			lhs.add("Ali");
			
			System.out.println(lhs);
			
			TreeSet<String> ts=new TreeSet<>();
			
			ts.add("Welcome");
			ts.add("To");
			ts.add("Arich");
			ts.add("Infotech");
			
			System.out.println(ts);
			
			PriorityQueue<Integer> pq=new PriorityQueue<>();
			
			pq.add(10);
			pq.add(20);
			pq.add(15);
			pq.add(200);
			pq.add(125);
			pq.add(79);
			
			System.out.println(pq);
			
			System.out.println(pq.peek());
			System.out.println(pq);

			System.out.println(pq.poll());
			System.out.println(pq);
			
			System.out.println(pq.poll());
			System.out.println(pq);
			
			System.out.println(pq.poll());
			System.out.println(pq);
			
			System.out.println(pq.poll());
			System.out.println(pq);
			
			System.out.println(pq.poll());
			System.out.println(pq);

			System.out.println(pq.poll());
			System.out.println(pq);

			System.out.println(pq.peek());
			System.out.println(pq.poll());
			System.out.println(pq.element());
			
	}

}
