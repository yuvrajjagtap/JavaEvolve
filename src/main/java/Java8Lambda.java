public class Java8Lambda {
    public static void main(String[] args) {
        FunctionalInterface fi = (s1,s2) -> {
            return " ***** " + FunctionalInterface.concat(s1,s2) + " ***** ";
        };

        System.out.println(fi.beautify("yuvraj","Jagtap"));
        System.out.println(FunctionalInterface.concat("yuvraj","Jagtap"));
    }
}
