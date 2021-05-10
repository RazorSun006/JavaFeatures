package Json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        XTeam xTeam = new XTeam();
        xTeam.setSex("man");
        xTeam.setName("Bob");
        xTeam.setFunction("swimming");
        /*System.out.println(new Gson().toJson(xTeam));*/

        ObjectMapper obj = new ObjectMapper();
        try {
            // Converting the Java object into a JSON string
            String jsonStr = obj.writeValueAsString(xTeam);
            // Displaying Java object into a JSON string
            System.out.println(jsonStr);
            XTeam newOne = obj.readValue(jsonStr, XTeam.class);
            System.out.println(newOne.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
