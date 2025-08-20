public class Bitwise_Operator {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 7; // 0111

        /*
         ================== Bitwise Operation Table ==================
         a = 5 (0101)
         b = 7 (0111)

         | Bit Position | a | b | a & b | a | b | a ^ b |
         |--------------|---|---|-------|-------|-------|
         | 1st (MSB)    | 0 | 0 |   0   |   0   |   0   |
         | 2nd          | 1 | 1 |   1   |   1   |   0   |
         | 3rd          | 0 | 1 |   0   |   1   |   1   |
         | 4th (LSB)    | 1 | 1 |   1   |   1   |   0   |
         -------------------------------------------------
         Result Binary:   0101    0111    0010
         Result Decimal:   5       7       2

         ~a (NOT a):
         a  =  0000...0101 (32-bit)
         ~a =  1111...1010 (32-bit, 2’s complement) = -6
         ============================================================
        */

        System.out.println("Bitwise AND : " + (a & b));
        System.out.println("Bitwise OR : " + (a | b));
        System.out.println("Bitwise XOR : " + (a ^ b));
        System.out.println("Bitwise COMPLIMENT : " + (~a));
    }
}
