package models;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne(String nom, String prenom, int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    public void afficherInfos(){
        System.out.println("Nom: "+this.nom+" Prenom: "+this.prenom+" Age: "+this.age);
    }
}
