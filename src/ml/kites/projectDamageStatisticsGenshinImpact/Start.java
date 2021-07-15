package ml.kites.projectDamageStatisticsGenshinImpact;

import ml.kites.projectDamageStatisticsGenshinImpact.command.Command;
import ml.kites.projectDamageStatisticsGenshinImpact.data.Damage;
import ml.kites.projectDamageStatisticsGenshinImpact.io.Scanner;
import ml.kites.projectDamageStatisticsGenshinImpact.language.Lang;

public class Start {
    public static void main(String[] args) {
        mainLoop();
    }

    public static void mainLoop(){
        Command cmd;
        Damage da = new Damage();
/*/*
        da.setBonus(0.616);                  //增伤
        da.setMultiplier(3.48);              //倍率
        da.setLevel(81);                     //我方等级
        da.setCritical(true);                //暴击
        da.setTargetLevel(90);               //敌方等级
        da.setTargetResistance(0.1);         //敌方抗性
        da.setCriticalMultiplier(1.591);
        da.setAttack(1600);
        System.out.println(da.getResult());*/
        while(true){
            cmd = Scanner.nextCommand();
            if(cmd.getType() != Lang.command_getResult){
                da.handle(cmd.getType(), cmd.getValue());
            }else{
                System.out.println(da.getResult());
            }
        }
    }
}
