package Achabdan;
import java.util.*;
 public class Playlist  {
     private String nom;
     public static int prochainId = 1;
     private int id;
     private List<ElementMusical> maPlaylist;
     public void ajouterElement(ElementMusical e){
         this.maPlaylist.add(e);
     }

     public Playlist(String nom) {
         this.nom = nom;
         this.id = prochainId++;
         this.maPlaylist = new ArrayList<>();
     }
     public String getNom() {
         return nom;
     }
     public int getID() {
         return this.id;
     }
     public List<ElementMusical> getMaPlaylist() {
         return this.maPlaylist;
     }
     public void afficherMaPlaylist() {
         for (ElementMusical element : maPlaylist) {
             element.afficher();
         }
     }
     //public void trierParTitre() {
        // Collections.sort(maPlaylist, new CompareElementMusicalParTitre());
    // }
     public static Playlist creerNouvellePlaylist() {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Entrez le nom de la nouvelle playlist : ");
         String nom = scanner.nextLine();

         return new Playlist(nom);
     }
     public static void supprimerPlaylist(ArrayList<Playlist> mesPlaylists, String id) {
         Iterator<Playlist> iterator = mesPlaylists.iterator();
         boolean playlistTrouvee = false;
         while(iterator.hasNext()) {
             Playlist playlist = iterator.next();
             if(playlist.getID() == Integer.valueOf(id)) {
                 playlistTrouvee = true;
                 iterator.remove();
                 System.out.println("Playlist supprimée avec succès !");
                 break;
             }
         }
         if(!playlistTrouvee) {
             System.out.println("Playlist inexistante !");
         }
     }

     public void trierParTitre() {
     }
 }
