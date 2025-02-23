package org.test.web;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetMethods {
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

    public static void filterJSONResponse(String jsonResponse) {
        JSONObject jsonObject = new JSONObject(jsonResponse);
        JSONArray jsonArray = jsonObject.getJSONArray("data"); // Adjust this based on the structure of the JSON response

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String value = obj.getString("desiredKey"); // Adjust this based on the key you want to filter

            if (value.equals("desiredValue")) { // Adjust this based on the value you want to filter
                System.out.println(obj.toString());
            }
        }
    }
}
