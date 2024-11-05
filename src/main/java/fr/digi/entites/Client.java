package fr.digi.entites;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "CLIENT")
public class Client implements java.io.Serializable{

    @Id
    @Column(name = "ID")
    int id;

    @Column(name = "NOM")
    String nom;

    @Column(name = "PRENOM")
    String prenom;

    @OneToMany(mappedBy = "client")
    private Set<Emprunt> emprunt;

    public Client(){}

    /**
     * Getter
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter
     *
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter
     *
     * @param prenom prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Getter
     *
     * @return Emprunt
     */
    public Set<fr.digi.entites.Emprunt> getEmprunt() {
        return emprunt;
    }

    /**
     * Setter
     *
     * @param Emprunt Emprunt
     */
    public void setEmprunt(Set<fr.digi.entites.Emprunt> Emprunt) {
        Emprunt =Emprunt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(nom, client.nom) && Objects.equals(prenom, client.prenom) && Objects.equals(emprunt, client.emprunt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, emprunt);
    }
}
