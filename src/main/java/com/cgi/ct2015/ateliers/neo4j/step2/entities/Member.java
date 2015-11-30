package com.cgi.ct2015.ateliers.neo4j.step2.entities;

import java.util.List;
import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label = "Member")
public class Member extends Entity {
  @Property(name = "nom")
  private String nom;
  @Property(name = "prenom")
  private String prenom;
  @Property(name = "coefficient")
  private int coefficient;
  @Property(name = "aime")
  private List<String> aime;
  @Relationship(type = "CONNAIT")
  private Set<Connait> connus;

  public Set<Connait> getConnus() {
    return connus;
  }

  public void setConnus(Set<Connait> connus) {
    this.connus = connus;
  }

  public Member() {
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public int getCoefficient() {
    return coefficient;
  }

  public void setCoefficient(int coefficient) {
    this.coefficient = coefficient;
  }

  public List<String> getAime() {
    return aime;
  }

  public void setAime(List<String> aime) {
    this.aime = aime;
  }
}
