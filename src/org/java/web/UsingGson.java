package org.java.web;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UsingGson {


    public static void main(String[] args) throws IOException {

        String url = "http://localhost:8080/api/emp";
        String response = GetMethods.sendGET(url);
        GetMethods.filterJSONResponse(response);
    }


    public static String sendGET(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        int responseCode = httpURLConnection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            return "GET request not worked";
        }
    }

    public static void parseAndFilterJSONResponse(String jsonResponse) {
        Gson gson = new Gson();
        JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
        // Assume the JSON has a "data" array and filter based on a "desiredKey"
        if (jsonObject.has("data")) {
            jsonObject.get("data").getAsJsonArray().forEach(jsonElement -> {
                JsonObject obj = jsonElement.getAsJsonObject();
                String value = obj.get("desiredKey").getAsString(); // Adjust this based on the key you want to filter

                if (value.equals("desiredValue")) { // Adjust this based on the value you want to filter
                    System.out.println(gson.toJson(obj));
                }
            });
        }
    }
}
