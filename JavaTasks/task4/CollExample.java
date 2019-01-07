import java.util.*;

class CollExample{
    public static void main (String[] args){
	Map<String,Long> m= new HashMap<>();
	m.put("Akash",9457638535L);
	m.put("Boss",6757638537L);
	m.put("Pratap",7865638530L);
	m.put("Zoya",8045890436L);
/*
	System.out.println(m);

	Set<Map.Entry<String,Long>> values=m.entrySet();
	for(Map.Entry<String,Long> e: values){
		System.out.println(e.getKey()+" : "+e.getValue());
		e.setValue(9000000009L);
	}

	System.out.println(m);

	Set<String> keys=m.keySet();
	for(String i: keys){
		System.out.println(i+": "+m.get(i));
	}
*/
	Set<Long> v=new HashSet<>(m.values());
	for(Long i: v){
                System.out.println(i);
        }

    }
}
