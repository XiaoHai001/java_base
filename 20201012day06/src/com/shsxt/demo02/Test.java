package com.shsxt.demo02;

public class Test {
    public static void main(String[] args) {
        String[]names=new String[]{"刘诗海","刘龙泉","王大可","张家豪"};
        for (String s:names
             ) {
            if (s.startsWith("刘")){
                System.out.println(s);
            }
        }

        String letter="asda sdfsadasdfd ssdad hgsda byebye";
        if (letter.endsWith("byebye")){
            System.out.println("干得漂亮");
        }else{
            System.out.println("没礼貌！");
        }
    }
}
