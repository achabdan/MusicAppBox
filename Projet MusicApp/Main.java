package Achabdan;

import java.util.*;



public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("little thing", 300, 1, "little thing en cours de lecture", "one direction");
        Song song2 = new Song("only", 350, 2, "only en cours de lecture", "nf");
        Song song3 = new Song("goodbyes", 400, 3, "goodbyes en cours de lecture", "post malone");
        Song song4 = new Song("starboy", 450, 4, "starboy en cours de lecture", "the weeknd");
        Song song5 = new Song("not afraid", 340, 5, "not afraid en cours de lecture", "eminem");
        Song song6 = new Song("someone like you", 320, 6, "someone like you en cours de lecture", "adele");
        Song song7 = new Song("chandelier", 370, 7, "chandelier en cours de lecture", "sia");
        Song song8 = new Song("on top of the world", 410, 8, "on top of the world en cours de lecture", "imagine dragons");
        Song song9 = new Song("say my name", 390, 9, "say my name en cours de lecture", "odesza");
        Song song10 = new Song("dandelions", 330, 10, "dandelions en cours de lecture", "ruth.b");

        LivreAudio livreAudio1 = new LivreAudio("jujutsu kaisen", 600, 1, "jujutsu kaisen en cours de lecture", "gege akutami", Langue.francais);
        LivreAudio livreAudio2 = new LivreAudio("naruto", 800, 2, "naruto en cours de lecture", "masashi kishimoto", Langue.Anglais);
        LivreAudio livreAudio3 = new LivreAudio("kimetsu no yaiba", 500, 3, "kimetsu no yaiba en cours de lecture", "Koyoharu Gotōge.", Langue.francais);
        LivreAudio livreAudio4 = new LivreAudio("bleach", 650, 4, "bleach en cours de lecture", "Tite Kubo", Langue.francais);
        LivreAudio livreAudio5 = new LivreAudio("boruto", 400, 5, "boruto en cours de lecture", "masashi kishimoto", Langue.Anglais);
        LivreAudio livreAudio6 = new LivreAudio("solo leveling", 700, 6, "solo leveling en cours de lecture", "chu gong", Langue.Espagnol);
        LivreAudio livreAudio7 = new LivreAudio("one piece", 980, 7, "one piece en cours de lecture", "eiichiro oda", Langue.Italien);
        LivreAudio livreAudio8 = new LivreAudio("fire force", 660, 8, "fire force en cours de lecture", "atsushi ohkubo", Langue.Allemand);
        LivreAudio livreAudio9 = new LivreAudio("black clover", 440, 9, "black clover en cours de lecture", "yûki tabata", Langue.Espagnol);
        LivreAudio livreAudio10 = new LivreAudio("another", 330, 10, "another en cours de lecture", "hiro kiyohara", Langue.Anglais);

        Playlist playlist1 = new Playlist("My best");
        Playlist playlist2 = new Playlist("Mix");

        playlist1.ajouterElement(song1);
        playlist1.ajouterElement(livreAudio1);
        playlist1.ajouterElement(song2);
        playlist1.ajouterElement(livreAudio2);
        playlist1.ajouterElement(song3);
        playlist1.ajouterElement(livreAudio3);
        playlist1.ajouterElement(song4);
        playlist1.ajouterElement(livreAudio4);
        playlist1.ajouterElement(song5);
        playlist1.ajouterElement(livreAudio5);

        playlist2.ajouterElement(song6);
        playlist2.ajouterElement(livreAudio6);
        playlist2.ajouterElement(song7);
        playlist2.ajouterElement(livreAudio7);
        playlist2.ajouterElement(song8);
        playlist2.ajouterElement(livreAudio8);
        playlist2.ajouterElement(song9);
        playlist2.ajouterElement(livreAudio9);
        playlist2.ajouterElement(song10);
        playlist2.ajouterElement(livreAudio10);

        ArrayList<Song> listeChansons = new ArrayList<>();
        ArrayList<LivreAudio> listeLivreAudio = new ArrayList<>();
        ArrayList<Playlist> listePlaylists = new ArrayList<>();

        listeChansons.add(song1);
        listeChansons.add(song2);
        listeChansons.add(song3);
        listeChansons.add(song4);
        listeChansons.add(song5);
        listeChansons.add(song6);
        listeChansons.add(song7);
        listeChansons.add(song8);
        listeChansons.add(song9);
        listeChansons.add(song10);

        listeLivreAudio.add(livreAudio1);
        listeLivreAudio.add(livreAudio2);
        listeLivreAudio.add(livreAudio3);
        listeLivreAudio.add(livreAudio4);
        listeLivreAudio.add(livreAudio5);
        listeLivreAudio.add(livreAudio6);
        listeLivreAudio.add(livreAudio7);
        listeLivreAudio.add(livreAudio8);
        listeLivreAudio.add(livreAudio9);
        listeLivreAudio.add(livreAudio10);

        listePlaylists.add(playlist1);
        listePlaylists.add(playlist2);

        System.out.println("Bienvenue sur votre application MusiBox");
        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        afficherMenu();

        String choix;
        boolean playlistTrouvee;
        boolean chansonTrouvee;
        boolean livreAudioTrouvee;

        while (run) {
            String commande = scanner.nextLine().toLowerCase();

            switch (commande) {
                case "ac":
                    // Affichage de toutes les chansons rangées par artistes
                    Collections.sort(listeChansons);
                    for (Song elt : listeChansons) {
                        elt.afficher();
                    }
                    System.out.println();
                    System.out.print("Entrez une commande : ");
                    break;

                case "al":
                    // Affichage de tous les livres audio rangés par durée
                    Collections.sort(listeLivreAudio);
                    for (LivreAudio elt : listeLivreAudio) {
                        elt.afficher();
                    }
                    System.out.println();
                    System.out.print("Entrez une commande : ");
                    break;

                case "ap":
                    // Affichage des éléments dans une playlist rangés par ordre alphabétique des titres
                    String choixPlaylistPourAfficher = null;

                    System.out.println("Choisissez la playlist que vous souhaitez consulter");
                    for (Playlist elt : listePlaylists) {
                        System.out.println(elt.getID() + " - " + elt.getNom());
                    }

                    choixPlaylistPourAfficher = scanner.nextLine();

                    try {
                        playlistTrouvee = false;
                        for (Playlist elt : listePlaylists) {
                            if (elt.getID() == Integer.valueOf(choixPlaylistPourAfficher)) {
                                playlistTrouvee = true;
                                elt.trierParTitre();
                                elt.afficherMaPlaylist();
                                break;
                            }
                        }
                        if (!playlistTrouvee) {
                            System.out.println("Playlist inexistante !");
                        }
                    } catch (Exception e) {
                        System.out.println("Erreur !");
                    }

                    System.out.println();
                    System.out.print("Entrez une commande : ");
                    break;

                case "rc":
                    // Ajout d'une nouvelle chanson dans une playlist
                    Song chansonChoisie = null;
                    choix = null;
                    System.out.println("Choisissez la chanson que vous voulez ajouter à une playlist");
                    for (Song elt : listeChansons) {
                        System.out.println(elt.getId() + " - " + elt.getTitre() + " de " + elt.getArtiste());
                    }
                    choix = scanner.nextLine();
                    try {
                        chansonTrouvee = false;
                        for (Song elt : listeChansons) {
                            if (elt.getId() == Integer.valueOf(choix)) {
                                chansonTrouvee = true;
                                chansonChoisie = elt;
                                break;
                            }
                        }
                        if (!chansonTrouvee) {
                            System.out.println("Chanson inexistante !");
                        }
                    } catch (Exception e) {
                        System.out.println("Erreur !");
                    }

                    if (chansonChoisie != null) {
                        System.out.println("Veuillez choisir la playlist dans laquelle vous souhaitez l'ajouter");
                        for (Playlist elt : listePlaylists) {
                            System.out.println(elt.getID() + " - " + elt.getNom());
                        }
                        choix = scanner.nextLine();
                        try {
                            playlistTrouvee = false;
                            for (Playlist elt : listePlaylists) {
                                if (elt.getID() == Integer.valueOf(choix)) {
                                    playlistTrouvee = true;
                                    elt.ajouterElement(chansonChoisie);
                                    System.out.println("Chanson ajoutée à la playlist avec succès !");
                                    break;
                                }
                            }
                            if (!playlistTrouvee) {
                                System.out.println("Playlist inexistante !");
                            }
                        } catch (Exception e) {
                            System.out.println("Erreur !");
                        }

                    }
                    System.out.println();
                    System.out.print("Entrez une commande : ");
                    break;

                case "rl":
                    // Ajout d'un nouveau livre audio dans une playlist
                    LivreAudio livreChoisie = null;
                    choix = null;
                    System.out.println("Choisissez le livre audio que vous voulez ajouter à une playlist");
                    for (LivreAudio elt : listeLivreAudio) {
                        System.out.println(elt.getId() + " - " + elt.getTitre() + " de " + elt.getAuteur());
                    }
                    choix = scanner.nextLine();
                    try {
                        livreAudioTrouvee = false;
                        for (LivreAudio elt : listeLivreAudio) {
                            if (elt.getId() == Integer.valueOf(choix)) {
                                livreAudioTrouvee = true;
                                livreChoisie = elt;
                                break;
                            }
                        }
                        if (!livreAudioTrouvee) {
                            System.out.println("Livre audio inexistant !");
                        }
                    } catch (Exception e) {
                        System.out.println("Erreur !");
                    }

                    if (livreChoisie != null) {
                        System.out.println("Veuillez choisir la playlist dans laquelle vous souhaitez l'ajouter");
                        for (Playlist elt : listePlaylists) {
                            System.out.println(elt.getID() + " - " + elt.getNom());
                        }
                        choix = scanner.nextLine();
                        try {
                            playlistTrouvee = false;
                            for (Playlist elt : listePlaylists) {
                                if (elt.getID() == Integer.valueOf(choix)) {
                                    playlistTrouvee = true;
                                    elt.ajouterElement(livreChoisie);
                                    System.out.println("Livre audio ajouté à la playlist avec succès !");
                                    break;
                                }
                            }
                            if (!playlistTrouvee) {
                                System.out.println("Playlist inexistante !");
                            }
                        } catch (Exception e) {
                            System.out.println("Erreur !");
                        }

                    }
                    System.out.println();
                    System.out.print("Entrez une commande : ");
                    break;

                case "e":
                    // Écouter une chanson ou un livre audio
                    choix = null;
                    System.out.println("Voulez-vous écouter une chanson ou un livre audio ? \n1 - Chanson \n2 - Livre audio ");
                    switch (scanner.nextLine()) {
                        case "1":
                            System.out.println("Choisissez la chanson que vous voulez écouter");
                            for (Song elt : listeChansons) {
                                System.out.println(elt.getId() + " - " + elt.getTitre() + " de " + elt.getArtiste());
                            }
                            choix = scanner.nextLine();
                            try {
                                chansonTrouvee = false;
                                for (Song elt : listeChansons) {
                                    if (elt.getId() == Integer.valueOf(choix)) {
                                        chansonTrouvee = true;
                                        elt.ecouter();
                                        break;
                                    }
                                }
                                if (!chansonTrouvee) {
                                    System.out.println("Chanson inexistante !");
                                }
                            } catch (Exception e) {
                                System.out.println("Erreur !");
                            }

                            break;
                        case "2":
                            System.out.println("Choisissez le livre audio que vous voulez écouter");
                            for (LivreAudio elt : listeLivreAudio) {
                                System.out.println(elt.getId() + " - " + elt.getTitre() + " de " + elt.getAuteur());
                            }
                            choix = scanner.nextLine();
                            try {
                                livreAudioTrouvee = false;
                                for (LivreAudio elt : listeLivreAudio) {
                                    if (elt.getId() == Integer.valueOf(choix)) {
                                        livreAudioTrouvee = true;
                                        elt.ecouter();
                                        break;
                                    }
                                }
                                if (!livreAudioTrouvee) {
                                    System.out.println("Livre audio inexistant !");
                                }
                            } catch (Exception e) {
                                System.out.println("Erreur !");
                            }
                            break;
                        default:
                            System.out.println("Erreur !");
                            break;
                    }
                    System.out.println();
                    System.out.print("Entrez une commande : ");
                    break;

                case "n":
                    // Création d'une nouvelle playlist vide
                    listePlaylists.add(Playlist.creerNouvellePlaylist());
                    System.out.println("Nouvelle playlist créée avec succès !");
                    System.out.println();
                    System.out.print("Entrez une commande : ");
                    break;

                case "d":
                    // Suppression d'une playlist
                    String idPlaylist;
                    System.out.println("Choisissez la playlist que vous voulez supprimer");
                    for (Playlist elt : listePlaylists) {
                        System.out.println(elt.getID() + " - " + elt.getNom());
                    }
                    idPlaylist = scanner.nextLine();
                    try {
                        Playlist.supprimerPlaylist(listePlaylists, idPlaylist);
                    } catch (Exception e) {
                        System.out.println("Erreur !");
                    }
                    System.out.println();
                    System.out.print("Entrez une commande : ");
                    break;

                case "quitter":
                    System.out.println("Merci d'avoir utilisé MusicBox. À bientôt !");
                    run = false;
                    break;

                default:
                    System.out.println("Commande invalide. Veuillez réessayer.");
                    System.out.println();
                    System.out.print("Entrez une commande : ");
                    break;
            }
        }
    }

    // Affichage du menu
    public static void afficherMenu() {
        // Afficher le menu des commandes disponibles
        System.out.println("Commandes disponibles:");
        System.out.println("ac : Afficher toutes les chansons par artiste");
        System.out.println("al : Afficher tous les livres audio par durée");
        System.out.println("ap : Afficher les éléments dans une playlist");
        System.out.println("rc : Rajouter une nouvelle chanson dans une playlist");
        System.out.println("rl : Rajouter un nouveau livre audio dans une playlist");
        System.out.println("e  : Écouter une chanson ou un livre audio");
        System.out.println("n  : Créer une nouvelle playlist vide");
        System.out.println("d  : Supprimer une playlist");
        System.out.println("quitter : Quitter l'application");
        System.out.print("Entrez une commande : ");
    }
}
