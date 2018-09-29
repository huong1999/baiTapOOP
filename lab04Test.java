import org.junit.Test;

import static org.junit.Assert.*;

public class lab04Test {

    @Test
    public void max() {
        lab04 maxAB = new lab04();
        assertEquals(2, maxAB.max(0,2));
        assertEquals(3, maxAB.max(3,2));
        assertEquals(4, maxAB.max(4,3));
        assertEquals(5, maxAB.max(5,2));
        assertEquals(2, maxAB.max(1,2));

    }

    @Test
    public void minArray() {
        lab04 min = new lab04();
        //int[] arr = new int[3];
        int[] arr1 = {1, 2, 3};
        assertEquals(1, min.minArray(arr1));
        int[] arr2={2,4,3};
        assertEquals(2, min.minArray(arr2));
        int[] arr3={7,2,5};
        assertEquals(2, min.minArray(arr3));
        int[] arr4={0,6,3};
        assertEquals(0, min.minArray(arr4));
        int[] arr5={5,2,3};
        assertEquals(2, min.minArray(arr5));

    }

    @Test
    public void BMI() {
        lab04 bmi = new lab04();
        assertEquals("Thieu can", bmi.BMI(30,1.60));
        assertEquals("Binh thuong", bmi.BMI(53,1.61));
        assertEquals("Beo phi", bmi.BMI(70,1.63));
        assertEquals("Binh thuong", bmi.BMI(60,1.65));
        assertEquals("Beo phi", bmi.BMI(70,1.50));

    }
}
