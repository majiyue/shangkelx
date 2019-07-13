package gof.structure.composite;

import java.util.ArrayList;

interface AbstractFile {
    void ls();
}


class MyFile implements AbstractFile {

    private String name;

    public MyFile(String name) {
        this.name = name;
    }

    @Override
    public void ls() {

        System.out.println(Folder.builder + name);

    }
}

class MyDirectory implements AbstractFile {

    private String name;
    private ArrayList files = new ArrayList();

    public MyDirectory(String name) {
        this.name = name;
    }

    public void add(AbstractFile object) {
        files.add(object);

    }


    @Override

    public void ls() {

        System.out.println(Folder.builder + name);
        Folder.builder.append("---");
        for (Object file : files) {
            ((AbstractFile) file).ls();
        }
        Folder.builder.setLength(Folder.builder.length() - 3);


    }
}

public class Folder {

    public static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        MyDirectory music = new MyDirectory("MUSIC");
        MyDirectory scorpions = new MyDirectory("SCORPIONS");
        MyDirectory dio = new MyDirectory("DIO");

        MyFile track1 = new MyFile("Don't wary be happy.mp3");
        MyFile track2 = new MyFile("track2.m2u");
        MyFile track3 = new MyFile("Wind of change.mp3");
        MyFile track4 = new MyFile("Big city night.mp3");
        MyFile track5 = new MyFile("Rainbow in the dark.mp3");


        music.add(track1);
        music.add(scorpions);
        music.add(track2);
        scorpions.add(track3);
        scorpions.add(track4);
        scorpions.add(dio);
        dio.add(track5);
        music.ls();

    }


}
