package mvc_Strategy;

public class OctStrategy implements Strategy {
    @Override
    public String convert(String dec) {
        int decimal = Integer.parseInt(dec);
        return Integer.toOctalString(decimal);
    }
}
