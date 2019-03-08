package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqualityTest {

    @Test
    public void equalls() {

        Equality eq = new Equality();
        boolean equall = eq.equalls();
        boolean eqq = false;

        Assert.assertEquals(eqq,equall);
    }



}