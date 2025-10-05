package Model;

public class Appetizier {
    
    private String Appetizier;
      private Double AppetizierPrice;
      

    public Appetizier(String itemName, Double itemPrice) {
        this.Appetizier = itemName;
        this.AppetizierPrice = itemPrice;
        //this.totalQuality = totalQuality;
    }

    public String getAppetizierName() {
        return Appetizier;
    }

    public Double getAppetizierPrice() {
        return AppetizierPrice;
    }

//    public int getTotalQuality() {
//        return totalQuality;
//    }

    public void setAppetizierkName(String itemName) {
        this.Appetizier = itemName;
    }

    public void setAppetizierPrice(Double itemPrice) {
        this.AppetizierPrice = itemPrice;
    }

//    public void setTotalQuality(int totalQuality) {
//        this.totalQuality = totalQuality;
//    }
         @Override
    public String toString(){
        return this.Appetizier + "\t" + this.AppetizierPrice + "\t" ;
    }
    
}
