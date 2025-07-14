package models;

public class Compte {
    private int numero;
    private double solde;

    public Compte(int numero, int solde){
        this.numero = numero;
        this.solde = solde;
    }

    public double debiter(double montant){
        if(montant<this.solde){
            this.solde -= montant;
        }
        else{
            System.out.println("Le montant a debiter doit etre inferieur au solde ");
        }
        return this.solde;
    }
    public void crediter(double montant){
        this.solde += montant;
        System.out.println("creditation de "+montant+" effectuee avec success");
    }
    public void print(){
        System.out.println("Numero de compte "+this.numero+" Solde: "+this.solde);
    }
    public String toString(){
        return "Numero de compte "+this.numero+" Solde: "+this.solde;
    }
     public void transfert(Compte c){
        c.solde += this.solde;
     }
}
