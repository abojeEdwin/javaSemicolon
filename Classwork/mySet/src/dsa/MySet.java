package dsa;


public class MySet {
    private int size = 0;
    private String items = " ";

    public boolean isEmpty() {
        return true;
    }

    public String addItem(String item) {
        return items = size++ + item;
    }

    public int size() {
        return size;
    }

    public void updateItems(String item) {
        if (item != items) {
            addItem(item);
        } else {
            items = null;
        }

    }

    public String removeDuplicates(String item) {
        for (int index = 0; index < items.length(); index++) {
            if (items.equals(item[index])){
                return items;
            }
            return null;
        }

    }

}
