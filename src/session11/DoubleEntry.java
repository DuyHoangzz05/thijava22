package session11;

public class DoubleEntry<V> extends KeyValue<String,V> {
    public DoubleEntry(String key, V value) {
        super(key, value);
    }

    public static void main(String[] args) {
        DoubleEntry<String> entry = new DoubleEntry<String>("2005","hoang");
        String Number = entry.getKey();
        String Name = entry.getValue();
        System.out.printf(Number+"" +Name);
    }
}
