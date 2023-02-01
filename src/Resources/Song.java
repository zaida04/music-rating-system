package Resources;

public class Song extends RateableResource{
    public Artist artist;
    public Album album;
    public String description;

    public Song(String name, Artist artist, Album album, String description) {
        super(name);

        this.artist = artist;
        this.album = album;
        this.album.addSong(this);

        this.description = description;
    }
}
