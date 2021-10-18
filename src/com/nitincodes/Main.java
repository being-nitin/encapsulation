package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        laptop l1 = new laptop();
        l1.setPrice(500000);
    }
}
class laptop{
    int ram;
    int price;
    public void setPrice(int price){
        boolean isAdmin = true;
        if(isAdmin==false){
            System.out.println("you can not set the price:");
        }
        else{
            this.price = price;
            System.out.println(price);
        }
    }

}
/* if you will notice that, we have restricted the access of updating the price that only admin can do it
thats the beauty of encapsulation which is used for the security purpose with getters and setters method:
 */

