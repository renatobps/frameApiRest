package rest.api.Models;

import org.apache.groovy.json.internal.LazyMap;

import static utils.Utils.getProperties;

public class TestModelMap {

    public TestModelMap() throws Exception {
    }
   // private static LazyMap json = new LazyMap();
    private static LazyMap header = new LazyMap();

    private static LazyMap params = new LazyMap();
   // public static LazyMap getJson() {
   //     return json;
  //  }

    public static LazyMap getHeader() {
        return header;
    }

    public static LazyMap getParams() {
        return params;
    }

    public static void initHeader(){
        header.put("Content-Type", "application/json; charset=utf-8");
        header.put("X-Api-Key", getProperties("x-api-key"));
        header.put("Authorization", "Bearer "+getProperties("token"));
    }

//    public static void initPayload(){
//        json.put("name", "Jonh Doe");
//        json.put("user", "JD");
//        json.put("password", "A123");
//    }

}
