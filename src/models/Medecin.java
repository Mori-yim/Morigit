package models;

<<<<<<< HEAD
public class Medecin extends  Personnel{

    private String specialite;
    public Medecin(String nom, String prenom, int age, String matricule, String specialite) {
        super(nom, prenom, age, matricule);
        this.specialite=specialite;
    }

    @Override
    public void afficherRoles() {
        System.out.println("Je suis un medecin specialise en: "+this.specialite);
    }
    public void afficherInfos(){
        super.afficherInfos();
        afficherRoles();
=======
import java.util.ArrayList;

public class Medecin extends Personnel{

    private String specialite;
    private ArrayList<Patient> patients;

    public Medecin(String nom, String prenom, int age, String matricule, double salaireDeBase, String specialite) {
        super(nom, prenom, age, matricule, salaireDeBase);
        this.specialite = specialite;
        this.patients = new ArrayList<>();
    }

    public void ajouterPatient(Patient p) {
        patients.add(p);
    }

    @Override
    public double calculerSalaire() {
        return salaireDeBase+1000*patients.size();
    }
    public void afficherContrat() {
        System.out.println("Médecin spécialisé en " + specialite + ", Salaire: " + calculerSalaire());
>>>>>>> 290b811 (Gestion hopital complet)
    }
}
