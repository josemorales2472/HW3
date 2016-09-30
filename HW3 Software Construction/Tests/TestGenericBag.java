import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Danny on 9/29/2016.
 */
public class TestGenericBag {

    @Test
    public void testConstructor(){
        //setting
        GenericBag<String, Integer, Boolean> p1 = new GenericBag<String, Integer, Boolean>("Hola", 56, true);

        //getting
        String saludo= p1.getItem1();

        //Assert
        Assert.assertEquals("Should say hola", "Hola", saludo);

    }

    @Test
    public void testSetters(){
        //setting
        GenericBag<String, Boolean, Integer> p1 = new GenericBag<String, Boolean, Integer>("Hola", true, 46);

        //getting
        String saludo= p1.getItem1();
        Boolean love= p1.getItem2();
        int number= p1.getItem3();


        //Assert
        Assert.assertEquals("Should say hola", "Hola", saludo);
        Assert.assertEquals("Should be true", true, love);
        Assert.assertEquals("46", 46, number);

    }

    @Test
    public void testDifTypes(){
        //setting
        GenericBag<Double, Integer, String> p1 = new GenericBag<Double, Integer, String>(68.4, 54, "Hello");

        //getting
        String saludo= p1.getItem3();
        double number2= p1.getItem1();
        int number= p1.getItem2();


        //Assert
        Assert.assertEquals("Should say hola", "Hello", saludo);
        Assert.assertEquals(68.4, 68.4, number2);
        Assert.assertEquals("Should be 68.4", 54, number);

    }


}
