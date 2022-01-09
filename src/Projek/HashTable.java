/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projek;

/**
 *
 * @author ASUS
 */
//class HashTable {
//
//    private Data[] hashArray;
//    private int size;
//
//    public HashTable(int size) {
//        this.size = size;
//        hashArray = new Data[size];
//    }
//
//    public int hashFunc(int key) {
//        return key % size;
//    }
//
//    public void insert(int nik, String keperluan) {
//        Data item = new Data(nik, keperluan);
//        int key = item.getKey();
//        int hashVal = hashFunc(key);
//        while (hashArray[hashVal] != null) {
//            ++hashVal;
//            hashVal %= size;
//        }
//        hashArray[hashVal] = item;
//    }
//    
//    public String displayTable(){
//        for (int j = 0; j < size; j++) {
//            if (hashArray[j] != null) {
//                System.out.println(" | "+j+"\t | "+hashArray[j].getkeperluan()+" | ");
//            }else{
//                System.out.println(" | "+j+"\t | -- |");
//            }
//        }
//        return null;
//    }
//
//    public Data delete(int key) {
//        int hashVal = hashFunc(key);
//        while (hashArray[hashVal] != null) {
//            if (hashArray[hashVal].getKey() == key) {
//                Data temp = hashArray[hashVal];
//                hashArray[hashVal] = null;
//                return temp;
//            }
//            ++hashVal;
//            hashVal %= size;
//        }
//        return null;
//    }
//
//    public Data find(int key) {
//        int hashVal = hashFunc(key);
//        while (hashArray[hashVal] != null) {
//            if (hashArray[hashVal].getKey() == key) {
//                return hashArray[hashVal];
//            }
//            ++hashVal;
//            hashVal %= size;
//        }
//        return null;
//    }
//    public Data getAll(int i){
//        return hashArray[i];
//    }
//    
//    public String getkeperluan(int key){
//        int hashVal = hashFunc(key); 
//        while (hashArray != null) {
//            if (hashArray[hashVal].getKey() == key) { 
//                return hashArray[hashVal].getkeperluan();
//            }
//        }
//        return null; 
//    }
//}