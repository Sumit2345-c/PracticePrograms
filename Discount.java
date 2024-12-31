import java.util.Scanner;
public class Discount{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Item Number");
        int itemNum = s.nextInt();
        System.out.println("Enter Item Name");
        String itemName = s.next();
        System.out.println("Enter rate and quatity");
        double rate = s.nextDouble();
        int qty = s.nextInt();
        double price = rate*qty;
        double discount;
        if(price >= 1000 && price <2000)
           discount = 0.10 * price;
        else
           if(price >=2000 && price <3000)
              discount = 0.15 * price;
            else
              discount = 0.25 * price;
        double netPrice  = price - discount;
        System.out.println("Item Number ="+itemNum);
        System.out.println("Item Name ="+itemName);
        System.out.println("Price ="+price);
        System.out.println("Discount ="+discount);
        System.out.println("Net Price ="+netPrice);
    }
};