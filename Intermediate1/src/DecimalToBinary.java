public class DecimalToBinary
{
    public static void main(String[] args) {
        long binary = 0;
        int A=450676354;
        int i = 1;
        while (A > 0) {
            binary = binary + i * (A % 2);
            i = i * 10;
            A = A / 2;
        }
        System.out.println(binary);
        long count = 0;
        while (binary != 0) {
            count = count + binary % 10;
            binary = binary / 10;
        }
    }
}
