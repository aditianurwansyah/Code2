/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author Aditia Nurwansyah
 */
import java.sql.SQLException;
import java.util.Scanner;

public class Test { 
    public static void main(String[] args) {
        try {
            LibrarySystem librarySystem = new LibrarySystem(); 
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nLibrary System Menu:");
                System.out.println("1. Add Book");
                System.out.println("2. View Books");
                System.out.println("3. Borrow Book");
                System.out.println("4. Return Book");
                System.out.println("5. Delete Book");
                System.out.println("6. Exit"); 
                System.out.println("\nUser System Menu:"); 
                System.out.println("7. Add User");
                System.out.println("8. view User");
                System.out.println("9. Update User");
                System.out.println("10. Delete User"); 
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter book title: ");
                        String title = scanner.next();
                        System.out.print("Enter book author: ");
                        String author = scanner.next();
                        librarySystem.addBook(new Book(0, title, author, true));
                        break;
                    case 2:
                        librarySystem.viewBooks();
                        break;
                    case 3:
                        System.out.print("Enter book ID to borrow: ");
                        int bookId = scanner.nextInt();
                        System.out.print("Enter user ID: ");
                        int userId = scanner.nextInt();
                        librarySystem.borrowBook(bookId, userId);
                        break; 
                    case 4:
                        System.out.print("Enter book ID to return: ");
                        int returnBookId = scanner.nextInt();
                        librarySystem.returnBook(returnBookId); 
                        break;
                    case 5:
                        System.out.println("Enter book ID to delete: ");
                        int deleteBookId = scanner.nextInt();
                        librarySystem.deleteBook(deleteBookId);
                        break; 
                    case 6:
                        System.out.println("Exiting...");
                        System.exit(0);
                    case 7:
                        System.out.println("Enter name: ");
                        String name = scanner.next();
                        System.out.println("Enter email: ");
                        String email = scanner.next(); 
                        librarySystem.addUser(new User(0, name, email)); 
                        break;  
                    case 8: 
                         librarySystem.viewuser();
                         break;
                    case 9:
                        System.out.println("Enter user ID to update: ");
                        int updateuserId = scanner.nextInt();
                        librarySystem.updateuser(updateuserId);
                        break;
                    case 10: 
                        System.out.println("Enter user ID to delete: ");
                        int deleteuserId = scanner.nextInt();
                        librarySystem.deleteuser(deleteuserId);
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }  
                }
            }

    
  
