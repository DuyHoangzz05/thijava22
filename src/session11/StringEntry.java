package session11;

public class StringEntry<V> extends KeyValue<String, V>{
    public StringEntry(String key, V value) {
        super(key, value);
    }

    public static void main(String[] args) {
        StringEntry<String> entry = new StringEntry<String>("S001","Bonh");
        String sNumber = entry.getKey();
        String sName = entry.getValue();
        System.out.printf(sNumber+""+sName);
    }
}
