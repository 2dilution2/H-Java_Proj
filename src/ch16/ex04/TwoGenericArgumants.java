package ch16.ex04;

class KeyValue<K,V> {
	private K Key;
	private V value;
	
	public K getKey() {
		return Key;
	}
	
	public void setKey (K key) {
		this.Key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
}
public class TwoGenericArgumants {

	public static void main(String[] args) {
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		KeyValue<String, Integer> kv2 = new KeyValue<>();
		
		kv2.setKey("오렌지");
		kv2.setValue(2000);
		
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		// 2. Integer, String을 args로 객체 생성
		
		KeyValue<Integer, String> kv3 = new KeyValue<>();
		
		kv3.setKey(404);
		kv3.setValue("해당요청은 거부되었습니다.");
		
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		
		// 3. args에 void를 사용하면 해당 args는 사용되지않도록 설정
		//		void의 V는 대문자
		KeyValue<String, Void> kv4 = new KeyValue<>();
		
		kv4.setKey("키값만 사용");
		
		System.out.println(kv4.getKey());
		System.out.println(kv4.getValue());		// null
	}
}
