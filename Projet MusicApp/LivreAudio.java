package Achabdan;

public class LivreAudio extends ElementMusical{
    public String auteur;
    private Langue Langue;
    public static int prochainId = 1;

    public LivreAudio(String titre, int duree, int id, String contenu, String auteur, Achabdan.Langue langue) {
        super(titre, duree, id, contenu);
        this.auteur = auteur;
        Langue = langue;
    }

    public String getAuteur() {
        return auteur;
    }
    public Langue getLangue() {
        return Langue;
    }



    public void afficher() {
        System.out.println(this.toString());
    }

    public void ecouter() {
        System.out.println(this.getContenu());
    }



    public int compareTo(ElementMusical o) {
        return Integer.compare(this.getDuree(),o.getDuree());
    }
    @Override
    public String toString() {
        return super.toString() +
                ", auteur= " + auteur +
                ", langue= " + Langue +
                ", id= " + getId();
    }

}
