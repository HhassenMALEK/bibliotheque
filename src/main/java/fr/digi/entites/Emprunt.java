package fr.digi.entites;

import java.util.Date;

public class Emprunt {
    int id;
    Date dateDebut;
    int delai;
    Date dateFin;

    public Emprunt(int id, Date dateDebut, int delai, Date dateFin) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.delai = delai;
        this.dateFin = dateFin;
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
    public Date getDateDebut() {
        return dateDebut;
    }

    /**
     * Setter
     *
     * @param dateDebut dateDebut
     */
    public void setDateDebut(Date dateDebut) {
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
    public Date getDateFin() {
        return dateFin;
    }

    /**
     * Setter
     *
     * @param dateFin dateFin
     */
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
