import com.example.Alex;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test_Alex {
    Feline feline = new Feline();
    Lion lion = new Lion(feline);
    Alex alex = new Alex(lion);


    @Test
    public void test_getFriends() {
        List<String> friend = List.of("Марти", "Глории", "Мелман");
        assertEquals(friend, alex.getFriends());
    }

    @Test
    public void  test_getPlaceOfLiving() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void  test_getKittens() {
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void  test_doesHaveMane() throws Exception {
        Alex alex1 = new Alex();
        assertEquals(true, alex1.doesHaveMane());
    }

}
