public class StringWorker {

    public String cocatenate(String s1, String s2, String s3){
        return s1 + s2 + s3;
    }

    public Boolean contains(String str) {
        return str.contains(str);
    }

    public String deleteSymbol(String str, String spl) {
        String[] stringArray = str.split(spl);
        String result = "";
        for (int i = 0; i < stringArray.length; i++) {
            result += stringArray[i];
        }
        return result;
    }
}
