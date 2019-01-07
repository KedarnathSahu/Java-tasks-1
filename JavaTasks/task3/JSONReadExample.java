import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JSONReadExample
{
    public static void main(String[] args) throws Exception
    {
        Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
	JSONObject jo = (JSONObject) obj;

        System.out.println((String) jo.get("firstName"));
        System.out.println((String) jo.get("lastName"));
        System.out.println((long) jo.get("age"));

	System.out.println("\naddress:");
        Map address = ((Map)jo.get("address"));
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
	while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

	System.out.println("\nphoneNumbers:");
        JSONArray ja = (JSONArray) jo.get("phoneNumbers");
        Iterator itr2 = ja.iterator();
        while (itr2.hasNext())
        {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
	    while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
    }
}
