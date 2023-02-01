import Resources.Album;
import Resources.Song;
import UI.UI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RatingSystem mainSystem = new RatingSystem();
        mainSystem.populateCache("data.json");

        ArrayList<Song> songs = mainSystem.getAllSongs();
        ArrayList<Album> albums = mainSystem.getAllAlbums();

        UI.printMenu();
        // TODO: Make UI framework that's built for prompting, parsing, menus, and navigation
        // TODO: Make rating system where user can rate an artist, an album, and a song
        // TODO: Make rating system also be able to compute averages of rateable structs
    }
}