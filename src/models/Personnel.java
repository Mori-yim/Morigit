package models;

<<<<<<< HEAD
public abstract class Personnel extends  Personne{
    private String matricule;

    public Personnel(String nom, String prenom, int age, String matricule) {
        super(nom, prenom, age);
        this.matricule=matricule;
    }

    public abstract void afficherRoles();

    public void afficherInfos(){
        super.afficherInfos();
        System.out.println("Matricule: "+this.matricule);
    }

=======
public abstract class Personnel extends Personne implements Employable{

    private String matricule;
    protected double salaireDeBase;

    public Personnel(String nom, String prenom, int age, String matricule, double salaireDeBase) {
        super(nom, prenom, age);
        this.matricule = matricule;
        this.salaireDeBase = salaireDeBase;
    }



    public abstract  double calculerSalaire();

    @Override
    public void afficherContrat() {
        System.out.println("Patient: "+this.nom+" "+this.prenom+" Age: "+this.age+" matricule: "+this.matricule+" Salaire de base: "+this.salaireDeBase);
    }

    public String getMatricule() {
        return this.matricule;
    }
>>>>>>> 290b811 (Gestion hopital complet)
}
