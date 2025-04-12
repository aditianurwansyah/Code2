/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author Aditia Nurwansyah
 */
public interface LibraryOperations {
     void addBook(Book book);
     void viewBooks();
     void borrowBook(int bookId, int userId);
     void returnBook(int bookId);  
     void deleteBook(int bookId); 
} 


