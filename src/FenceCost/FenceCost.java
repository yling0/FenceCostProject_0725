package FenceCost;

import java.util.Scanner;

public class FenceCost {
	

	    public static void main(String[] args){
	    	
	        double perimeter; double cost = 0;
	        
	        int nGates;
	        int fenceType;
	        
	        do {
	            System.out.println("Enter your perimeter of yard (in foot):");
	            Scanner input = new Scanner(System.in);
	            perimeter = input.nextDouble();
	        } while (perimeter <= 0);
	        
	        do {
	            System.out.println("Enter your fence type (1 for wooden or 2 for chain-link):");
	            Scanner input = new Scanner(System.in);
	            fenceType = input.nextInt();
	        } while (fenceType != 1 && fenceType != 2);
	        
	        do {
	            System.out.println("Enter the total number of gates ([1,3]):");
	            Scanner input = new Scanner(System.in);
	            nGates = input.nextInt();
	        } while (nGates < 1 || nGates > 3);
	        
	        if (fenceType == 1) {
	            cost = (25*perimeter + nGates*150)*(1 + 0.06) + 50;
	        
	        } else {
	            cost = (15*perimeter + nGates*150)*(1 + 0.06) + 50;
	            
	        }
	        
	        System.out.println("The cost of fencing your yard is " + cost);
	        
	    }
	}
