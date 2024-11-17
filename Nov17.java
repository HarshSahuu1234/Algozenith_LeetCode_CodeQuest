class Solution {
    public int findComplement(int num) {
        // Find the bitmask with all bits set to 1 for the binary representation of num
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        // XOR num with the mask to get the complement
        return num ^ mask;
    }
}
