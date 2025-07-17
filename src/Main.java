<<<<<<< HEAD
import models.Infirmier;
import models.Medecin;
import models.Patient;
import models.Personnel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Patient[] tabPatient = new Patient[5];
        tabPatient[0] = new Patient("Morj","junior",18,"N005","cholera");
        tabPatient[1] = new Patient("Maio","julio",8,"N0009","grippe");

        Personnel[] tabPersonnel = new Personnel[5];

         tabPersonnel[0] = new Medecin("Docti","Martin",50,"18S95678","Gynecologie");
         tabPersonnel[1] = new Medecin("Doco","Marthe",57,"18S95678","Chirugie");
         tabPersonnel[2] = new Medecin("Alain","Marc",40,"18S95690","Ophtamologie");

         tabPersonnel[3] = new Infirmier("Mrinh","Stella",36,"20S78994","Maternite");
         tabPersonnel[4] = new Infirmier("Mrinh","Stella",36,"20S78994","Maternite");



        for(int i=0;i<tabPersonnel.length;i++){
           tabPersonnel[i].afficherInfos();
       }

       for(int i=0;i<tabPatient.length;i++){
           tabPatient[i].afficherInfos();
       }



    }
=======
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import models.*;

import java.util.Scanner;
public class Main {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
            public static void main(String[] args) {
                Hopital hopital = new Hopital();
                Scanner sc = new Scanner(System.in);
                int choix;

                do {
                    System.out.println("\n--- Menu ---");
                    System.out.println("1. Ajouter patient");
                    System.out.println("2. Ajouter personnel");
                    System.out.println("3. Assigner médecin à patient");
                    System.out.println("4. Afficher tout");
                    System.out.println("5. Sauvegarder");
                    System.out.println("6. Quitter");
                    System.out.print("Choix: ");
                    choix = sc.nextInt();
                    sc.nextLine();

                    switch (choix) {
                        case 1:
                            System.out.print("Nom: "); String nom = sc.nextLine();
                            System.out.print("Prénom: "); String prenom = sc.nextLine();
                            System.out.print("Âge: "); int age = sc.nextInt(); sc.nextLine();
                            System.out.print("Numéro dossier: "); String numD = sc.nextLine();
                            System.out.print("Maladie: "); String maladie = sc.nextLine();
                            hopital.ajouterPatient(new Patient(nom, prenom, age, numD, maladie));
                            break;
                        case 2:
                            System.out.print("Type (medecin/infirmier/admin): ");
                            String type = sc.nextLine();
                            System.out.print("Nom: "); nom = sc.nextLine();
                            System.out.print("Prénom: "); prenom = sc.nextLine();
                            System.out.print("Âge: "); age = sc.nextInt(); sc.nextLine();
                            System.out.print("Matricule: "); String mat = sc.nextLine();
                            System.out.print("Salaire base: "); double sb = sc.nextDouble(); sc.nextLine();

                            if (type.equalsIgnoreCase("medecin")) {
                                System.out.print("Spécialité: ");
                                String spec = sc.nextLine();
                                hopital.ajouterPersonnel(new Medecin(nom, prenom, age, mat, sb, spec));
                            } else if (type.equalsIgnoreCase("infirmier")) {
                                System.out.print("Service: ");
                                String service = sc.nextLine();
                                hopital.ajouterPersonnel(new Infirmier(nom, prenom, age, mat, sb, service));
                            } else {
                                hopital.ajouterPersonnel(new Administrateur(nom, prenom, age, mat, sb));
                            }
                            break;
                        case 3:
                            System.out.print("Numéro dossier patient: ");
                            String dossier = sc.nextLine();
                            System.out.print("Matricule médecin: ");
                            String matDoc = sc.nextLine();
                            hopital.assignerMedecin(dossier, matDoc);
                            break;
                        case 4:
                            hopital.afficherTout();
                            break;
                        case 5:
                            hopital.sauvegarder("hopital.txt");
                            break;
                        case 6:
                            System.out.println("Fin du programme.");
                            break;
                        default:
                            System.out.println("Choix invalide !");
                    }
                } while (choix != 6);

                sc.close();
            }



>>>>>>> 290b811 (Gestion hopital complet)
}