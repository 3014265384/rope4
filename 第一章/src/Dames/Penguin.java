package Dames;
/**
 * 宠物企鹅类
 * 示例二 示例四
 */

public class Penguin {
    String name="无名氏";//昵称，默认无名氏
    int health=100;//健康值，默认100
    int love=0;//亲密度
    final  String SEX_MAIE="Q仔";
    final  String SEX_FEMAIE="Q妹";
    String sex=SEX_MAIE;

    /**
     * 输出企鹅信息
     */
    public  void  print(){
        System.out.println("宠物的自白：\n我的名字叫"+this.name+"健康值是"+this.health+"，和主人的亲密度是是"+this.love+",性别是"+this.sex+"。");
    }
}
