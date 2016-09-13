import jdk.internal.dynalink.beans.StaticClass;

import java.util.ArrayList;

/**
 * Created by Christian Findsen on 13-09-2016.
 */
public class Main {

    private static String string1 = new String("ADf");
    private static String string2 = new String("Iru");
    String string3 = new String("gfd");
    String string4 = new String("asd");



    public static void main(String[] args) {

        string1.toLowerCase();



        LetterCheck LC = new LetterCheck();
        LC.addToList(string1);
        LC.addToList(string2);
        LC.letterCheck();

        System.out.println(LC);
    }



}
