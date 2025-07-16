package models;

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
    }
}
