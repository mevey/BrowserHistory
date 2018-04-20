package ci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrowserHistory {
    List<String> history = new ArrayList<>();
    Map<String, Integer>  historyMap = new HashMap<>();
    public BrowserHistory() {

    }

    public void visit(String page) {
        history.add(page);
    }

    public int historySize() {
        return history.size();
    }
}
