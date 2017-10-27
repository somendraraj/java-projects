package com.java.strings;

public class CircularMove {
	
	public static void main(String args[]){
		String str = "MMRMMRMMRMM";
		System.out.println(isCircularMove(str));
	}
	
	private static boolean isCircularMove(String str){
		char[] ch = str.toCharArray();
		int x = 0, y = 0; //initial position
		char dir = 'N'; //initial direction is north
		for(int i=0;i<str.length();i++){
			switch(ch[i]){
			case 'M':
				if(dir == 'N')
					y++;
				else if (dir == 'S')
					y--;
				else if (dir == 'E')
					x++;
				else if (dir == 'W')
					x--;
				break;
			case 'L':
				if(dir=='N')
					dir = 'W';
				else if(dir == 'W')
					dir = 'S';
				else if (dir == 'S')
					dir = 'E';
				else if (dir == 'E')
					dir = 'N';
				break;
			case 'R':
				if(dir=='N')
					dir = 'E';
				else if(dir == 'E')
					dir = 'S';
				else if (dir == 'S')
					dir = 'W';
				else if (dir == 'W')
					dir = 'N';
				break;
			
			}
		}
		//System.out.println(x+" "+y);
		return (x==0 && y==0);
	}

}
