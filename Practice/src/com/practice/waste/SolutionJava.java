package com.practice.waste;

import java.util.Scanner;

public class SolutionJava {
	static int winningLotteryTicket(String[] tickets,int n) {
		boolean value=false;
	String[] pattern=new String[10];
			int l=0;
		int p=0;
		int m=0;
	//	String pattern="0123456789";
		 pattern[0]=".{0,}";
		 pattern[1]=".{1,}";
		 pattern[2]=".{2,}";
		 pattern[3]=".{3,}";
		 pattern[4]=".{4,}";
		 pattern[5]=".{5,}";
		 pattern[6]=".{6,}";
		 pattern[7]=".{7,}";
		 pattern[8]=".{8,}";
		 pattern[9]=".{9,}";
		String [] joint=new String[50];
		for(int i=0;i<n;i++) {
			p++;
			for(int j=i+1;j<=n-p;j++) {
				 joint[l]=tickets[i]+tickets[j];
				for(int y=0;y<=9;y++) {
				value=joint[l].matches(pattern[8]);
				if(!value) {
				break;
				}
				}
				if(value==true) {
					m++;
					System.out.println(joint[l]);
				}
				 l++;
			}
		}
		
		return m;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] tickets = new String[n];
        for(int tickets_i = 0; tickets_i < n; tickets_i++){
            tickets[tickets_i] = in.next();
        }
        int result = winningLotteryTicket(tickets,n);
        System.out.println("value:  "+result);
        in.close();
    }

}
