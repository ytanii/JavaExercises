import java.util.ArrayList;
import java.util.Scanner;
import java.net.URL;

public class Listing12_18_WebCrawler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = scanner.next();
        crawler(url);

    }

    public static void crawler(String url) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(url);
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.removeFirst();
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl " + urlString);
            }

            for (String s : getSubURls(urlString)) {
                if (!listOfTraversedURLs.contains(s)) {
                    listOfPendingURLs.add(s);
                }
            }
        }

    }

    public static ArrayList<String> getSubURls(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner scanner = new Scanner(url.openStream());
            int current = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                current = line.indexOf("https:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("https", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
    }
}
