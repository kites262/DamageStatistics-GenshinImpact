package ml.kites.projectDamageStatisticsGenshinImpact.data;

import ml.kites.projectDamageStatisticsGenshinImpact.formula.Formula;
import ml.kites.projectDamageStatisticsGenshinImpact.language.Lang;

public class Damage {

    private boolean isCritical;
    private double criticalRate;
    private double criticalMultiplier;

    private double attack;
    private double multiplier;
    private double bonus;
    private int level;

    private double reduceDefense;
    private double reduceResistance;
    private int targetLevel;
    private double targetResistance;


    public Damage(){
        reduceDefense = 0;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setCriticalMultiplier(double criticalMultiplier) {
        this.criticalMultiplier = criticalMultiplier;
    }

    public void setCritical(boolean critical) {
        isCritical = critical;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setReduceDefense(double reduceDefense) {
        this.reduceDefense = reduceDefense;
    }

    public void setTargetLevel(int targetLevel) {
        this.targetLevel = targetLevel;
    }

    public void setTargetResistance(double targetResistance) {
        this.targetResistance = targetResistance;
    }

    public void setCriticalRate(double criticalRate) {
        this.criticalRate = criticalRate;
    }

    public void setReduceResistance(double reduceResistance) {
        this.reduceResistance = reduceResistance;
    }

    public double getAttack() {
        return attack;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public double getBonus() {
        return bonus;
    }

    public double getCriticalMultiplier() {
        return criticalMultiplier;
    }

    public double getReduceDefense() {
        return reduceDefense;
    }

    public int getLevel() {
        return level;
    }

    public int getTargetLevel() {
        return targetLevel;
    }

    public double getTargetResistance() {
        return targetResistance;
    }

    public boolean isCritical() {
        return isCritical;
    }

    public double getCriticalRate() {
        return criticalRate;
    }

    public double getReduceResistance() {
        return reduceResistance;
    }

    public double getResult(){
        return Formula.DamageValue(this);
    }

    public void handle(String type, double value){
        switch (type){
            case Lang.attribute_criticalRate:
                setCriticalRate(value/100);
                break;
            case Lang.attribute_criticalMultiplier:
                setCriticalMultiplier(value/100);
                break;
            case Lang.attribute_multiplier:
                setMultiplier(value/100);
                break;
            case Lang.attribute_attack:
                setAttack(value);
                break;
            case Lang.attribute_bonus:
                setBonus(value/100);
                break;
            case Lang.attribute_reduceDefense:
                setReduceDefense(value/100);
                break;
            case Lang.attribute_reduceResistance:
                setReduceResistance(value/100);
                break;
            case Lang.attribute_level:
                setLevel((int)value);
                break;
            case Lang.attribute_targetLevel:
                setTargetLevel((int)value);
                break;
            case Lang.attribute_targetResistance:
                setTargetResistance(value/100);
                break;
        }
    }
}
