import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Christian Findsen on 13-09-2016.
 */
public class LetterCheck {

    ArrayList<String> array = new ArrayList<>();

    public void letterCheck() {

        for (int i = 0; i < array.size(); i++)
        {
            array.get(i).toLowerCase();

        }

    }

    @Override
    public String toString() {
        return "LetterCheck{" +
                "array=" + array +
                '}';
    }

    public void addToList(String string){
        array.add(string);
    }

    public ArrayList<String> printAll(){
        return array;
    }
}