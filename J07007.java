/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ex;

/**
 *
 * @author HONG NHUNG
 */
import java.util.*;
import java.io.*;
public class J07007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException{
        Scanner in = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while(in.hasNext()){
            set.add(in.next());
        }
        for(String s : set){
            System.out.println(s);
        }
    }
}
