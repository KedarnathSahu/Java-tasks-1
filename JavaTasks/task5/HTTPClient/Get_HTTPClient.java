import org.apache.http.client.*;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Get_HTTPClient {
	public static void main(String[] args) {
     	try {
         	Get_HTTPClient.call_me();
        } catch (Exception e) {
         	e.printStackTrace();
       	}
}

public static void call_me() throws Exception {
	//1
	String url="http://api.ipinfodb.com/v3/ip-city/?key=03f41fe8050c068f5570848904329139575d4fde7b907e143dac56d3d86f50db&ip=106.51.37.35&format=json";
	HttpClient client = HttpClientBuilder.create().build();

    	//2
	HttpGet request = new HttpGet(url);

    	//3
    	request.addHeader("User-Agent", "Mozilla/5.0");

    	//4
 	HttpResponse response = client.execute(request);

        //5
	System.out.println(response.getStatusLine().getStatusCode());
	BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line = "";
        while ((line = rd.readLine()) != null) {
                System.out.println(line);
        }

    	//6
    	rd.close();
	}
}
