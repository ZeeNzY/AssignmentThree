package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentityTest {

    @Test
    public void identity() {

        Identity id = new Identity();
        boolean ids = id.identity();

        boolean identity = false;

        Assert.assertEquals(identity,ids);

    }
}