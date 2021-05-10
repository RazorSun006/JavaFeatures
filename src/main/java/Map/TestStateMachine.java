package Map;

import java.util.HashMap;
import java.util.Map;

public class TestStateMachine {
    static class Automaton {
        public Map<String, String[]> table = new HashMap<String,String[]>() {{
            put("start", new String[]{"start", "signed", "in_number", "end"});
        }};
    }

    public static void main(String[] args) {
        Automaton automaton = new Automaton();
       String list = automaton.table.get("start")[2];
    }

}
