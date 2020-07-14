/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.bookStorage;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Paul
 */
@MappedSuperclass
public abstract class BaseBook implements Serializable {
    
    @Column(name="barcode")
    @Id protected int barcode;
    
    @Column(name="name")
    protected String name;
    
    @Column(name="author")
    protected String author;
    
    @Column(name="quantity")
    protected int quantity;
    
    @Column(name="price")
    protected int price;
    

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public long getBarcode() {
        return barcode;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getPrice() {
        return price;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    public void setAuthor(String author) {
        this.author=author;
    }
    public void setBarcode(int barcode) {
        this.barcode=barcode;
    }
    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }
    public void setPrice(int price) {
        this.price=price;
    }
}
