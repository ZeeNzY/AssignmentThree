package za.ac.cput.projects;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void equalls() {

        App eq = new App();
        boolean equall = eq.equalls();
        boolean eqq = false;

        Assert.assertEquals(eqq,equall);
    }
}
