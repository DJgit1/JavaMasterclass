package com.dj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abkdfjDeee287Nnknki9u9unk98";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abkdfjDe", "YYY"));

        String sing = "abkdfjDeee287NnknabkdfjDeki9u9unk98";
        System.out.println(sing.replaceAll("^abkdfjDe", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abkdfjDe"));
        System.out.println(alphanumeric.matches("^abkdfjDeee287Nnknki9u9unk98"));

        System.out.println(alphanumeric.replaceAll("9u9unk98$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[kni]", "X"));
        System.out.println(alphanumeric.replaceAll("[kni]", "I repla"));
        System.out.println(alphanumeric.replaceAll("[kni][di]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abkdfjDeee287Nnknki9u9unk98";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hasWhiteSpace = "I have blanks and\ta tab, and also a new line\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));

        String thirdAlphanumeric = "abkdfjDeee287Nnknki9u9unk98";
        System.out.println(thirdAlphanumeric.replaceAll("^abkdfjDe{3}", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abkdfjDe+", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abkdfjDe*", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abkdfjDe{2,5}", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("k+d*f", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurrence " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence " + h2TextMatcher.group(2));
        }

        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count =0;
        while (tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
        //  t(?=v) positive lookahead
        // ^([\(]{1}[0-9]{3}[\)]{1}[0-9]{3}[\-]{1}[0-9]{4})$ ---US Phone Number
        String phone1 = "1234567890";
        String phone2 = "(123) 456-7890";
        String phone3 = "123 456-7890";
        String phone4 = "(123)456-7890";


        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        // ^4[0-9]{12}([0-9]{3})?$ --- VISA CARD

        String visa1 = "4444444444444";
        String visa2 = "5444444444444";
        String visa3 = "4444444444444444";
        String visa4 = "4444";

        System.out.println("visa1 = " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 = " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 = " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 = " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));
    }
}
