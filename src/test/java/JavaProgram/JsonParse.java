package JavaProgram;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.util.List;

public class JsonParse {

    public static void main(String[] args) {
         String json = """
                  {
                                 "store": {
                                     "books": [
                                         { "title": "The Great Gatsby", "author": "F. Scott Fitzgerald", "price": 10.99 },
                                         { "title": "1984", "author": "George Orwell", "price": 8.99 },
                                         { "title": "To Kill a Mockingbird", "author": "Harper Lee", "price": 12.99 }
                                     ],
                                     "pens": [
                                         { "brand": "Pilot", "color": "blue", "price": 2.49 },
                                         { "brand": "Bic", "color": "black", "price": 1.99 },
                                         { "brand": "Sharpie", "color": "red", "price": 3.49 }
                                     ]
                                 }
                             }
                 """;

        JSONArray lastBookPriceArray = JsonPath.read(json, "$.store.books[-1:].price");
        double lastBookPrice = (double) lastBookPriceArray.get(0);  // Extract value properly
        System.out.println("Last Book Price: " + lastBookPrice);

        JSONArray lastPriceArray = JsonPath.read(json, "$..price");

        // ✅ Extract the actual price value
        if (!lastPriceArray.isEmpty()) {
            double lastPrice = (double) lastPriceArray.get(lastPriceArray.size()-1);  // Extract first element
            System.out.println("Last Price in JSON: " + lastPrice);
        } else {
            System.out.println("No price found!");
        }
    }

}
