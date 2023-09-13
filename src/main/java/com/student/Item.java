package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//public class Item  extends Thread{
//    @Override
//    public void run() {
//        displayItems();
//    }
//
//    int itemId;
//    String itemName;
//    ArrayList[] itemarr = new ArrayList[5];
//
//
//    public Item(int itemId, String itemName) {
//        itemarr[0].add(itemId);
//        itemarr[1].add(itemName);
//    }
//
//    public synchronized void displayItems(){
//        System.out.println("items "+itemName+" "+itemId);
//    }
//
//}
//
//class Main3{
//    public static void main(String[] args) {
//        Item t1= new Item(1,"p" );
//        Item t2 = new Item(2,"chair");
//        for(int i=0;i<6;i++){
//            t1.start();
//        }
//        t2.start();
//
//    }
//}

import java.util.ArrayList;

class Item {
    private int itemId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private String itemName;

    public Item(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public void displayItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
    }
}

class MultiThreadedItemDemo {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();

        // Create and start the first thread for writing items
        Thread writerThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                Item item = new Item(i, "Item " + i);
                synchronized (itemList) {
                    itemList.add(item);
                }
                System.out.println("Item added: " + item.getItemId());
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create and start the second thread for displaying item information
        Thread readerThread = new Thread(() -> {
            while (true) {
                synchronized (itemList) {
                    if (!itemList.isEmpty()) {
                        Item item = itemList.remove(0);
                        System.out.println("Displaying item details:");
                        item.displayItemDetails();
                    } else {
                        break; // Exit the loop when there are no more items to display
                    }
                }
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




