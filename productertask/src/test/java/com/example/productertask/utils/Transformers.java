package com.example.productertask.utils;

import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.IOException;

public class Transformers {
    public static String from_json_to_string_line(String location) throws IOException{
        return JsonParser.parseReader(new FileReader(location)).toString();
    }
}
