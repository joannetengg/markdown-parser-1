import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void linkTest() throws IOException {
        Path filePath = Path.of("test-file.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();
        list.add("https://something.com");
        list.add("some-thing.html");

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void linkTest2() throws IOException {
        Path filePath = Path.of("test-file2.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();
        list.add("https://google.com");
        list.add("some-thing.html");

        assertEquals(list, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void linkTest3() throws IOException {
        Path filePath = Path.of("test-file3.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void linkTest4() throws IOException {
        Path filePath = Path.of("test-file4.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void linkTest5() throws IOException {
        Path filePath = Path.of("test-file5.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void linkTest6() throws IOException {
        Path filePath = Path.of("test-file6.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void linkTest7() throws IOException {
        Path filePath = Path.of("test-file7.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void linkTest8() throws IOException {
        Path filePath = Path.of("test-file8.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();
        list.add("a link on the first line");

        assertEquals(list, MarkdownParse.getLinks(content));
    }
}