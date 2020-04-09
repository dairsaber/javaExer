package com.yinxin.day01;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        //准备牌
        ArrayList<String> poker = new ArrayList<>();
        //花色
        String[] color = {"♠️", "❤️", "♦️", "♣️"};
        //基本牌
        String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //组装牌
        poker.add("大王");
        poker.add("小王");
        for (String num : number) {
            for (String col : color) {
                poker.add(col + num);
            }
        }
        //洗牌
        Collections.shuffle(poker);
        //准备3个玩家和一个底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //发牌
        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                dipai.add(poker.get(i));
            } else if (i % 3 == 0) {
                player01.add(poker.get(i));
            } else if (i % 3 == 1) {
                player02.add(poker.get(i));
            } else if (i % 3 == 2) {
                player03.add(poker.get(i));
            }
        }
        //看牌
        System.out.println("panafeng:" + player01);
        System.out.println("panyouxi:" + player02);
        System.out.println("zhoucheng:" + player03);
        System.out.println("dipai:" + dipai);

    }
}
