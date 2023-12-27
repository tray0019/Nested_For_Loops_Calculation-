/**
 * 
 * @author Rustom Trayvilla
 * @version 1.2 - 09/15/23
 * @since 1.0 
 * @see
 */
public class Medals {
	/**
	 * Calculates the total amount of  
	 * medals that each countries have receive 
	 * and output them
	 * @param args no argument
	 */
   public static void main(String[] args)
   {
	   /*
	    * Constant variables to use for 'for loop'
	    * We have one for Countries and Medals
	    */
      final int COUNTRIES = 8;
      final int MEDALS = 3;
      
      /*
       * Countries in array that will 
       * be use to find out how many medals
       * each country has
       */
      String[] countries =
         {
            "Canada",
            "Italy",
            "Germany",
            "Japan",
            "Kazakhstan",
            "Russia",
            "South Korea",
            "United States"
         };
      
      /*
       * This is an array organize in rows and column 
       * by the curly braces. Inside each braces
       * has the amount of medals that each country
       * will have
       * 
       */

      int[][] counts =
         {
            { 0, 3, 0 },
            { 0, 0, 1 },
            { 0, 0, 1 },
            { 1, 0, 0 },
            { 0, 0, 1 },
            { 3, 1, 1 },
            { 0, 1, 0 },
            { 1, 0, 1 }
         };
      
      /*
       * This will be the first line that will be output by the 
       * computer. 
       * 
       */
     System.out.println("        Country    Gold  Silver  Bronze   Total");
      
     
     /*
      * The nested for loop method will output all
      * the corresponding medals for each country.
      * 
      */
     for (int i = 0; i < COUNTRIES; i++)
      {
        System.out.printf("%15s", countries[i]);
         int total = 0; 
         
       for (int j = 0; j < MEDALS; j++)
         {
            System.out.printf("%8d", counts[i][j]);
            total = total + counts[i][j];
           
         }       
        System.out.printf("%8d\n",total);        
      }
           
     	/*
     	 * This second nested for loops takes all
     	 * the counts of medal for gold,silver and bronze and
     	 * and calculate all the total amount
     	 */
      String s = "Total";    
      System.out.printf("%15s",s);
      
       for (int j = 0; j < MEDALS; j++) {
    	 int allTotal = 0;
          for(int i = 0; i < COUNTRIES; i++){
              allTotal = allTotal + counts[i][j];

          }
          /*
           * This output all the total amount of medals
           */
          System.out.printf("%8d", allTotal);
      }
       System.out.println("\n");
       System.out.println("Program by Rustom Trayvilla");
            
   	}
}

