/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.bookStorage.Book;

import com.restapi.bookStorage.BaseBook;
import javax.persistence.Entity;
import javax.persistence.*;



/**
 *
 * @author Paul
 */
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "book")
public class Book extends BaseBook {

    public Book() {
    }

    /*name, author, barcode, quantity, price per unit*/
    public Book(String name, String  author, int bc, int quant, int price) {
        this.name = name;
        this.author = author;
        this.barcode= bc;
        this.quantity= quant;
        this.price= price;
    }
}

