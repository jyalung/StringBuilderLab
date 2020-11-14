/**
   Represents time in hours and minutes using
   the customary conventions.
*/

public class Time
{
   private int hours;         // Conventional hours
   private int minutes;       // Conventional minutes
   private boolean afternoon; // Flag for afternoon

   /**
      Constructs a cutomary time (12 hours, am or pm)
      from a military time ##:##
      @param militaryTime Time in the military
             format ##:##
   */

   public Time(String militaryTime)
   {
      // Check to make sure something was entered
      if (militaryTime == null)
      {
         System.out.println(militaryTime +
                            " is not a " +
                            "valid miliary time." );
      }
      // Check to make sure there are 5 characters
      else if (militaryTime.length() != 5)// CONDITION TO CHECK LENGTH OF STRING)
      {
         System.out.println(militaryTime +
                            " is not a " +
                            "valid miliary time." );
      }
      else
      {
         // Check to make sure the colon is in
         // the correct spot
         if (militaryTime.charAt(2) != ':')//CONDITION TO CHECK COLON POSITION)
         {
            System.out.println(militaryTime +
                               " is not a " +
                               "valid miliary time." );
         }
         // Check to make sure all other characters
         // are digits
         else if (!Character.isDigit(militaryTime.charAt(0)))// CONDITION TO CHECK FOR DIGIT)
         {
            System.out.println(militaryTime +
                               " is not a " +
                               "valid miliary time." );
         }
         else if (!Character.isDigit(militaryTime.charAt(1)))// CONDITION TO CHECK FOR DIGIT)
         {
            System.out.println(militaryTime +
                               " is not a " +
                               "valid miliary time." );
         }
         else if (!Character.isDigit(militaryTime.charAt(3)))//CONDITION TO CHECK FOR DIGIT)
         {
            System.out.println(militaryTime +
                               " is not a " +
                               "valid miliary time." );
         }
         else if (!Character.isDigit(militaryTime.charAt(4)))//CONDITION TO CHECK FOR DIGIT)
         {
            System.out.println(militaryTime +
                               " is not a " +
                               "valid miliary time." );
         }
         else
         {
            // SEPARATE THE STRING INTO THE HOURS
            // AND THE MINUTES, CONVERTING THEM TO
            // INTEGERS AND STORING INTO THE
            // INSTANCE VARIABLES
        	 String[] hoursMin = militaryTime.split(":");
            // Validate hours and minutes are valid values
        	hours = Integer.parseInt(hoursMin[0]);
        	minutes = Integer.parseInt(hoursMin[1]);
        	
            if(hours > 23)
            {
               System.out.println(militaryTime +
                                  " is not a " +
                                  "valid miliary time." );
            }
            else if(minutes > 59)
            {
               System.out.println(militaryTime +
                                  " is not a " +
                                  "valid miliary time." );
            }
            // Convert military time to conventional time
            // for afternoon times
            else if (hours > 12)
            {
               hours = hours - 12;
               afternoon = true;
               System.out.println(this.toString());
            }
            // Account for midnight
            else if (hours == 0)
            {
               hours = 12;
               System.out.println(this.toString());
            }
            // Account for noon
            else if (hours == 12)
            {
               afternoon = true;
               System.out.println(this.toString());
            }
            // Morning times do not need converting
            else
            {
               System.out.println(this.toString());
            }
         }
      }
   }

   /**
      The toString method returns a conventional time.
      @return A conventional time with am or pm.
   */
   public String toString()
   {
      String am_pm;
      String zero = "";

      if (afternoon)
         am_pm = "PM";
      else
         am_pm = "AM";
      if (minutes < 10)
         zero = "0";

      return hours + ":" + zero + minutes + " " + am_pm;
   }
}