package part12.string;

public class Demo1String {

    // Reminder: String is NOT A PRIMITIVE TYPE. All types (such as String, Scanner and etc), except primitive types,
    // are called reference types
    public static void main(String[] args) {
        // Variable of String type declaration
        String text;

        // String type variable initialization (1st way):
        text = "My text";
        System.out.println(text);

        // String type variable initialization (2nd way, not recommended for String):
        text = new String("My text");
        System.out.println(text);

        // If we need to know the length of your String - we use length() method:
        System.out.println("Text length: " + text.length());

        // If we need to know whether the String is empty - we use isEmpty() method:
        System.out.println("Is text empty: " + text.isEmpty());

        String anotherText = "";
        System.out.println("Is another text empty: " + anotherText.isEmpty());



        String text2 = "Once upon a time in Hollywood";
        System.out.println(text2.toLowerCase());
        System.out.println(text2.toUpperCase());


        //  replaceAll()
        System.out.println("replaceAll() result: "
                + text2.replaceAll("Hollywood", "Vilnius"));


        // contains()
        String text3 = "Once upon a time in Hollywood";

        System.out.println("Does 'Hollywood' exist in text3? Result: "
                + text3.contains("Hollywood"));
        System.out.println("Does 'Vilnius' exist in text3? Result: "
                + text3.contains("Vilnius"));


        // indexof() method returns the index of first provided text occurrence
        // lastIndexOf() method returns the index of last provided text occurrence
        String text4 = "text text2 text3 text2";
        System.out.println("The index of first occurrence of 'text2' : " +
                text4.indexOf("text2"));
        System.out.println("The index of last occurrence of 'text2': " +
                text4.lastIndexOf("text2"));


        //  substring()
        String text5 = "Some text";
        int beginIndex = 5;
        System.out.println("substring() result: " + text5.substring(beginIndex));

        //  equals()
        // NOTE: when you compare String values, ALWAYS use equals() method. DO not use ==
        String text6 = "Some text";
        System.out.println("equals() result: " + text5.equals(text6));


        // There is a such data structure in memory, called String pool. String objects (not all) are kept here.
        // When there are at least two identical String literal values in the code and these two (or more) values
        // are assigned to variables, those variables will have the same reference to the same object existing in
        // the String pool

        // Example.:
        String str1 = "abc";
        // str2 refers to the same object (existing in the String pool) as str1
        String str2 = "abc";
        // str3 refers to the different String object
        String str3 = new String("abc");

        System.out.println("str1 == str2 is " + (str1 == str2));
        System.out.println("str2 == str3 is " + (str2 == str3));

        // String literal is a simple String value defined using quotation marks, like that: "abc"

        String superText1 = "Super text";
        // trim() removes spaces after and before string. Example "Super text ".trim() -> "Super text"
        String superText2 = "Super text ".trim();
        System.out.println("== result (same text, different objects): "
                + (superText1 == superText2));
        System.out.println("equals() result (same text, different objects): "
                + superText1.equals(superText2));


        // ##########################################################

        System.out.println("##################");
        //  split()
        String itemsTxt = "gummies eraser pencil ball";
        String[] itemsBag = itemsTxt.split(" ");
        System.out.println("Items list");
        for (int i = 0; i < itemsBag.length; i++) {
            System.out.println(i + 1 + ") " + itemsBag[i]);
        }
        System.out.println("##################");

        // ##########################################################

        // concat()

        String text7 = "Bėgo lapė ir";
        String text8 = " lokys";
        System.out.println("concat() result: " + text7.concat(text8));

        // 	operatorius +

        System.out.println("+ result: " + text7 + text8);


        // concat() we can only pass String values to concat. The line below will not compile:
//         text7.concat(123);

        // concat() we cannot pass null to concat. It will cause an exception after execution:
//        text7.concat(null);
        // Meanwhile, when we use null with +, it works:
        System.out.println(text7 + null);


        // ##########################################################


        //  join()

        String tekstasNr7 = "Once upon a time, there lived";
        String kitasTekstas4 = "grandpa";
        System.out.println("join() result: "
                + String.join(" ", tekstasNr7, kitasTekstas4,
                "and grandma"));

        String a = ""; // You can call method with this value
        String b = null; // However, if you call a String method with this value, you will get an exception

        // Important note:
        // This rule applies to all reference values. You cannot call any methods using null value,
        // because null means that there is no reference to any existing object

        // We will get NullPointerException here:
//         b.length();
    }
}
