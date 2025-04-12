/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author Aditia Nurwansyah
 */
import java.sql.SQLException;
import java.util.Scanner;

public class TestMobil {
    public static void main(String[] args) {
        try {
            MobilOperations operations = new MobilOperations();
            Scanner scanner = new Scanner(System.in);
            int choice;
 
            do {
                System.out.println("\n--- Mobil List Menu ---");
                System.out.println("1. Add Mobil");
                System.out.println("2. View All Mobils");
                System.out.println("3. Update Mobil");
                System.out.println("4. Delete Mobil");
                System.out.println("5. Mark Mobil as Completed");
                System.out.println("0. Exit"); 
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter plat_nomor: ");
                        String plat_nomor = scanner.nextLine();
                        System.out.print("Enter merek: ");
                        String merek = scanner.nextLine();
                        System.out.println("Enter name: ");
                        String name = scanner.nextLine(); 
                        System.out.println("Enter color: ");
                        String color = scanner.nextLine();
                        operations.addMobil(new Mobil(plat_nomor, merek, name, color)); 
                        break; 
 
                    case 2:
                        System.out.println("All Mobils:");
                        operations.getMobils().forEach(System.out::println);
                        break;

                    case 3:
                        System.out.print("Enter Mobil Plat_nomor to update: ");
                        String updatePlat_nomor = scanner.next(); 
                        scanner.nextLine();
                        System.out.print("Enter new merek: ");
                        String newMerek = scanner.nextLine();
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        operations.updateMobil(updatePlat_nomor, newMerek, newName); 
                        break;

                    case 4:
                        System.out.print("Enter Mobil Plat_nomor to delete: ");
                        String deletePlat_nomor = scanner.next();
                        operations.deleteMobil(deletePlat_nomor); 
                        break;

                    case 5:
                        System.out.print("Enter Mobil Plat_nomor to mark as completed: ");
                        String completePlat_nomor = scanner.next(); 
                        operations.markAsCompleted(completePlat_nomor);
                        break;
 
                    case 0:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 0);
 
            scanner.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}