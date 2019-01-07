import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        Object obj = new JSONParser().parse(new FileReader("test.json"));
        JSONArray ja = (JSONArray) obj;
        Iterator itr2 = ja.iterator();
        while (itr2.hasNext())
        {
            Iterator<Map.Entry> itr1 = ((Map) itr2.next()).entrySet().iterator();
	    while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
    }
}
