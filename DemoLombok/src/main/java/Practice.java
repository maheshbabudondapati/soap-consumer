package main.java;

import java.util.*;

public class Practice {

    public static void main(String[] arag){
        Map<String, String> s = new HashMap<>();
        s.put("king", "kingval");
        List<String> stringarr = Arrays.asList("asdf","asdff","asdfff");
        List<String> sortArray= new ArrayList<>();
        System.out.println(s.containsKey("hello"));
        System.out.println(s.get("hello"));

        List<String> arr= Arrays.asList("ALL");
        List<String> arrr= Arrays.asList("All");


        for (String s1: stringarr
             ) {
            if(s1.equals("asdff")){
                System.out.println("helloooo   "+s1);
                continue;
            }
            System.out.println(s1);
            break;


        }

        stringarr.forEach(e->{
            if(e.equals("asdf")){
                System.out.println("helloooo   "+e);

            }

            System.out.println(e);
        });

        sortArray.sort(Comparator.comparingInt(String::length));

        System.out.println(arr.contains("ALL"));
        System.out.println(arr.contains("All"));

        System.out.println(arrr.contains("ALL"));

        System.out.println( "All".equals("All"));

        System.out.println( "All" == "All");

        List<String> h = null;
        h.add("king");
    }
}
