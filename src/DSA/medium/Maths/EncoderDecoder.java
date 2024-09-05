package DSA.medium.Maths;

import java.util.HashMap;
import java.util.Map;

public class EncoderDecoder {

    String in= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    Map<String,String> encode = new HashMap<>();
    Map<String,String> decode = new HashMap<>();
    private String getCode(String s){
        char[] tiny = new char[6];
        for (int i=0;i<6;i++){
            tiny[i]=in.charAt((int) (Math.random() *62));
        }


        return "http://tinyUrl/"+String.valueOf(tiny);
    }

    public String encode(String url){

        if(encode.containsKey(url)){
            return  encode.get(url);
        }else{
            String code = getCode(url);
            while(decode.containsKey(code)){
                code = getCode(url);
            }
            decode.put(code,url);
            encode.put(url ,code);
            return code;
        }


    }

    public String dncode(String url){


            return  decode.get(url);



    }
    public static void main(String args[]){
       EncoderDecoder encoderDecoder = new EncoderDecoder();

        String url ="http://www.bbxbbw.com/home/man";
        System.out.println("  "+encoderDecoder.encode(url));


    }
}
