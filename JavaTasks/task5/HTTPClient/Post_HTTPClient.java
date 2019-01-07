import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class Post_HTTPClient {

	public static void main(String[] args) {
 	try {
         	Post_HTTPClient.call_me();
        } catch (Exception e) {
         	e.printStackTrace();
       	}
}

public static void call_me() throws Exception {
    	//1
	String url = "http://httpbin.org/post?login=true";
	HttpClient client = HttpClientBuilder.create().build();

    	//2
	HttpPost post = new HttpPost(url);

	//3.1 add header
	post.setHeader("User-Agent", "Mozilla/5.0");

    	//3.2
	List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
	urlParameters.add(new BasicNameValuePair("USN", "C02G8416DRJM"));
	urlParameters.add(new BasicNameValuePair("???", ">>>."));
	urlParameters.add(new BasicNameValuePair("locale", "XXX786_009"));
	urlParameters.add(new BasicNameValuePair("caller", "Kedar"));
	urlParameters.add(new BasicNameValuePair("num", "12345"));

	post.setEntity(new UrlEncodedFormEntity(urlParameters));

    	//4
	HttpResponse response = client.execute(post);

    	//5
	System.out.println("Response Code : "+ response.getStatusLine().getStatusCode());

	BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

	StringBuffer result = new StringBuffer();
	String line = "";
	while ((line = rd.readLine()) != null) {
		System.out.println(line);
	}

    	//6
    	rd.close();

	}
}
