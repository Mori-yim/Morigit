import java.sql.*; 
public class ConnexionBD { 
    public static void main(String[] args) { 
        String url = "jdbc:mysql://localhost:3306/ecole"; 
        String user = "root"; String password = ""; 
        try { 
            Connection conn = DriverManager.getConnection(url, user, password); 
            System.out.println("Connexion réussie !"); 
            conn.close(); 
        } catch (SQLException e) { 
            System.out.println("Erreur : " + e.getMessage()); 
            } 
            
    } 
} 