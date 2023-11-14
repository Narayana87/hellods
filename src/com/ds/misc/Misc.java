package com.ds.misc;

import java.util.HashMap;
import java.util.Map;

public class Misc {
    public static void main(String[] args) {

    }
    public static <k,v> Map<k,v> mapCompare(Map<k,v> mapx, Map<k,v> mapy){
        Map<k,v> resultMap = new HashMap<>();
        for( k key : mapx.keySet()){
            v val1 = mapx.get(key);
            v val2 = mapy.get(key);
            if(!val1.equals(val2)){
                resultMap.put(key, val2);
            }
        }
        return resultMap;
    }
}
