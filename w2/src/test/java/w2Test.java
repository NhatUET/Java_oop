import org.junit.Test;

public class w2Test {
    @Test
    public void testMax2Int1(){
        System.out.println(w2.max2Int(100,200));
    }

    @Test
    public void testMax2Int2(){
        System.out.println(w2.max2Int(41,18));
    }

    @Test
    public void testMax2Int3(){
        System.out.println(w2.max2Int(2001,2002));
    }

    @Test
    public void testMax2Int4(){
        System.out.println(w2.max2Int(-100,2000000));
    }

    @Test
    public void testMax2Int5(){
        System.out.println(w2.max2Int(-100,-200));
    }

    @Test
    public void testMinArray1(){
        int[] arr = {1, 2, 5 , 2 , 9};
        System.out.println(w2.minArray(arr));
    }

    @Test
    public void testMinArray2(){
        int[] arr = {101, 222, 516, 279, 999};
        System.out.println(w2.minArray(arr));
    }

    @Test
    public void testMinArray3(){
        int[] arr = {10, 9 , 7, 8, 102, 304, 405, 510, 987, 123, 999, 100000, 901};
        System.out.println(w2.minArray(arr));
    }

    @Test
    public void testMinArray4(){
        int[] arr = {10, 9 , 7, 8, 102, 304, 405, 510, 987, 123, 999, 100000, 901, 100000, 12312432, 21312312,
                    1231231,1231231, 5342342, 234234, 5345345};
        System.out.println(w2.minArray(arr));
    }

    @Test
    public void testMinArray5(){
        int[] arr = {123123123, -456645654 , 123123, 4564564, 102, 304, 405, 510, 987, 123, 999, 100000, 901, 999, 100000, 901, 100000, 12312432, 21312312,
                1231231,1231231, 5342342, 234234, 5345345, 10000000, 1231231, 152342034, 12341231};
        System.out.println(w2.minArray(arr));
    }

    @Test
    public void testCalculateBMI1(){
        System.out.println(w2.calculateBMI(59, 1.7));
    }

    @Test
    public void testCalculateBMI2(){
        System.out.println(w2.calculateBMI(59, 1.4));
    }

    @Test
    public void testCalculateBMI3(){
        System.out.println(w2.calculateBMI(30, 1.5));
    }

    @Test
    public void testCalculateBMI4(){
        System.out.println(w2.calculateBMI(65, 1.65));
    }

    @Test
    public void testCalculateBMI5(){
        System.out.println(w2.calculateBMI(76, 1.88));
    }
}
