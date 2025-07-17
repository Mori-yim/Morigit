package models;

public class Patient extends Personne{

<<<<<<< HEAD
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
=======
    private String numeroDossier;
    private  String maladie;
    private Medecin medecinAffecte;
    public Patient(String nom, String prenom, int age, String numeroDossier, String maladie) {
        super(nom, prenom, age);
        this.numeroDossier = numeroDossier;
        this.maladie = maladie;
    }

    public  void afficherInfos(){
        System.out.println("Patient: "+this.nom+" "+this.prenom+" Age: "+this.age+" Numero Dossier: "+this.numeroDossier+" Maladie: "+this.maladie);
    }

    public String getNumeroDossier() {
        return numeroDossier;
    }

    public void setMedecinAffecte(Medecin med) {
        this.medecinAffecte=med;
>>>>>>> 290b811 (Gestion hopital complet)
    }
}
