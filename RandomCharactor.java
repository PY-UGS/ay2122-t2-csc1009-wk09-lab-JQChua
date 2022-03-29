import java.util.Random;

public class RandomCharactor {
    public String accountNo;
    public double balance = 0;

    public char getRandomLowerCaseLetter()
    {
        Random r = new Random();
        char c = (char) ('a' + r.nextInt(26));
        return c;
    }

    public char getRandomUpperCaseLetter()
    {
        Random r = new Random();
        char c = (char) ('A' + r.nextInt(26));
        return c;
    }

    public char getRandomDigitCharacter()
    {
        Random r = new Random();
        char c = (char) ('0' + r.nextInt(10));
        return c;
    }

    public char getRandomCharacter()
    {
        Random r = new Random();
        char c = (char) ('0' + r.nextInt(256));
        return c;
    }

    public static void main(String args[])
    {
        
        RandomCharactor RC = new RandomCharactor();
        char[] LArr = new char[15];
        char[] UArr = new char[15];
        char[] DArr = new char[15];
        char[] CArr = new char[15];

        for (int i = 0; i < 15; i ++)
        {
            LArr[i] = RC.getRandomLowerCaseLetter();
            UArr[i] = RC.getRandomUpperCaseLetter();
            DArr[i] = RC.getRandomDigitCharacter();
            CArr[i] = RC.getRandomCharacter();

        }
        System.out.println("Random Lower Case Letter: ");
        System.out.println(LArr);
        System.out.println("Random Upper Case Letter: ");
        System.out.println(UArr);
        System.out.println("Random Digit: ");
        System.out.println(DArr);
        System.out.println("Random Charactor: ");
        System.out.println(CArr);
    }

    
}
