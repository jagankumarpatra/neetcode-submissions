
class TimeMap {
    class DataNode {
        String value;
        int time;
        DataNode(String value, int time) {
            this.value = value;
            this.time = time;
        }
    }

    // Main data structure declaration
    private HashMap<String, List<DataNode>> map;

    public TimeMap() {
        // Initialize the map inside the constructor
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        // Create a new list for the key if it doesn't exist yet
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        // Append the new data point to the history list
        map.get(key).add(new DataNode(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        // If the key doesn't exist at all, return an empty string
        if (!map.containsKey(key)) {
            return "";
        }
        
        List<DataNode> list = map.get(key);
        int low = 0;
        int high = list.size() - 1;
        String result = ""; // Keeps track of the best valid value found so far
        
        // Binary search to find the largest timestamp <= requested timestamp
        while (low <= high) {
            int mid = low + (high - low) / 2;
            DataNode node = list.get(mid);
            
            if (node.time == timestamp) {
                return node.value; // Exact match found!
            } else if (node.time < timestamp) {
                result = node.value; // This time is valid, but let's check for a closer one on the right
                low = mid + 1;
            } else {
                high = mid - 1; // Too far in the future, look left
            }
        }
        
        return result;
    }
}
