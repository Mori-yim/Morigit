package models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Hopital {

    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Personnel> personnels = new ArrayList<>();

    public void ajouterPatient(Patient patient){
      patients.add(patient);
    }
    public  void ajouterPersonnel(Personnel personnel){
        personnels.add(personnel);
    }

    public void assignerMedecin(String numDossier, String matricule) {
        Patient pat = null;
        Medecin med = null;

        for (Patient p : patients) {
            if (p.getNumeroDossier().equals(numDossier)) {
                pat = p;
                break;
            }
        }

        for (Personnel pers : personnels) {
            if (pers instanceof Medecin && pers.getMatricule().equals(matricule)) {
                med = (Medecin) pers;
                break;
            }
        }

        if (pat != null && med != null) {
            pat.setMedecinAffecte(med);
            med.ajouterPatient(pat);
            System.out.println("Affectation réussie !");
        } else {
            System.out.println("Erreur : Patient ou Médecin introuvable !");
        }
    }

    public void afficherTout() {
        System.out.println("=== Patients ===");
        for (Patient p : patients) {
            p.afficherInfos();
        }

        System.out.println("\n=== Personnels ===");
        for (Personnel p : personnels) {
            p.afficherContrat();
        }
    }

    public void sauvegarder(String nomFichier) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomFichier))) {
            for (Patient p : patients) {
                bw.write(p.toString() + "\n");
            }
            for (Personnel p : personnels) {
                bw.write(p.toString() + "\n");
            }
            System.out.println("Données sauvegardées !");
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde : " + e.getMessage());
        }
    }

}

