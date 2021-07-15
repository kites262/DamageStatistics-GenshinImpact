package ml.kites.projectDamageStatisticsGenshinImpact.io;

import ml.kites.projectDamageStatisticsGenshinImpact.command.Command;
import ml.kites.projectDamageStatisticsGenshinImpact.language.Lang;

public class Scanner {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static Command nextCommand(){
        String type = "";
        int value = -1;
        Command cmd = new Command(type, value);
        String[] s = scanner.nextLine().split(" ");
        if(s.length >=2 ){
            switch (s[0]){
                case Lang.attribute_criticalRate:
                case Lang.attribute_criticalMultiplier:
                case Lang.attribute_multiplier:
                case Lang.attribute_attack:
                case Lang.attribute_bonus:
                case Lang.attribute_reduceDefense:
                case Lang.attribute_reduceResistance:
                case Lang.attribute_level:
                case Lang.attribute_targetLevel:
                case Lang.attribute_targetResistance:{
                    try{
                        cmd.setType(s[0]);
                        cmd.setValue(Double.valueOf(s[1]));
                        System.out.println(Lang.message_submit_SUCCESSFUL + cmd.getValue());
                    }catch (Exception e) {
                        System.err.println(Lang.message_submit_FAILED_Format);
                    }
                }break;
                default:
                    System.err.println(Lang.message_submit_FAILED_Grammar);
            }
        }else if(s[0].equals(Lang.command_getResult)){
            cmd.setType(s[0]);
        }else{
            System.err.println(Lang.message_submit_FAILED_Grammar);
        }
        return cmd;
    }
}
