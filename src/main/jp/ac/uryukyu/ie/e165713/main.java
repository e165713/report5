package jp.ac.uryukyu.ie.e165713;

/**
 * Created by ichikitakahiro on 2016/12/12.
 */
public class main {
    public static void  main(String[] args){
        String str = null;
        try {
            int length = str.length();
            System.out.print(length);
        }catch(NullPointerException e){
            System.out.printf("標準エラー出力%sが発生",e.toString());
            e.printStackTrace();
        }
    }
}