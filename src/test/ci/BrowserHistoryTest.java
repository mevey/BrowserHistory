package ci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrowserHistoryTest {

    BrowserHistory bh = new BrowserHistory();
    public void setup() {
        bh.visit("abc.com");
    }

    @Test
    public void afterVisitingOnePageTheSizeOfBrowserHistoryShouldIncreaseByOne() {
        BrowserHistory bh = new BrowserHistory();
        bh.visit("abc.com");
        assertEquals(bh.historySize(), 1);
    }
}
