//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int exclamationMark = markdown.indexOf("!", currentIndex);
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            
            if (closeParen == -1 || openBracket == -1 || openParen == -1 || closeBracket == -1) {
                break;
            }

            if (exclamationMark == openBracket - 1) {
                currentIndex = closeParen + 1;
                if (currentIndex == markdown.length()) {
                    break;
                }
            }

            if (openParen == closeBracket + 1) {
                toReturn.add(markdown.substring(openParen + 1, closeParen));
                currentIndex = closeParen + 1;
                continue;
            }

            else {
                currentIndex = closeParen + 1;
                continue;
            }
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        if (args.length != 0) {
            Path fileName = Path.of(args[0]);
            String content = Files.readString(fileName);
            ArrayList<String> links = getLinks(content);
            System.out.println("A print statement");
            System.out.println(links);
        }
    }
}
