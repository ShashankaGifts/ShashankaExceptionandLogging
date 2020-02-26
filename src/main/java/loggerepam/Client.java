package loggerepam;

import java.util.Scanner;
import java.util.logging.Logger;


public class Client{
	private static Scanner sc;
	static Logger logger = Logger.getLogger(Logger.class.getName());

	public static void main(String args[]){	
		
		sc = new Scanner(System.in);
		
		logger.info("Enter 1 for simple and compound interest 2 for house construction cost");
		int choice = sc.nextInt(); 		
		
		if(choice == 1){
			double principle, rate, time;
			logger.info("Enter amount");
			principle=sc.nextDouble();
			logger.info("Enter the No.of years:");
			time=sc.nextDouble();
			logger.info("Enter the Rate of  interest");
			rate=sc.nextDouble();
			SimpleCompoundInterest simplecompoundinterest = new SimpleCompoundInterest();
			
			double simple_interest = simplecompoundinterest.calculatingSimpleInterest(principle,rate,time);
			double compound_interest = simplecompoundinterest.calculatingCompoundInterest(principle,rate,time);
			
			logger.info("simple interest:"+simple_interest);
			logger.info("compound interest:"+compound_interest);
		}
		
		else{
			HouseConstruction housecon = new HouseConstruction();
			logger.info("Enter 1)standard materials 2)above standard materials 3)high standard material 4)high standard material and fully automated home");
			int material = sc.nextInt();
			logger.info("enter total area");
			
			double total_area = sc.nextDouble();
			double cost = housecon.constructionCost(material,total_area);
			
			logger.info(cost+"INR");
			
		}
	}
}