package com.cts.basicjava;

public class Interview {
	
	public String interview(int t1,int t2) {
		
		if(t1>75&&t2>75) {
			if((t1+t2)/2>=80) {
				return "Call Letter";
			}else {
				return "Rejection Letter";
			}
		}else {
			return "Rejection Letter";
		}
	}

}
