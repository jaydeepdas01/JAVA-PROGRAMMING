public class Bitwise_Operator {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 7; // 0111

         /*
     * ================== Bitwise Operation Table ==================
     * Let a = 5 (0101)
     * Let b = 7 (0111)
     *
     * | Bit Position |  a  |  b  | a & b | a | b | a ^ b |
     * |--------------|-----|-----|-------|-----|-------|
     * |   1st (MSB)  |  0  |  0  |   0   |  0  |   0   |
     * |     2nd      |  1  |  1  |   1   |  1  |   0   |
     * |     3rd      |  0  |  1  |   0   |  1  |   1   |
     * |  4th (LSB)   |  1  |  1  |   1   |  1  |   0   |
     * ---------------------------------------------------------
     * Result Binary  : 0101 (a) , 0111 (b)
     *                 a & b = 0101 (5)
     *                 a | b = 0111 (7)
     *                 a ^ b = 0010 (2)
     * Result Decimal : AND = 5, OR = 7, XOR = 2
     *
     * ~a (NOT a):
     * a  = 0000...0101 (32-bit)
     * ~a = 1111...1010 (32-bit, 2’s complement)
     *     = -6
     * =============================================================
     */

        System.out.println("Bitwise AND : " + (a & b));
        System.out.println("Bitwise OR : " + (a | b));
        System.out.println("Bitwise XOR : " + (a ^ b));
        System.out.println("Bitwise COMPLIMENT : " + (~a));

        System.out.println("Shift Operators : ");

        // 1. Left Shift (<<)
        // Multiplies the number by 2^n
        // Vacant rightmost bits are filled with 0
        // Sign of the number remains unchanged
        System.out.println("Left Shift : " + (10 << 2) + " , 5 * 2^2");

        // 2. Signed Right Shift (>>)
        // Divides the number by 2^n
        // Vacant leftmost bits are filled with the original sign bit
        // Preserves the sign of the number (positive → 0, negative → 1)
        System.out.println("Right Shift : " + (10 >> 2) + " , 5 * 2^2");

        // 3. Unsigned Right Shift (>>>)
        // Divides the number by 2^n
        // Vacant leftmost bits are always filled with 0 (ignores sign bit)
        // Negative numbers become large positive values
        System.out.println("Unsigned Right Shift : " + (10 >>> 2) + " , 5 * 2^2");
    }
}
