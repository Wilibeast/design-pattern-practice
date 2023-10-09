package org.example;

import org.example.command.BuyStock;
import org.example.command.SellStock;
import org.example.invoker.Broker;
import org.example.model.Stock;

public class Main {
    public static void main(String[] args) {
        var alphabetIncStock = new Stock("Alphabet Inc.",10);
        var appleStock = new Stock("Apple", 0);

        var broker = new Broker();

        var alphabetIncBuyOrder = new BuyStock(alphabetIncStock);
        var alphabetIncSellOrder = new SellStock(alphabetIncStock);

        var appleBuyOrder = new BuyStock(appleStock);
        var appleSellOrder = new SellStock(appleStock);


        System.out.println("Taking order to buy stock");
        broker.takeOrder(alphabetIncBuyOrder);

        System.out.println("Taking another order to buy stock");
        broker.takeOrder(alphabetIncBuyOrder);

        System.out.println("Taking another order to sell stock");
        broker.takeOrder(alphabetIncSellOrder);

        System.out.println("Taking order to buy more stock");
        broker.takeOrder(alphabetIncBuyOrder);

        System.out.println("Taking order to buy other stock");
        broker.takeOrder(appleBuyOrder);

        System.out.println("Taking order to sell other stock");
        broker.takeOrder(appleSellOrder);

        System.out.println("Placing orders\n");

        broker.placeOrders();
    }
}