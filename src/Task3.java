public class Task3{
    public static void main(String[] args) {
        int x=5, y=20, z=15;
        int opr1,opr2,opr3,opr4;
        opr1= x += y >> x++ * z;
        opr2= z = ++x & y * 5;
        opr3 =y /= x + 5 | z;
        opr4 = z = x++ & y * 5;
        System.out.println(opr1 + opr2+ opr3 +opr4);// в задании не разобрался
    }
}
