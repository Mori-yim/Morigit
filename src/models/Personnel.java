package models;

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

}
