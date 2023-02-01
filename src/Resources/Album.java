package Resources;

import java.util.HashMap;

public class Album extends RateableResource {
    public Artist artist;
    public HashMap<String, Song> songs;

    public Album(String name, Artist artist) {
        super(name);

        this.artist = artist;
        this.artist.addAlbum(this);
        this.songs = new HashMap();
    }

    public void addSong(Song song) {
        this.songs.put(song.id, song);
    }
}
