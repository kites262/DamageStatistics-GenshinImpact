package ml.kites.projectDamageStatisticsGenshinImpact.formula;

import ml.kites.projectDamageStatisticsGenshinImpact.data.Damage;

public class Formula {
    public static double DamageValue(Damage damage){
        return
                damage.getAttack()
                *damage.getMultiplier()
                *(damage.getBonus()+1)
                *factorCriticalMultiplier(damage.isCritical(), damage.getCriticalMultiplier())
                *factorResistance(damage.getTargetResistance() - damage.getReduceResistance())
                *factorDefense(damage.getLevel(), damage.getTargetLevel(), damage.getReduceDefense());
    }

    public static double factorCriticalMultiplier(boolean isCritical, double criticalMultiplier){
        return isCritical?
                (criticalMultiplier+1) : 1;
    }

    public static double factorDefense(int level, int targetLevel, double reducedDefense){
        return
                (level+100) / ((level+100)+(1-reducedDefense)*(targetLevel+100));
    }

    public static double factorResistance(double resistance){
        double s;
        if(resistance > 0.75){
            s = 1 / (1+0.25* resistance);
        }else if(resistance >=0){
            s = 1 - resistance;
        }else{
            s = 1 - 0.5* resistance;
        }
        return s;
    }
}