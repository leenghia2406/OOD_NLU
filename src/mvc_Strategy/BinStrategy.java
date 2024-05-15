package mvc_Strategy;

public class BinStrategy implements Strategy {
    @Override
    public String convert(String dec) {
        int decimal = Integer.parseInt(dec);
        return Integer.toBinaryString(decimal);
    }
}