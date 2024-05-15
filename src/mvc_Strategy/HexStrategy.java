package mvc_Strategy;

public class HexStrategy implements Strategy {
    @Override
    public String convert(String dec) {
        int decimal = Integer.parseInt(dec);
        return Integer.toHexString(decimal);
    }
}