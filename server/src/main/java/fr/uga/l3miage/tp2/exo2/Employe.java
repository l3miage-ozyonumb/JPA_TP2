package fr.uga.l3miage.tp2.exo2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Employe {


    @Id
    private long id;

    private String nom;
    private String email;
    private double salaire;
}
