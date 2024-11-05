package fr.digi.entites;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "LIVRE")
public class Livre implements java.io.Serializable{

    @Id
    @Column(name = "ID") // pour ressembler au nom des colonnes de la base ;
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // pour  l'auto incrémentation
    private Integer id;

    @Column(name = "TITRE")
    private String titre;

  //@Transient // ==> Transien "non persisté" pour dire oublie cet attribu il n'a pas d'existance dans ma bas de donnée  'j ai seulement besoin dans mon code ;
  @Column(name = "AUTEUR")
    private String auteur;


    public Livre(String titre) {
        this(null, "", "");
    }

    public Livre(String titre, String auteur) {
       this(null, titre, auteur);
    }

    public Livre(Integer id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }

    /**
      * Getter
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter
     *
     * @return titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Setter
     *
     * @param titre titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Getter
     *
     * @return auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Setter
     *
     * @param auteur auteur
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livre{");
        sb.append("id=").append(id);
        sb.append(", titre='").append(titre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return Objects.equals(id, livre.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}

