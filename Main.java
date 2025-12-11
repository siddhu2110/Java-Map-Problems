package com.map;
import java.util.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> tm1 = new HashMap<>();
        tm1.put("navin", "tl");
        tm1.put("ravi", "hr");
        tm1.put("kiran", "hr");
        tm1.put("sravan", "manager");
        tm1.put("pallavi", "manager");
        tm1.put("santhosh", "manager");
        HashMap<String,Integer>  op = new HashMap<>();
        for (Map.Entry<String, String> entry : tm1.entrySet()) {
            String role = entry.getValue();
            op.put(role, op.getOrDefault(role, 0) + 1);
        }
        System.out.println(op);
    }
}


//========================================================================================================================================

//        String[] names={"an", "ant", "apple", "ball", "bat", "dog", "ox", "fox"};
//        TreeMap<Integer,ArrayList<String>> treeMap=new TreeMap<>();
//        for(String s:names){
//            treeMap.computeIfAbsent(s.length(),t -> new ArrayList<>()).add(s);
//            }
//            System.out.println(treeMap);



//========================================================================================================================================











        //Creation of the map
//        Map<Integer,String> map=new Hashtable<>();
        //Addition of elements into the map
//        map.put(50050,"Hyderabad");
//        map.put(601504,"Chennai");
//        map.put(505001,"Karimnagar");
        //Retrieval of keys from the map
//        Set<Integer>keys=map.keySet();
//        for(Integer key :keys){
//            System.out.println(key);
//        }
//        System.out.println();

        //Retrieval of values from the map
//        Collection<String> values= map.values();
//        for (String value : values){
//            System.out.println(value);
//        }

        //Retrieval of value from the map based on a key
//        System.out.println(map.get(601504));

//        for(Integer key:keys){
//            System.out.println(key + ">>>>>>" + map.get(key));
//        }

        //Deletion of element from the map
//        map.remove(601504);
//        map.remove(50050,"Hyderabad");
//        System.out.println(map.containsKey(505001));
//        System.out.println(map.containsKey(500000));

//        System.out.println(map.containsValue("Karimnagar"));
//        System.out.println(map.containsValue("Karinagar"));

//        System.out.println(map);
//        map.put(50050,"Rangareddy");
//        map.putIfAbsent(123456,"Banglore");
//        map.replace(601504,"Mysuru");
//        System.out.println(map);
//        System.out.println(map.size());
//        map.clear();
//        System.out.println(map);
