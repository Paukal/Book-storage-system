/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.bookStorage.AntiqueBook;

import com.restapi.bookStorage.BaseBook;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Paul
 */
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "antique_book")
public class AntiqueBook extends BaseBook{
     
    @Column(name="release_year")
    private int release_year;

    public AntiqueBook() {
    }

    /*name, author, barcode, quantity, price per unit*/
    public AntiqueBook(String name, String  author, int bc, int quant, int price, int rel_year) {
        this.name = name;
        this.author = author;
        this.barcode= bc;
        this.quantity= quant;
        this.price= price;
        this.release_year= rel_year;
    }

    public int getYear()
    {
        return release_year;
    }
    

    public void setYear(int rel_year)
    {
        this.release_year=rel_year;
    }
}
