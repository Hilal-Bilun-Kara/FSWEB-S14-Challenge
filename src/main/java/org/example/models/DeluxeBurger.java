package org.example.models;

import org.example.enums.BreadRollType;
import org.example.enums.CipsType;
import org.example.models.Hamburger;

public class DeluxeBurger extends Hamburger{

    private Drink drink;
    private Cips cips;

    public DeluxeBurger( BreadRollType breadRollType, Cips cips, Drink drink) {
        super("Deluxe Burger","Double",20.10, breadRollType);
        this.cips = cips;
        this.drink = drink;
    }

    public Drink getDrink() {
        return drink;
    }

    public Cips getCips() {
        return cips;
    }

    //Parenttakini override edersem ekleme yapabilir, o yüzden mesaj yazdır.
    @Override
    public void addAddition(String name, double price) {
        System.out.println("Delux Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder deluxeBurgerStringBuilder =  new StringBuilder();
        deluxeBurgerStringBuilder.append("Drink:" + drink.getDrinkType() + "\n");
        deluxeBurgerStringBuilder.append("Cips:" + cips.getCipsType() + "\n");
        System.out.println(deluxeBurgerStringBuilder);
        super.itemizeHamburger();
    }
}
