package Achabdan;

public class Song extends ElementMusical {
    private  String artiste;

    private static int prochainId = 1;

    public Song(String titre, int duree, int id, String contenu, String artiste) {
        super(titre, duree, id, contenu);
        this.artiste = artiste;
    }


    public String getArtiste() {
        return this.artiste;
    }
    @Override
    public void ecouter() {
        System.out.println(this.getContenu());
    }
    @Override
    public int compareTo(ElementMusical o) {
        return this.getArtiste().compareTo(((Song) o).getArtiste());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", artiste= " + artiste +
                ", id= " + getId();
    }

    @Override
    public void afficher() {

    }

}
