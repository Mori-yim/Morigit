package models;

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
}
