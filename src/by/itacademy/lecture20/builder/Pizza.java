package by.itacademy.lecture20.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Cloneable {

    private String doughType;
    private String sauce;
    private String meat;
    private String cheese;
    private String borderType;
    private List<String> vegetables = new ArrayList<>();
    private List<String> additions = new ArrayList<>();

    public List<String> getVegetables() {
        return vegetables;
    }

    public List<String> getAdditions() {
        return additions;
    }

    public void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setBorderType(String borderType) {
        this.borderType = borderType;
    }

    public void setVegetables(List<String> vegetables) {
        this.vegetables = vegetables;
    }

    public void setAdditions(List<String> additions) {
        this.additions = additions;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("doughType='").append(doughType).append('\'');
        sb.append(", sauce='").append(sauce).append('\'');
        sb.append(", meat='").append(meat).append('\'');
        sb.append(", cheese='").append(cheese).append('\'');
        sb.append(", borderType='").append(borderType).append('\'');
        sb.append(", vegetables=").append(vegetables);
        sb.append(", additions=").append(additions);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Pizza clone() throws CloneNotSupportedException {
        return (Pizza) super.clone();
    }
}
