package Json;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) {
        XTeam xTeam = new XTeam();
        xTeam.setSex("man");
        xTeam.setName("Bob");
        xTeam.setFunction("swimming");
        System.out.println(new Gson().toJson(xTeam));
    }
}
