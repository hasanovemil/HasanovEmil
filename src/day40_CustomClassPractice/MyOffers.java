package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
       Offer offer1 = new Offer();
       Offer offer2 = new Offer();
       Offer offer3 = new Offer();
       Offer offer4 = new Offer();
       Offer offer5 = new Offer();
       Offer offer6 = new Offer();
       Offer offer7 = new Offer();

       offer1.setOfferInfo(1000,"VA",true,true,true,"Scientist",true);
       offer2.setOfferInfo(2000,"VA",true,true,true,"Manager",true);
       offer3.setOfferInfo(3000,"VA",true,true,true,"A",true);
       offer4.setOfferInfo(4000,"Ganca",true,true,true,"B",true);
       offer5.setOfferInfo(5000,"California",true,true,true,"C",true);
       offer6.setOfferInfo(6000,"Barda",true,true,true,"D",true);
       offer7.setOfferInfo(7000,"Shamaxi",true,true,true,"F",true);

       ArrayList<Offer> jobOffers =  new ArrayList<>();
       jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));

       for(Offer each: jobOffers){
          each.getOfferInfo();
       }

      // jobOffers.removeIf(p -> p.salary < 4000);
       // System.out.println("Number of offers: " + jobOffers.size());

      //  jobOffers.removeIf( p -> p.salary < 4000 || ! p.state.equals("VA"));
      // System.out.println("Number of offers: " + jobOffers.size());





    }
}
