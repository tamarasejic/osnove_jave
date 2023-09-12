package prviJavaTest;

public class Zadatak4 {
    public static void main(String[] args) {

        String styleBText = "Ovaj deo je bold";
        String styleEmText = "ovo je italic";
        String stylePText = "Naravno samo je falio paragraf";
        String textLink = "Welcome to Google";
        String link = "google.com";

        System.out.println(linkedText(link, textLink));
        System.out.print(textStyle("bold", styleBText) + ", a ");
        System.out.println(textStyle("italic", styleEmText));
        System.out.println(textStyle("paragraph", stylePText));
    }
    public static String textStyle (String style, String text) {
        String styledText = "";
        if (style.equals("bold")) {
            styledText = "<b>" + text + "</b>";
        } else if (style.equals("italic")) {
            styledText = "<em>" + text + "</em>";
        } else if (style.equals("paragraph")) {
            styledText = "<p>" + text + "</p>";
        } else {
            styledText = text;
        }
        return styledText;
    }
    public static String linkedText (String link, String textLink) {
        String fullLinkText = "<a href=" + link + ">" + textLink + "</a>";
        return fullLinkText;
    }
}
