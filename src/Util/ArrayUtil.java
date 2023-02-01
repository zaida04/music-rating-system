package Util;

import Resources.Song;

import java.util.ArrayList;
import java.util.List;
public class ArrayUtil {
    public static <N> void flattenArrayAndAppend(List sourceArray, ArrayList<N> elements) {
        for(N element: elements) {
            sourceArray.add(element);
        }
    }

}
