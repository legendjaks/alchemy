package com.sathy.alchemy.tool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Extract questions from Career Cup
public class CCExtract {

  private String getContent(String uri) throws Exception {

    URL url = new URL(uri);
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");

    System.out.println("Connecting to " + uri);
    int code = con.getResponseCode();
    if (code != 200) {
      con.disconnect();
      System.out.println("Failed to connect. Response code: " + code);
      return null;
    }
    System.out.println("Connected");

    BufferedReader in = new BufferedReader(new InputStreamReader(
        con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();
    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();
    con.disconnect();
    System.out.println("Read content");
    // System.out.println(response);
    return response.toString();
  }

  private void parse(String content) throws Exception {
    System.out.println("Parsing");

    BufferedWriter writer = new BufferedWriter(new FileWriter(
        "question.txt", true));

    int end = 0;
    int count = 0;
    while (true) {
      int entry = content.indexOf("<span class=\"entry\">", end);
      if (entry == -1)
        break;

      int link = content.indexOf("<a", entry);
      int start = content.indexOf("<p", link);
      end = content.indexOf("</p></a>", start);

      String hl = content.substring(link + 9, start - 2);
      String question = content.substring(start + 3, end)
          .replace("<br/><br/>", "<br/>").replace("<br/><br/>", "<br/>")
          .replace("<br/>", "\n").replace("<p>", "\n").replace("</p>", "")
          .replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&")
          .replace(";", ";\n").replace("{", "{\n").replace("//", "\n//")
          .replace("/*", "\n/*").replace("*/", "*/\n");

      writer.write("\n" + question);
      writer.write("\nhttp://www.careercup.com" + hl);
      writer.flush();
      count++;
      System.out.println("Extracted " + count + " qn");
    }
    writer.close();
    System.out.println("Completed");
  }

  public void extract(String uri) throws Exception {
    String content = getContent(uri);
    parse(content);
  }

  public static void main(String[] args) throws Exception {
    String uri = "http://www.careercup.com/page?pid=amazon-interview-questions&n=:page";

    CCExtract ex = new CCExtract();
    for (int page = 1; page <= 1; page++)
      ex.extract(uri.replace(":page", String.valueOf(page)));
  }
}
