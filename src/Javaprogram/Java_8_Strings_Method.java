package Javaprogram;

public class Java_8_Strings_Method {
    public static void main(String[]args)
    {
        String name="Kuldeep";
        System.out.println(name);
        int value= name.length();
        System.out.println(value);

        String lowstring= name.toLowerCase();
        System.out.println(lowstring);

        String uppstring= name.toUpperCase();
        System.out.println(uppstring);

        String nonTrimmedstring="     Kuldeep     ";
        System.out.println(nonTrimmedstring);

        String trimmedstring=nonTrimmedstring.trim();
        System.out.println(trimmedstring);

        System.out.println(name.substring(1));

        System.out.println(name.substring(1,5));

        System.out.println(name.replace('u','e'));

        System.out.println(name.replace("u","upp"));

        System.out.println(name.startsWith("Kul"));

        System.out.println(name.endsWith("nn"));

        System.out.println(name.charAt(5));

        String modifiedName="Kulllldddeeeepp";
        System.out.println(modifiedName.indexOf("lld"));
        System.out.println(modifiedName.indexOf("lld",5));
        System.out.println(modifiedName.indexOf("lld",8));
        System.out.println(name.equals("Kuldeep"));

        System.out.println(name.equalsIgnoreCase("KuldEeP"));

        System.out.println("I am escape sequence\tdouble quote");
    }
}
