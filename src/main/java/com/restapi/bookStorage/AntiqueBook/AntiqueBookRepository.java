/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.bookStorage.AntiqueBook;

import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Paul
 */

// This will be AUTO IMPLEMENTED by Spring into a Bean called bookRepository
// CRUD refers Create, Read, Update, Delete

public interface AntiqueBookRepository extends CrudRepository<AntiqueBook, Integer> {
    
}


