package com.jiaboyan.lianbiao;

import java.util.Random;

/**
 * Created by jiabo on 2016/3/6.
 * 初始化链表
 */
public class  InitLink {
    //初始化;
    public static Link init(int count){
        return init(count,Integer.MAX_VALUE);
    }
    //第一个参数是链表的元素数量，第二个是链表中元素的最大值
    public static Link init(int count,int maxValue){
        Link link=new Link();
        Link temp=link;
        temp.setValue(Integer.MIN_VALUE);
        Random random=new Random();
        for(int x=0;x<count;x++){
            Link nodeLink=new Link();
            nodeLink.setValue(random.nextInt(maxValue));
            temp.setNextLink(nodeLink);
            temp=nodeLink;
        }
        temp.setNextLink(null);
        return link;
    }
    //打印链表的内容
    public static void printLink(Link link){
        if(link==null || link.getNextLink()==null){
            System.out.println("链表元素为空");
            return ;
        }
        Link temp=link.getNextLink();
        StringBuffer sb=new StringBuffer();
        while(temp!=null){
            sb.append(temp.getValue()+",");
            temp=temp.getNextLink();
        }
        System.out.println(sb.substring(0,sb.length()-1));
    }
    public static void main(String[] args){
        Link link=init(10);
        printLink(link);
    }


}
