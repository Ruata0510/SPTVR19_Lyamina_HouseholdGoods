package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {
    private String name;
    private String surname;
    private String phone;
    private int money;
    private List<Product> listProducts = new ArrayList<>();

    public Person(String name, String surname, String phone, int money) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        if (listProducts.size() == 0) {
            return name + " " + surname + " (" + money + "$)";
        } else {
            return name + " " + surname + " (" + money + "$ | " + listProducts + " )";
        }
    } 

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }
    
    
}