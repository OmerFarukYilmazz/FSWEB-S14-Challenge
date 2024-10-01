package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name ;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat,  Double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.price += addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.price += addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.price += addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        this.addition4Price += addition4Price;
    }

    public double itemizeHamburger(){
        System.out.println(toString());
        return this.price;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", breadRollType='" + breadRollType + '\'' +
                ", price=" + price +
                ", addition1Name='" + addition1Name + '\'' +
                ", addition2Name='" + addition2Name + '\'' +
                ", addition3Name='" + addition3Name + '\'' +
                ", addition4Name='" + addition4Name + '\'' +
                ", addition1Price=" + addition1Price +
                ", addition2Price=" + addition2Price +
                ", addition3Price=" + addition3Price +
                ", addition4Price=" + addition4Price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public Double getPrice() {
        return price;
    }
}
