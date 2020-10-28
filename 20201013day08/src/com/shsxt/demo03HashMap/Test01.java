package com.shsxt.demo03HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        Set<String > inviteName=new HashSet<>();
        //邀请人名单
        String[]names=new String[]{"张三","李四","王五","赵六","孙七"};
        inviteName.addAll(Arrays.asList(names));
        System.out.println("受邀请的人："+inviteName);
        //来的人
        String[]namesCome=new String[]{"张三","李四","马云","马化腾"};
        //收到邀请来的
        Set<String>observeName=new HashSet<>();
        //没收到邀请来的
        Set<String>otherName=new HashSet<>();
        for (String s : namesCome) {
            if (inviteName.contains(s)) {
                observeName.add(s);
                inviteName.remove(s);
            }else{
                System.out.println("没受到邀请，让"+s+"走");
                otherName.add(s);
            }
        }

        //缺席名单
        Set<String>absent=inviteName;
        System.out.println("受邀请来的人："+observeName);
        System.out.println("缺席的人："+absent);
        System.out.println("没受邀请来的人："+otherName);
    }
}
