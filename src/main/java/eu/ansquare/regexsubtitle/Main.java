package eu.ansquare.regexsubtitle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the text");
            String input = "";
            String line;
            while((line = reader.readLine()) != null){
                if(line.equalsIgnoreCase("336")){
                    break; // if an input is empty, break
                }
                input += line;
            }
            reader.close();
            String o = input.replaceAll("<c.textWhite>", "");

            o = o.replaceAll("<c.textYellow>", "");
            o = o.replaceAll("<c.textCyan>", "");
            o = o.replaceAll("</c>", "");
            o = o.replaceAll("align:middle", "");
            o = o.replaceAll("\\d", "");
            o = o.replaceAll("::. --> ::. ", "");
            o = o.replaceAll("\n", "");
            o = o.replaceAll("WEBVVT", "");
            // Use results...
            System.out.println(o);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}