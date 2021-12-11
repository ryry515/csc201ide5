public class Main implements DistrictConstants {
    
    public static void main(String[] args)
   {
       //initialize  for all elementary schools
       ElementarySchool auburElementary = new ElementarySchool();
       ElementarySchool belviewElementary = new ElementarySchool();
       ElementarySchool christiansburgElementary = new ElementarySchool();
       ElementarySchool eastmontElementary = new ElementarySchool();
       ElementarySchool fallinbranchElementary = new ElementarySchool();
       ElementarySchool gilbertElementary = new ElementarySchool();
       ElementarySchool hardingElementary = new ElementarySchool();
       ElementarySchool kippsElementary = new ElementarySchool();
       ElementarySchool margaretElementary = new ElementarySchool();
       ElementarySchool priceElementary = new ElementarySchool();
       ElementarySchool christiansburgPrimary = new ElementarySchool();

        // initialize all middle schools
       MiddleSchool aubrunMiddle =  new MiddleSchool();
       MiddleSchool blacksburgMiddle =  new MiddleSchool();
       MiddleSchool christansburgMiddle =  new MiddleSchool();
       MiddleSchool shawsvilleMiddle =  new MiddleSchool();

       //initialize all high schools 
       HighSchool auburnHigh = new HighSchool();
       HighSchool montgomeryCentral = new HighSchool();
       HighSchool eastmontHigh = new HighSchool();
       HighSchool christiansburgHigh = new HighSchool();
       HighSchool blacksburgHigh = new HighSchool();

       //set names for all elementary 
       auburElementary.setName("Aurburn Elementary"); 
       belviewElementary.setName("Belview Elementary");
       christiansburgElementary.setName("Christiansburg Elementary");
       eastmontElementary.setName("Eastern Montgomery Elementary");
       fallinbranchElementary.setName("Falling Branch Elementary");
       gilbertElementary.setName("Gilbert Linkous Elementary");
       hardingElementary.setName("Harding Avenue Elementary");
       kippsElementary.setName("Kipps Elementary");
       margaretElementary.setName("Margaret Beeks Elementary");
       priceElementary.setName("Price's Fork Elementary");
       christiansburgPrimary.setName("Christiansburg Primary");

       //seet names for all middle schools
       aubrunMiddle.setName("Auburn Middle");
       blacksburgMiddle.setName("Blacksburg Middle");
       christansburgMiddle.setName("Chirstiansburg Middle");
       shawsvilleMiddle.setName("Shawsville Middle");

        //set names for all high schools
       auburnHigh.setName("Auburn Middle");
       montgomeryCentral.setName("Montgomery Contral");
       eastmontHigh.setName("Eastern Montgomery High");
       christiansburgHigh.setName("Christiansburg High");
       blacksburgHigh.setName("Blacksburg High");

       //output district information
       System.out.println("Welcome to " + DISTRICT_NAME);
       System.out.println("Our Super Intendent is " + DISTRICT_SUPERINT);
       System.out.println("and you can contact us at " + DISTRICT_NUMBER);

       //display all information for all schools
       auburElementary.displaySchool();
       auburElementary.describeLevel();
       belviewElementary.displaySchool();
       belviewElementary.describeLevel();
       christiansburgElementary.displaySchool();
       christiansburgElementary.describeLevel();
       eastmontElementary.displaySchool();
       eastmontElementary.describeLevel();
       fallinbranchElementary.displaySchool();
       fallinbranchElementary.describeLevel();
       gilbertElementary.displaySchool();
       gilbertElementary.describeLevel();
       hardingElementary.displaySchool();
       hardingElementary.describeLevel();
       kippsElementary.displaySchool();
       kippsElementary.describeLevel();
       margaretElementary.displaySchool();
       margaretElementary.describeLevel();
       priceElementary.displaySchool();
       priceElementary.describeLevel();
       christiansburgPrimary.displaySchool();
       christiansburgPrimary.describeLevel();
       aubrunMiddle.displaySchool();
       aubrunMiddle.describeLevel();
       blacksburgMiddle.displaySchool();
       blacksburgMiddle.describeLevel();
       christansburgMiddle.displaySchool();
       christansburgMiddle.describeLevel();
       shawsvilleMiddle.displaySchool();
       shawsvilleMiddle.describeLevel();
       auburnHigh.displaySchool();
       auburnHigh.describeLevel();
       montgomeryCentral.displaySchool();
       montgomeryCentral.describeLevel();
       eastmontHigh.displaySchool();
       eastmontHigh.describeLevel();
       christiansburgHigh.displaySchool();
       christiansburgHigh.describeLevel();
       blacksburgHigh.displaySchool();
       blacksburgHigh.describeLevel();



   }
}


