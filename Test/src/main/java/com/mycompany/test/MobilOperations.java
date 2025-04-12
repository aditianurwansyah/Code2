/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author Aditia Nurwansyah
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MobilOperations {
    private Connection connection;

    public MobilOperations() throws SQLException {
        connection = DatabaseConnect.getConnection(); 
    }

    // Create
    public void addMobil(Mobil mobil) { 
        String query = "INSERT INTO mobils (plat_nomor, merek, name, color) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, mobil.getPlat_nomor());
            stmt.setString(2, mobil.getMerek());
            stmt.setString(3, mobil.getName());
            stmt.setString(4, mobil.getColor()); 
            stmt.executeUpdate(); 
            System.out.println("Mobil added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read
    public List<Mobil> getMobils() { 
        List<Mobil> mobils = new ArrayList<>();
        String query = "SELECT * FROM mobils"; 
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                mobils.add(new Mobil(
                        rs.getString("plat_nomor"),
                        rs.getString("Merek"),
                        rs.getString("name"),
                        rs.getString("color"), 
                        rs.getBoolean("is_completed"),
                        rs.getString("created_at")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mobils;  
    }

    // Update
    public void updateMobil(String plat_nomor, String merek, String name) {
        String query = "UPDATE mobils SET title = ?, description = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, merek);
            stmt.setString(2, name);  
            stmt.setString(3, plat_nomor);
            stmt.executeUpdate();
            System.out.println("To-Do updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete
    public void deleteMobil(String plat_nomor) {
        String query = "DELETE FROM mobils WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, plat_nomor); 
            stmt.executeUpdate();
            System.out.println("To-Do deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Mark as Completed
    public void markAsCompleted(String plat_nomor) {
        String query = "UPDATE mobils SET is_completed = TRUE WHERE id = ?"; 
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, plat_nomor); 
            stmt.executeUpdate();
            System.out.println("To-Do marked as completed!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
