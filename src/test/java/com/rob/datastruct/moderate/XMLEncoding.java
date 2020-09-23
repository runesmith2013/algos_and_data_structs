package com.rob.datastruct.moderate;

import java.util.List;
import java.util.Map;

public class XMLEncoding {

    private Map<String, String> map;
    private StringBuilder builder;

    static class Element {
        String tag;
        Map<String,String> attributes;
        List<Element> children;
        String value;


    }

    void encode(Element root) {
        encode(root.tag);
        encode(root.attributes);
        print (root.value);
        for (Element el : root.children) {
            encode( el);
        }
    }

    void print (String value)  {
        builder.append(" "+ value + "");
    }

    void encode (Map<String, String> attributes) {
        attributes.forEach((k,v) -> {
            encode(k);
            print (v);
        });
    }

    void encode(String tag) {
        String map = mapper(tag);
        print (map);
    }

    String mapper(String in) {
        return map.get(in);
    }


    public static void main(String[] args) {
       Element root = new Element();
       root.tag = "root";

    }

}
