package dsa;

import java.util.Objects;

public class MyListString {
    private String [] items = new String[4];
    private int size = 0;

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int indexOfItem(String item) {
        for (int index = 0; index < items.length; index++) {
            if (item.equals(items[index])) {
                return index;
            }
        }
        return -1;
    }

    public void addItem(String item) {items[size++] = item;if(isFull()) extendList();}

    public boolean isFull(){return size == items.length;}

    public void extendList(){
        String [] newItems = new String[size * 2];
        System.arraycopy(items, 0, newItems, 0, size);
        items = newItems;
    }

    public boolean isContainItem(String item) {
       for(String item1 : items) {
           if(Objects.equals(item1, item)) return true;
       }
       return false;
    }

    public void removeItem(String item) {
       int itemIndex = findItemIndex(item);
        if(itemIndex != -1){
            items[itemIndex]= null;
            addPreviItemToNewList(itemIndex);
            size--;
        }
    }

    private void addPreviItemToNewList(int itemIndex) {
        String[] previItems = new String[items.length];
        for(String item : items){
            if(item != null){
                previItems[itemIndex] = item;
            }
        }
        items = previItems;

    }

    private int findItemIndex(String item) {
        for(int i = 0; i < items.length; i++){
            if(items[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    public MyListString() {
        this.items = items;
        this.size = 0;
    }


    public int size() {
        return size;
    }

    public void clearItems() {
          if(isContainItem(items[0])) {
              removeItem(items[0]);
          }
    }
}
