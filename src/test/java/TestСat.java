import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.Silent.class)
public class TestСat {
    @Spy
    Feline feline = new Feline();
    @Spy
    private Predator predator;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        String sound = cat.getSound();
        String expended = "Мяу";
        assertEquals(sound, expended);
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(predator).eatMeat();
        List<String> Food = cat.getFood();
        System.out.println(Food);
        assertEquals(Food, List.of("Животные", "Птицы", "Рыба"));
    }

}
