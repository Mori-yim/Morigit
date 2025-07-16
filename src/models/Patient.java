package models;

public class Patient extends Personne{

    private  String numeroDossier;
    private String maladie;

    public Patient(String nom, String prenom, int age,String numeroDossier,String maladie) {
        super(nom, prenom, age);
        this.numeroDossier=numeroDossier;
        this.maladie=maladie;
    }

    public void afficherInfos(){
        super.afficherInfos();
        System.out.println("Numero de dossier: "+this.numeroDossier+" Maladie: "+this.maladie);
    }
}
