package in.practice;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<String> playlist=new ArrayList<>();
  playlist.add("song1");
  playlist.add("song2");
  playlist.add("song3");
  playlist.add(1,"newsong");
  System.out.println(playlist);
  playlist.remove(2);
  playlist.set(0, "updatedsong");
  System.out.println(playlist);
	}

}
