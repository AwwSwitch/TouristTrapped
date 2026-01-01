package weapons;

public class crowbar {
    private double damage;
    private double durability;
    private double attackspeed;

    public crowbar(double damage, double durability, double attackspeed){
        this.damage = damage;
        this.durability = durability;
        this.attackspeed = attackspeed;
    }

    protected void display_stats(){
        System.out.printf("cur damage is %.2f, durability is %.2f, attackspeed is %.2f", damage, durability, attackspeed);
    }

}