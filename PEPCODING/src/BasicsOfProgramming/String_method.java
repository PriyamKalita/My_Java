package BasicsOfProgramming;

public class String_method {
    public static void main(String[] args) {

        String name  =  "HelloWorld";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String l1 = name.toLowerCase();
        System.out.println(l1);

        String l2 = name.toUpperCase();
        System.out.println(l2);

        String nonTrimmedString = "       HelloWorld      ";
        System.out.println(nonTrimmedString );
        String TrimmedString;
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(3));

        System.out.println(name.substring(1,3));

        System.out.println(name.replace('H','C'));

        System.out.println(name.replace("H", "velo"));
        System.out.println(name.replace("Hel", "VELO"));



        String n1  =  "Hello";
        System.out.println(n1.startsWith("He"));
        System.out.println(n1.endsWith("iil"));

        System.out.println(n1.charAt(3));

        String n3 = "World";
        System.out.println(n3.indexOf("Wor"));
        System.out.println(n3.indexOf("Wor",3));
        System.out.println(n3.lastIndexOf("l"));
        System.out.println(n3.lastIndexOf("l",4));

        System.out.println(n3.equals("World"));
        System.out.println(n3.equalsIgnoreCase("World"));

        // Escape Sequence
        System.out.println("This Is \" Hello \" World");
        System.out.println("This Is \\ Hello World");
        System.out.println("This Is \' Hello \' World");
        System.out.println("This Is \t Hello World");
        System.out.println("This Is \n Hello World");


    }
}
