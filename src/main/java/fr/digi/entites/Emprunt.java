package fr.digi.entites;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="EMPRUNT")
public class Emprunt implements java.io.Serializable{
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "DATE_DEBUT")
   LocalDateTime dateDebut;

   @Column(name = "DELAI")
    int delai;

    @Column(name = "DATE_FIN")
    LocalDateTime dateFin;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private Client client;

    public Emprunt(){

    }

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
     * @return dateDebut
     */
    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    /**
     * Setter
     *
     * @param dateDebut dateDebut
     */
    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * Getter
     *
     * @return delai
     */
    public int getDelai() {
        return delai;
    }

    /**
     * Setter
     *
     * @param delai delai
     */
    public void setDelai(int delai) {
        this.delai = delai;
    }

    /**
     * Getter
     *
     * @return dateFin
     */
    public LocalDateTime getDateFin() {
        return dateFin;
    }

    /**
     * Setter
     *
     * @param dateFin dateFin
     */
    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * Getter
     *
     * @return client
     */
    public Client getClient() {
        return client;
    }

    /**
     * Setter
     *
     * @param client client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emprunt{");
        sb.append("id=").append(id);
        sb.append(", dateDebut=").append(dateDebut);
        sb.append(", delai=").append(delai);
        sb.append(", dateFin=").append(dateFin);
        sb.append(", client=").append(client);
        sb.append(", client=").append(client);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emprunt emprunt = (Emprunt) o;
        return id == emprunt.id && delai == emprunt.delai && Objects.equals(dateDebut, emprunt.dateDebut) && Objects.equals(dateFin, emprunt.dateFin) && Objects.equals(client, emprunt.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateDebut, delai, dateFin, client);
    }
}
