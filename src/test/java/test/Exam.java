package test;

import java.util.LinkedList;

public class Exam {
    public static void main(String[] args) {
    	
        LinkedList<String> p = new LinkedList<String>();

        p.add("S1");
        p.add("S2");
        p.add("S3");
        System.out.println("Initial lp: " + p);
        p.removeFirst(); 
        p.add("S4"); 
        System.out.println("Playlist after playing S4 " + p);
        p.remove("S2"); 
        p.addLast("S2"); 
        System.out.println("Playlist after playing S2  " +p);
        p.remove("S3"); 
        p.addLast("S1");
        System.out.println("lp after playing S1 song: " + p);
    }
}
