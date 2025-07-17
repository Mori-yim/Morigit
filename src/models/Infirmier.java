package models;

<<<<<<< HEAD
public class Infirmier extends Personnel{

    private  String service;

    public Infirmier(String nom, String prenom, int age, String matricule, String service) {
        super(nom, prenom, age, matricule);
        this.service=service;
    }

    @Override
    public void afficherRoles() {
        System.out.println("Je suis un infirmier dans le service "+this.service);

    }

    public void afficherInfoeqqs(){
        super.afficherInfos();
        afficherRoles();
    }
=======
public class Infirmier extends  Personnel{

    private String service;

    public Infirmier(String nom, String prenom, int age, String matricule, double salaireDeBase, String service) {
        super(nom, prenom, age, matricule, salaireDeBase);
        this.service = service;
    }


    @Override
    public double calculerSalaire() {
        return salaireDeBase+500;
    }
    public void afficherContrat() {
        System.out.println("Infirmier - Service: " + service + ", Salaire: " + calculerSalaire());
    }

>>>>>>> 290b811 (Gestion hopital complet)
}
