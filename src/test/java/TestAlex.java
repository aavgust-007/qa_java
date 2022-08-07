import com.example.Alex;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestAlex {
    Feline feline = new Feline();

    @Test
    public void testGetFriends() throws Exception {
        Alex alex = new Alex();
        List<String> friend = List.of("Марти", "Глории", "Мелман");
        assertEquals(friend, alex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        Alex alex = new Alex();
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void  testGetKittens() throws Exception {
        Alex alex = new Alex();
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void  testDoesHaveMane() throws Exception {
        Alex alex1 = new Alex();
        assertEquals(true, alex1.doesHaveMane());
    }

}
