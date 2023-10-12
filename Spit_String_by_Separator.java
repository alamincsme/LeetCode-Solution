package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Spit_String_by_Separator {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> nm=new ArrayList<>();
        for(int i=0;i<words.size();i++)
        {
            String arr[]=words.get(i).split("["+separator+"]");
            for(int j=0;j<arr.length;j++)
            {

                if(arr[j].length()>0)
                {
                    nm.add(arr[j]);
                }
            }
        }
        return nm;
    }
}
