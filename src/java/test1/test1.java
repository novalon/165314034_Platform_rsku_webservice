/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import helper.LokasiHelper;
import java.util.List;
import pojos.Location;

public class test1 {
    public static void main(String[] args) {
        LokasiHelper helper = new LokasiHelper();
        List<Location> list = helper.getLocation();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getLng());
            System.out.println(list.get(i).getLat());
        }
    }
}
