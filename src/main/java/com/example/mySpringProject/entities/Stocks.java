package com.example.mySpringProject.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "STOCKS")
public class Stocks {
    
    //creating a model 
    //add additonal stock fields later 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 
   
    @Column(name="NAME")
    private String name;
    
    @Column(name="SYMBOL")
    private String symbol; 
    
    @Column(name="QUANTITY")
    private Integer quantity; 

    @Column(name="Has_Stock") 
    private boolean hasStock;
    
    //Contructor
    public  Stocks(String name, String symbol, Integer quantity, boolean hasStock) {
      this.name = name; 
      this.symbol = symbol;
      this.quantity = quantity; 
      this.hasStock = hasStock; 
  }
    

    //getters and setters 
    public Integer getId() {
        return this.id;
      }
    
      public void setId(Integer id) {
        this.id = id;
      }
    
      public String getName() {
        return this.name;
      }
    
      public void setName(String name) {
        this.name = name;
      }

      public String getSymbol() {
        return this.symbol;
      }
    
      public void setSymbol(String symbol) {
        this.name = symbol;
      }
    
      public Integer getQuantity() {
        return this.quantity;
      }
    
      public void setQuantity(Integer quantity) {
        this.quantity = quantity;
      }


      public Boolean gethasStock() {
        return this.hasStock; 
      }

      public void sethasStock(boolean hasStock) {
        this.hasStock = hasStock; 
      }



}
