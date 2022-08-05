import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class Test_Feline {
    @Spy
    private Feline feline;

    @Test
    public void eatMeatReturnsMeat() throws Exception {
        Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(feline).getFood(Mockito.anyString());
        List<String> actualResult = feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood(Mockito.anyString());
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualResult);
    }

    @Test
    public void Test_getFamily() throws Exception {
        String actualResult = feline.getFamily();
        assertEquals("Кошачьи", actualResult);
    }

    @Test
    public void Test_getKittens() throws Exception {
        Mockito.doReturn(1).when(feline).getKittens();
        int actualResult = feline.getKittens();
        assertEquals(1, actualResult);
    }

    @Test
    public void Test_getKittensIntReturns() throws Exception {
        int actualResult = feline.getKittens(5);
        assertEquals(5, actualResult);
    }
}




