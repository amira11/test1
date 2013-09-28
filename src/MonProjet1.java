
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class MonProjet1 {

    public static void main(String[] args) {

        JSONArray arr = new JSONArray();

        arr.add("Ahmed");
        arr.add(10);
        arr.add(12.01);
        arr.add(true);

        System.out.println("---------------------JSONArray---------------------");
        System.out.println("                                                   ");
        System.out.println(arr);

        // ------JSONObject ---> obj1---------------
        JSONObject obj1 = new JSONObject();

        obj1.put("a", 100);
        obj1.put("b", 20.095);
        obj1.put("c", "Ahmed");
        obj1.put("d", true);
        obj1.put("e", null);
        System.out.println("                                                   ");
        System.out.println("----------------JSONObject ---> obj1---------------");
        System.out.println("                                                   ");
        System.out.println(obj1);

        // ------JSONObject ---> obj2---------------
        JSONObject obj2 = new JSONObject();

        obj2.put("val1", 400);
        obj2.put("val2", 12.05);
        obj2.put("val3", "Jamal");

        //obj2.put("arr1", arr);
        System.out.println("                                                   ");
        System.out.println("---------------JSONObject ---> obj2-----------------");
        System.out.println("                                                   ");
        System.out.println(obj2);

        // Ajout obj1 a obj2
        obj2.putAll(obj1);
        System.out.println("                                                   ");
        System.out.println("-----------------Ajout obj1 a objt2----------------");
        System.out.println("                                                   ");
        System.out.println(obj2);
        System.out.println("                                                   ");
        // JSON ARRAY

        System.out.println(" Importation des des données format json");

        String inputs = "{\"a\":10,\"b\":\"ahmed\",\"c\":false}";
        Object obj = JSONValue.parse(inputs);

        JSONObject jsonObj = new JSONObject();

        jsonObj = (JSONObject) obj;

        System.out.println(jsonObj.get("a"));
        System.out.println(jsonObj.get("b"));
        System.out.println(jsonObj.get("c"));




    }// fin main
}// fin class
