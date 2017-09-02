package com.Util;

/**
 * Created by daibo on 2017/9/2.
 */
public class Util {
    public static String  shortText(String text){
        return text.substring(0,30)+"...";
    }

    public  static String HtmlEncode(String theString)
    {
        theString=theString.replace(">", "&gt;");
        theString=theString.replace("<", "&lt;");
        theString=theString.replace(" ", "&nbsp;");
        theString=theString.replace(" ", "&nbsp;");
        theString=theString.replace("/", "&quot;");
        theString=theString.replace("/", "&#39;");
        theString=theString.replace("/n", "<br/> ");
        return theString;
    }
}
