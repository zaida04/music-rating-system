package Resources;

import Util.ArrayUtil;

import java.util.ArrayList;

public class Artist extends RateableResource {
    public ArrayList<Album> albums;

    public Artist(String name) {
        super(name);

        this.albums = new ArrayList();
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public ArrayList<Song> getAllSongs() {
        ArrayList<Song> songs = new ArrayList();
        for(int i = 0; i < this.albums.size(); i++) {
            Album resolvedAlbum = this.albums.get(i);
            ArrayUtil.flattenArrayAndAppend(songs, new ArrayList<>(resolvedAlbum.songs.values()));
        }
        return songs;
    }
}
