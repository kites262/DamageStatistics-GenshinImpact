package ml.kites.projectDamageStatisticsGenshinImpact.test;

import ml.kites.projectDamageStatisticsGenshinImpact.data.Damage;

public class Test {

    public static void test3(){
        Damage d = new Damage();
        d.setBonus(616);                  //增伤
        d.setMultiplier(348);              //倍率
        d.setLevel(81);                     //我方等级
        d.setCritical(true);                //暴击
        d.setTargetLevel(90);               //敌方等级
        d.setTargetResistance(10);         //敌方抗性

        d.setCriticalMultiplier(159.1);
        d.setAttack(1870);
        System.out.println("黑岩战弓1 3被动" + d.getResult());
        d.setAttack(1600);
        System.out.println("黑岩战弓1 0被动" + d.getResult());

        d.setCriticalMultiplier(128.8);
        d.setAttack(1921);
        System.out.println("试作澹月1 无被动" + d.getResult());
        d.setAttack(2196);
        System.out.println("试作澹月1 有被动" + d.getResult());
        d.setAttack(2265);
        System.out.println("试作澹月2 有被动" + d.getResult());
    }
}
