import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public class Post_HttpURLConnection {
	public static void main(String[] args) {
	try {
		Post_HttpURLConnection.call_me();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void call_me() throws Exception {
	//1
	URL url = new URL("http://httpbin.org/post?login=true");

        //2
	HttpURLConnection conn = (HttpURLConnection)url.openConnection();

        //3
	conn.setRequestMethod("POST");

        //4.1
	conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	conn.setDoOutput(true);

        //4.2
	Map<String,String> params = new LinkedHashMap<String,String>();
	params.put("name", "Jinu Jawad");
	params.put("email", "helloworld@gmail.com");
	params.put("CODE", "1111");
	params.put("message", "Hello Post Test success");

	StringBuilder postData = new StringBuilder();
	for (Map.Entry<String,String> param : params.entrySet()) {
	        if (postData.length() != 0) postData.append('&');
	        postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
	        postData.append('=');
	        postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
	 }
	System.out.println("POSTDATA: "+postData);
	byte[] postDataBytes = postData.toString().getBytes("UTF-8");
	System.out.println("POSTDATA: "+postDataBytes);
	conn.getOutputStream().write(postDataBytes);

        //5
	int responseCode = conn.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        //6
        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
	StringBuilder sb = new StringBuilder();
	for (int c; (c = in.read()) >= 0;)
	        sb.append((char)c);
	String response = sb.toString();
	System.out.println(response);

	JSONObject myResponse = new JSONObject(response.toString());
	System.out.println("result after Reading JSON Response");
	System.out.println("origin- "+myResponse.getString("origin"));
 	System.out.println("url- "+myResponse.getString("url"));
	JSONObject form_data = myResponse.getJSONObject("form");
	System.out.println("CODE- "+form_data.getString("CODE"));
	System.out.println("email- "+form_data.getString("email"));
	System.out.println("message- "+form_data.getString("message"));
	System.out.println("name"+form_data.getString("name"));

	}
}
