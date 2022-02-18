import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class LinkValidator {

    private static HttpClient client;
    public static void main(String[] args) throws IOException {
        client = HttpClient.newHttpClient();

        Files.lines(Path.of("urls.txt"))
            .map(LinkValidator::validateLink)
            .forEach(System.out::println);
        
    }

    private static String validateLink(String link){
        HttpRequest request = HttpRequest.newBuilder(URI.create(link))
            .GET()
            .build();

            try {
                HttpResponse<Void> response = client.send(request,
                    HttpResponse.BodyHandlers.discarding());
                return responseToString(response);
            } catch (Exception e) {
                return String.format("%s -> %s", link, false);
            }
        
    }

    private static String responseToString(HttpResponse<Void> response){
        int status = response.statusCode();
        boolean success = status >= 200 && status <= 299;
        return String.format("%s -> %s (status: %s)", response.uri(), success, status);
    }
}