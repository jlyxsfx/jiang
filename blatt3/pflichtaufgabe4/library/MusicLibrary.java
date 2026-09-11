package library;

public class MusicLibrary {
	
	private String name;
	private String[] songs;
	private int songCount;
	private static int libraryCount = 0;
	
	public MusicLibrary(String name, int capacity) {
		this.name = name;
		this.songs = new String[capacity];
		this.songCount = 0;
		libraryCount++;
	}
	
	public MusicLibrary(String name) {
		this(name, 10);
	}
	
	/*
	* Fuegt einen Song zur Bibliothek hinzu.
	* Gibt true zurueck, wenn erfolgreich,
	* false wenn die Bibliothek voll ist.
	*/
	public boolean addSong(String song) {
		if (songCount >= songs.length) {
			return false;
		}
		songs[songCount] = song;
		songCount++;
		return true;
	}
	
	/*
	* Gibt true zurueck, wenn der uebergebene Song
	* in der Bibliothek enthalten ist, sonst false.
	*/
	public boolean contains(String song) {
		for (int i = 0; i < songCount; i++) {
			if (songs[i].equals(song)) {
				return true;
			}
		}
		return false;
	}
	
	/*
	* Gibt alle Songs der Bibliothek als Array.
	* Beachte: Das Array kann null-Objekte enthalten.
	*/
	public String[] getSongList() {
	    String[] songList = new String[songCount];
	    for (int i = 0; i < songCount; i++) {
			songList[i] = songs[i];
		}
		return songList;
	}
	
	/*
	* Gibt alle Songs der Bibliothek als formatierten
	* String zurueck.
	* Beispiel: "MyLib: [Song1, Song2, Song3]"
	*/
	public String toString() {
		String result = name + ": [";
		for (int i = 0; i < songCount; i++) {
			result += songs[i];
			if (i < songCount - 1) {
				result += ", ";
			}
		}
		return result + "]";
	}
	
	/*
	* Gibt die Gesamtanzahl aller erstellten
	* MusicLibrary-Instanzen zurueck.
	*/
	public static int getLibraryCount() {
		return libraryCount;
	}
}