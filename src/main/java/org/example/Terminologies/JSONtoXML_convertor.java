package org.example.Terminologies;

import org.json.*;
import org.json.XML;

public class JSONtoXML_convertor {
    public static String xml= "<?xml version=\"1.0\" ?><root><test       attribute=\"text1\">javatpoint</test><test attribute=\"text2\">JTP</test></root>";

    public static void main(String[] args) {
        try {
            JSONObject jsonObject = XML.toJSONObject(xml);
            System.out.println(jsonObject);
        }catch (JSONException e)
        {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
