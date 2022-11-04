import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Offer50 {


    //剑指 Offer 50. 第一个只出现一次的字符
    /**
     *  1 只出现一次 （哈希表对字符计数）
     *  2 第一个出现 （需要按照顺序遍历字符串）
     *  字符串得到字符  根据索引 s.charAt(i)
     *
     *  字符串转为字符数组  s.toCharArray();
     */
    public static char firstUniqChar(String s) {
       char res=' ';
       Map<String,Integer> map=new HashMap<>();
        char[] chars = s.toCharArray();
        //计数
        for(char i:chars){
            Integer num=map.get(String.valueOf(i));
            if(num==null){
                map.put(String.valueOf(i),1);

            }else{
                map.put(String.valueOf(i),++num);

            }
        }

//        //遍历map map 无序 无法找到第一次出现的
//        Set<String> strings = map.keySet();
//        for(String it:strings){
//            if(map.get(it)==1){
//                res=it.charAt(0);
//            }
//
//        }

        //2第一次出现
        //字符串得到字符  根据索引
        for(int i=0;i<chars.length;i++){
            Integer num=map.get(String.valueOf(s.charAt(i)));
            if(num!=null&&num==1){
               res=s.charAt(i);
               return res;

            }
        }

        return res;
    }


    public static void main(String[] args) {

        List<String> stringList=initTestCases();
        for(String s:stringList){
            char result=firstUniqChar(s);
            System.out.println("testCase="+s+"   result="+result);

        }


    }

    public static List<String> initTestCases(){
        List<String> list=new ArrayList<>();
        list.add("aa12344");
        list.add("leecode");
        return list;
    }
}
