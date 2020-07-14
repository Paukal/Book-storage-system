/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.bookStorage.Journal;

import com.restapi.bookStorage.BaseBook;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Paul
 */
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "science_journal")
public class Journal extends BaseBook{

    @Column(name="science_index")
    private int science_index;
    
    public Journal() {
    }

    /*name, author, barcode, quantity, price per unit*/
    public Journal(String name, String  author, int bc, int quant, int price, int sc_index) {
        this.name = name;
        this.author = author;
        this.barcode= bc;
        this.quantity= quant;
        this.price= price;
        this.science_index=sc_index;
    }


    public int getIndex()
    {
        return science_index;
    }
    

    public void setIndex(int sc_index)
    {
        this.science_index=sc_index;
    }
}
