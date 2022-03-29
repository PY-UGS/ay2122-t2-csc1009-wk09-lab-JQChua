import static org.junit.Assert.*;
import org.junit.Test;
public class RandomCharactorTest {
    @Test
    public final void TestAllMethods()
    {
        RandomCharactor RandomClass = new RandomCharactor();
        char L = RandomClass.getRandomLowerCaseLetter();
        char U = RandomClass.getRandomUpperCaseLetter();
        char D = RandomClass.getRandomDigitCharacter();
        char C = RandomClass.getRandomCharacter();
        assertTrue(L >= 'a' && L <= 'z' );
        assertTrue(U >= 'A' && U <= 'Z' );
        assertTrue(D >= '0' && D <= '9' );
        assertTrue(C >= '0');

        //check if prime number
        boolean flag = true;
        int intD = D;
        System.out.println(intD);
        if (intD <= 1)
            flag = false;

        for (int i = 2; i < intD; i++)
            if (intD % i == 0)
                flag = false;
        

        assertTrue(flag);
    }
    
}
