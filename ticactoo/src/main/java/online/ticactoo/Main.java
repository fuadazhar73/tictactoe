package online.ticactoo;

import java.util.Scanner;

import javax.swing.SwingUtilities;

public class Main {
	 
    public static final int GRID = 3;
 
    public static void main(String[] args) {
    	 SwingUtilities.invokeLater(new Runnable() {
             public void run() {
            	 Scanner scanner = new Scanner(System.in);
            	 System.out.println("Enter number of ROW Column Do you want to use you only can enter 3-9");
            	 String input = scanner.next();
            	 loop:
            		 while (true) {
            			 try {
            				 switch (Integer.parseInt(input)) {
                        	 case 3:
                        		 System.out.println("You Only can win if can make 3 in row, or 3 in column, or 3 on diagonal");
                        		 new TTTGraphics2P();
                        		 break loop;
                        	 case 4:
                        		 System.out.println("You Only can win if can make 4 in row, or 4 in column, or 4 on diagonal");
                        		 new T4Graphics2P();
                        		 break loop;
                        	 case 5:
                        		 System.out.println("You Only can win if can make 5 in row, or 5 in column, or 5 on diagonal");
                        		 new T5Graphics2P();
                        		 break loop;
                        	 case 6:
                        		 System.out.println("You Only can win if can make 6 in row, or 6 in column, or 6 on diagonal");
                        		 new T6Graphics2P();
                        		 break loop;
                        	 case 7:
                        		 System.out.println("You Only can win if can make 7 in row, or 7 in column, or 7 on diagonal");
                        		 new T7Graphics2P();
                        		 break loop;
                        	 case 8:
                        		 System.out.println("You Only can win if can make 8 in row, or 8 in column, or 8 on diagonal");
                        		 new T8Graphics2P();
                        		 break loop;
                        	 case 9:
                        		 System.out.println("You Only can win if can make 9 in row, or 9 in column, or 9 on diagonal");
                        		 new T9Graphics2P();
                        		 break loop;
                        	 }
            				 
            			 }catch (Exception e) {
            	            }
            		 }
             }
          });
}
}
