/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map.ViDU;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author neo
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Object> arrKeys = new HashMap();
        
        // gan gia tri
        arrKeys.put("key1", "Value_key_1");
        arrKeys.put("key2", "Value_key_2");
        arrKeys.put("key3", "Value_key_3");
        
        arrKeys.get("key1");
        System.out.println(arrKeys.get("key2"));
        System.out.println(arrKeys.containsValue("Value_key_1"));
    }
}
