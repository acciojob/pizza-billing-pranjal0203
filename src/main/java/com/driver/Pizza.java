package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int checkCheese=0;
    private int checkTopping=0;

    private int checkTakeAway=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price=300;
        }
        else{
            this.price=400;
        }
        this.bill = "Base Price Of The Pizza: "+getPrice()+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(checkCheese==0){
            this.price+=80;
            this.bill+= "Extra Cheese Added: 80\n";
        }

        checkCheese=1;

    }

    public void addExtraToppings(){
        // your code goes here
        if(checkTopping==0){

        if(isVeg) {
            this.price+=70;
            this.bill+="Extra Toppings Added: 70\n";
        }

        else {
            this.price+=120;
            this.bill+="Extra Toppings Added: 120\n";
        }
        }
        checkTopping=1;
    }

    public void addTakeaway(){
        // your code goes here
        if(checkTakeAway==0){
        this.price+=20;
        this.bill+="Paperbag Added: 20\n";
        }
        checkTakeAway=1;
    }

    public String getBill(){
        // your code goes here
//        this.bill = Integer.toString(this.price);
            this.bill+="Total Price: "+getPrice()+"\n";
        return this.bill;
    }
}
