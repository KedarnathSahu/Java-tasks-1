import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class GET_HttpURLConnection {
	public static void main(String[] args) {
     try {
         GET_HttpURLConnection.call_me();
        } catch (Exception e) {
         e.printStackTrace();
       }
     }

public static void call_me() throws Exception {
     //1
     String url = "http://api.ipinfodb.com/v3/ip-city/?key=03f41fe8050c068f5570848904329139575d4fde7b907e143dac56d3d86f50db&ip=106.51.37.35&format=json";
     URL obj = new URL(url);

     //2
     HttpURLConnection con = (HttpURLConnection) obj.openConnection();

     //3 optional default is GET
     con.setRequestMethod("GET");

     //4 add request header
     con.setRequestProperty("User-Agent", "Mozilla/5.0");

     //5
     int responseCode = con.getResponseCode();
     System.out.println("\nSending 'GET' request to URL : " + url);
     System.out.println("Response Code : " + responseCode);

     //6
     BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
     String inputLine;
     StringBuffer response = new StringBuffer();
     while ((inputLine = in.readLine()) != null) {
     	response.append(inputLine);
     }
     in.close();
     System.out.println(response.toString());

     JSONObject myResponse = new JSONObject(response.toString());
     System.out.println("result after Reading JSON Response");
     System.out.println("statusCode- "+myResponse.getString("statusCode"));
     System.out.println("statusMessage- "+myResponse.getString("statusMessage"));
     System.out.println("ipAddress- "+myResponse.getString("ipAddress"));
     System.out.println("countryCode- "+myResponse.getString("countryCode"));
     System.out.println("countryName- "+myResponse.getString("countryName"));
     System.out.println("regionName- "+myResponse.getString("regionName"));
     System.out.println("cityName- "+myResponse.getString("cityName"));
     System.out.println("zipCode- "+myResponse.getString("zipCode"));
     System.out.println("latitude- "+myResponse.getString("latitude"));
     System.out.println("longitude- "+myResponse.getString("longitude"));
     System.out.println("timeZone- "+myResponse.getString("timeZone"));
   }
}
