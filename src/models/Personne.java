package models;

<<<<<<< HEAD
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
=======
public  abstract class  Personne {

    protected String nom;
    protected String prenom;
    protected int age;

    public Personne(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom=prenom;
        this.age=age;
    }
    public String toString(){
        return "Personne: Nom: "+this.nom+" "+this.prenom+" Age: "+this.age;
>>>>>>> 290b811 (Gestion hopital complet)
    }
}
