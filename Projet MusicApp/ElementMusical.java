package Achabdan;

abstract class ElementMusical implements Comparable<ElementMusical> {
    private final String titre;
    private int duree;
    private int id;
    private String contenu;

    public ElementMusical(String titre, int duree, int id, String contenu) {
        this.titre = titre;
        this.duree = duree;
        this.id = id;
        this.contenu = contenu;
    }

    public String getTitre() {return titre; }
    public int getDuree() {
        return duree;
    }

    @Override
    public String toString() {
        return "titre= " + titre +
                ", duree= " + duree + " secondes";
    }

    public String getContenu() {
        return contenu;
    }
    public abstract void afficher();
    public abstract void ecouter();

    public abstract int compareTo(ElementMusical o);

    public int getId() {
        return id;
    }
}
