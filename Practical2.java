public class Practical2 {
    public static void StringMethod()
    {
        String str = "welcome";
        System.out.println("\n The length method : " + str.length());
        System.out.println("\n The toUppercaseMethod : " + str.toUpperCase());
        System.out.println("\n the toLowercaseMethod : "+str.toLowerCase());
        System.out.println("\n The indexOf method : "+str.indexOf("c"));
        System.out.println("\n The lastIndexOf method : "+str.lastIndexOf('e'));
        System.out.println("\n The startWith method : "+str.startsWith("we"));
        System.out.println("\n The endsWith method : "+str.endsWith("p"));
        System.out.println("\n The substring method : "+str.substring(0));
        System.out.println("\n The substring method : "+str.substring(0,4));
        System.out.println("\n The charAt method : "+str.charAt(1));
        System.out.println("\n The isEmpty method : "+str.isEmpty());

        String str1  = "java is an platform independent language. Java is a platform. Java is an island.";
        System.out.println(str.replace("java","kava"));
        System.out.println(str.trim());

        String mystr1 = "Students";
        System.out.println(str.concat(mystr1));
        System.out.println(String.valueOf(0));
    }

    public static void StringBufferTest()
    {
            StringBuffer sb = new StringBuffer("Welcome");
            sb.append("  Students");
            System.out.println(sb);

            sb.insert(7," IT");
            System.out.println(sb);

            sb.replace(7,10,"Java");
            System.out.println(sb);

            sb.delete(7,11);
            System.out.println(sb);

            System.out.println(sb.charAt(4));

            System.out.println(sb.substring(1));

            System.out.println(sb.substring(3,6));

            sb.reverse();
            System.out.println(sb);

            System.out.println(sb.capacity());

            StringBuffer sb1 = new StringBuffer();
            System.out.println(sb1.capacity());

            sb1.append("dhdshishidhshsi sidisdhidhsihsh oowwswwwxnsmnmskwk sskso");
            System.out.println(sb1.capacity());

            sb1.ensureCapacity(80);
            System.out.println(sb1.capacity());

            System.out.println(sb.length());
    }
    public static void main(String[] args) {
        StringBufferTest();
        StringMethod();
    }
}