package com.jiaboyan.lianbiao;

/**
 * Created by jiabo on 2016/3/6.
 * 对链表进行操作：
 */
public class LinkTest {
    //获取链表中间元素：
    //采用两个游标的方式，第一个游标每次前进两步，第二个游标每次前进一步，
    // 当第一个游标到最后时，第二个游标就是中间位置。需要注意的是，如果链表元素的个数是偶数，那么中间元素应该是两个。
    public static void findMiddleElement(Link link){
        if(link==null || link.getNextLink()==null){
            System.out.println("链表为空");
            return;
        }
        if(link.getNextLink().getNextLink()==null){
            System.out.println("链表只有一个元素");
            return;
        }
        Link fast=link.getNextLink();
        Link slow=link.getNextLink();

        while(fast.getNextLink()!=null && fast.getNextLink().getNextLink()!=null){
            fast= fast.getNextLink().getNextLink();
            slow=slow.getNextLink();
        }
        //fast到最后一个元素，链表个数为奇数
        if(fast!=null&&fast.getNextLink()==null){
            System.out.println(slow.getValue());
        }else {
            //链表个数为偶数
            System.out.println(slow.getValue());
            System.out.println(slow.getNextLink().getValue());

        }
    }
}
