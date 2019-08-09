package pointoffer;

public class Ps1_replaceSpaces {

    public static void replaceBlank(char[] data, int length) {
        int newLength = length;
        for (int i = 0; i < length; i++) {
            if (data[i] == ' ') {
                newLength += 2;
            }
        }
        for (int indexOfOld = length - 1, indexOfNew = newLength - 1; indexOfOld >= 0 && indexOfOld != indexOfNew; indexOfOld--, indexOfNew--) {
            if (data[indexOfOld] == ' ') {
                data[indexOfNew--] = '0';
                data[indexOfNew--] = 'a';
                data[indexOfNew] = '%';
            } else {
                data[indexOfNew] = data[indexOfOld];
            }
        }

    }

    public static void main(String[] args)
    {
        char[] predata="who is who".toCharArray();
        System.out.println(predata);
       char[] data=new char[20];
       for(int i=0;i<predata.length;i++)
       {
           data[i]=predata[i];
       }
     System.out.println(data);
       replaceBlank(data,14);
       System.out.println(data);
    }
}
