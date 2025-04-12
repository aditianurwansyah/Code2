/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author Aditia Nurwansyah
 */
public class Mobil {
    private String plat_nomor;
    private String merek;
    private String name;
    private String color;
    private boolean isCompleted;
    private String createdAt;
    
   public Mobil(String plat_nomor, String merek, String name, String color, boolean isCompleted, String createdAt){
       this.plat_nomor = plat_nomor;
       this.merek = merek;
       this.name = name;
       this.color = color;
       this.isCompleted = isCompleted;
       this.createdAt = createdAt;
   }
   
   public Mobil(String plat_nomor, String merek, String name, String color){
       this.plat_nomor = plat_nomor;
       this.merek = merek;
       this.name = name;
       this.color = color;
       this.isCompleted = true; 
   }
   
   //Getter and Setter 
   public String getPlat_nomor(){
       return plat_nomor;
   }
   public void setPlat_nomor(String plat_nomor){
       this.plat_nomor = plat_nomor;
   }
   public String getMerek(){
       return merek;
   }
   public void setMerek(String merek){
       this.merek = merek; 
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }
   public String getColor(){
       return color;
   }
   public void setColor(){
       this.color = color;
   }
   public boolean isCompleted(){
       return isCompleted; 
   } 
   public void setCompleted(boolean completed){
       isCompleted = completed; 
   }
   public String getCreatedAt(){
       return createdAt; 
   } 
   
   @Override 
   public String toString() {
        return "Todo{" +
                "Plat_nomor=" + plat_nomor +
                ", Merek='" + merek + '\'' +
                ", name='" + name + '\'' +
                ", color='"+ color + '\''+ 
                ", isCompleted=" + isCompleted +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
