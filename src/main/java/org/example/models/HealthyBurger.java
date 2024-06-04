package org.example.models;

import org.example.enums.BreadRollType;
import org.example.models.Hamburger;

public class HealthyBurger extends Hamburger{

    private Addition healtyAddition1;
    private Addition healtyAddition2;

    public HealthyBurger(String name,  double price, BreadRollType breadRollType) {
        super(name,"Tofu", price, breadRollType);
    }

    public Addition getHealtyAddition1() {
        return healtyAddition1;
    }

    public Addition getHealtyAddition2() {
        return healtyAddition2;
    }

    @Override
    public void addAddition(String name, double price) {
        if(healtyAddition1 == null){
            healtyAddition1 = new Addition(name, price);
            setPrice(getPrice() + getHealtyAddition1().getPrice());
        }
        else if (healtyAddition2 == null){
            healtyAddition2 = new Addition(name, price);
            setPrice(getPrice() + getHealtyAddition2().getPrice());
        }
        else{
            System.out.println("2'den fazla malzeme eklenemez");
        }
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder healthyBurgerStringBuilder = new StringBuilder();
        if(healtyAddition1 != null){
            healthyBurgerStringBuilder.append("HealthyAddition1:" + getHealtyAddition1().getName() + "\n");
            setPrice(getPrice() + healtyAddition1.getPrice());
        }

        if(healtyAddition2 != null){
            healthyBurgerStringBuilder.append("HealthyAddition2:" + getHealtyAddition2().getName() + "\n");
            setPrice(getPrice() + healtyAddition2.getPrice());
        }

        System.out.println(healthyBurgerStringBuilder);
        super.itemizeHamburger();
    }
}
