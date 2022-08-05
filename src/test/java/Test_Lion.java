import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class Test_Lion {
    boolean hasMane;
    @Spy
    private Feline feline;


    @Test
    public void Test_getKittens() throws Exception {
        Lion lion = new Lion(feline) ;
        Mockito.doReturn(5).when(feline).getKittens();
        int actualResult = lion.getKittens();
        assertEquals(5, actualResult);
    }

    @Test
    public void Test_getFood() throws Exception {
        Lion lion = new Lion(feline) ;
        Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(feline).getFood(Mockito.anyString());
        List<String> actualResult = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualResult);
    }

}
