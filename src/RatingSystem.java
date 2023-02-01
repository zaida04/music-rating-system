import DataLoader.DataLoader;
import DataLoader.IData;
import DataLoader.ISong;
import Resources.Album;
import Resources.Artist;
import Resources.Song;
import Util.ArrayUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class RatingSystem {
    public HashMap<String, Artist> artists = new HashMap();
    public void populateCache(String cacheFileName) {
        IData retrievedData = null;
        try {
            retrievedData = DataLoader.loadData(cacheFileName);
        } catch (IOException e) {
            System.out.println("Error reading data file. Make sure the file exists.");
            e.printStackTrace();
        }

        if (retrievedData != null) {
            HashMap<String, Album> albumCache = new HashMap<>();
            ISong[] songs = retrievedData.songs;

            for (ISong song : songs) {
                String artistName = song.artist;
                String albumName = song.album;

                Artist artist;
                if (artists.containsKey(artistName)) {
                    artist = artists.get(artistName);
                } else {
                    Artist newArtist = new Artist(artistName);
                    artists.put(artistName, newArtist);
                    artist = newArtist;
                }

                Album album;
                if (albumCache.containsKey(albumName)) {
                    album = albumCache.get(albumName);
                } else {
                    Album newAlbum = new Album(albumName, artist);
                    albumCache.put(albumName, newAlbum);
                    album = newAlbum;
                }

                new Song(song.title, artist, album, "this is a song");
            }

            albumCache.clear();
        }
    }

    public ArrayList<Song> getAllSongs() {
        ArrayList<Song> songs = new ArrayList();
        for(Artist artist: this.artists.values()) {
            ArrayUtil.flattenArrayAndAppend(songs, artist.getAllSongs());
        }

        return songs;
    }

    public HashMap<String, Artist> getAllArtists() {
        return this.artists;
    }

    public ArrayList<Album> getAllAlbums() {
        ArrayList<Album> albums = new ArrayList();
        for(Artist artist: this.artists.values()) {
            ArrayUtil.flattenArrayAndAppend(albums, artist.albums);
        }

        return albums;
    }
}
